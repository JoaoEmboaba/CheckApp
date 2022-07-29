package Controller;

import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Project;
import Model.Task;
import java.sql.Date;

public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT INTO projectsapp"
                + "(name, description, createdAt,"
                + "updateAt) VALUES (?, ?, ?, ?)";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setString(1, project.getName());
            state.setString(2, project.getDescription());
            state.setDate(3, new Date(project.getCreatedAt().getTime()));
            state.setDate(4, new Date(project.getUpdateAt().getTime()));
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Error saving project", ex);
        } finally {
            try {
                if (cnn != null) {
                    cnn.close();
                }
                if (state != null) {
                    state.close();
                }

            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
            }
        }
    }

    public void update(Project project) throws SQLException {

        String sql = "UPDATE projectsapp SET name = ?,"
                + "description = ?, "
                + "createdAt = ?,"
                + "updateAt = ? "
                + "WHERE id = ?";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setInt(1, project.getId());
            state.setString(2, project.getName());
            state.setString(3, project.getDescription());
            state.setDate(4, new Date(project.getCreatedAt().getTime()));
            state.setDate(5, new Date(project.getUpdateAt().getTime()));
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar o projeto" + ex.getMessage(), ex);
        } finally {
            try {
                if (cnn != null) {
                    cnn.close();
                }
                if (state != null) {
                    state.close();
                }

            } catch (SQLException ex) {
                throw new RuntimeException("erro ao fechar a conexão com a db", ex);
            }
        }
    }

    public void removeById(int id) {

        String sql = "DELETE FROM projectsapp WHERE id = ?";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setInt(1, id);
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao excluir tarefa", ex);

        } finally {
            try {
                if (cnn != null) {
                    cnn.close();
                }
                if (state != null) {
                    state.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
    }

    
    public List<Task> getAll(int idProject) {
        
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection cnn = null;
        PreparedStatement state = null;
        ResultSet RS = null;
        
        //Lista de tarefas que será devolvida quando a chamada do método acontecer
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setInt(1, idProject);
            RS = state.executeQuery();
            
            while(RS.next()) {
                
                Task task = new Task();
                task.setId(RS.getInt("id"));
                task.setIdProject(RS.getInt("idProject"));
                task.setName(RS.getString("name"));
                task.setDescription(RS.getString("description"));
                task.setNotes(RS.getString("notes"));
                task.setCompleted(RS.getBoolean("completed"));
                task.setDeadline(RS.getDate("deadline"));
                task.setCreateAt(RS.getDate("createdAt"));
                task.setUpdateAt(RS.getDate(("updateAt")));
                
                tasks.add(task);                
            }            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao mostrar a tarefa", ex);
        }finally{
            ConnectionFactory.closeConnection(cnn, state, RS);
        }
        return tasks;
    }
  }
    
