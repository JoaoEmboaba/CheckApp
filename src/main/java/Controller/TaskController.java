package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.Task;
import Util.ConnectionFactory;
import java.sql.Date;

/**
 *
 * @author Marcio Michelluzzi
 */
public class TaskController {

    public void save(Task task) {
        String sql = "INSERT INTO tasks(idProject, name, description, completed, notes,"
                + "deadline, createAt, updateAt)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setInt(1, task.getIdProject());
            state.setString(2, task.getName());
            state.setString(3, task.getDescription());
            state.setBoolean(4, task.isCompleted());
            state.setString(5, task.getNotes());
            state.setDate(6, new Date(task.getDeadline().getTime()));
            state.setDate(7, new Date(task.getCreateAt().getTime()));
            state.setDate(8, new Date(task.getUpdateAt().getTime()));
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar tarefa", ex);
        } finally {
            try {
                if (cnn != null) {
                    cnn.close();
                }
                if (state != null) {
                    state.close();
                }

            } catch (Exception ex) {
                throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
            }
        }
    }

    public void update(Task task) throws SQLException {

        String sql = "UPDATE tasks SET idProject = ?,"
                + "name = ?,"
                + "description = ?,"
                + "completed = ?,"
                + "notes = ?,"
                + "deadLine = ?,"
                + "createAt = ?,"
                + "updateAt = ?"
                + "WHERE id = ?";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);
            state.setInt(1, task.getIdProject());
            state.setString(2, task.getName());
            state.setString(3, task.getDescription());
            state.setBoolean(4, task.isCompleted());
            state.setString(5, task.getNotes());
            state.setDate(6, new Date(task.getDeadline().getTime()));
            state.setDate(7, new Date(task.getCreateAt().getTime()));
            state.setDate(8, new Date(task.getUpdateAt().getTime()));
            state.setInt(9, task.getId());
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tarefa", ex);
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

    public void removeById(int id) {
        String sql = "DELETE FROM tasks WHERE id = ?";

        Connection cnn = null;
        PreparedStatement state = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);

            state.setInt(1, id);
            state.execute();

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tarefa" + ex.getMessage(), ex);
        } finally {
            try {
                if (cnn != null) {
                    cnn.close();
                }
                if (state != null) {
                    state.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão");
            }
        }
    }

        public List<Task> getAll() {
        String sql = "SELECT * FROM tasks";

        List<Task> tasks = new ArrayList<>();

        Connection conn = null;
        PreparedStatement stmt = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            conn = ConnectionFactory.getConnection();
            stmt = conn.prepareStatement(sql);

            rset = stmt.executeQuery();

            //Enquanto existir dados no banco de dados, fa�a
            while (rset.next()) {

                Task task = new Task();

                task.setId(rset.getInt("id"));
                task.setIdProject(rset.getInt("idProject"));
                task.setName(rset.getString("name"));
                task.setDescription(rset.getString("description"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setNotes(rset.getString("notes"));
                task.setDeadline(rset.getDate("deadline"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setCreateAt(rset.getDate("createAt"));
                task.setUpdateAt(rset.getDate("updateAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a conexão", ex);
            }
        }
        return tasks;
    }

    public List<Task> getByProjectId(int id) {
        String sql = "SELECT * FROM tasks where idProject = ?";

        List<Task> tasks = new ArrayList<>();

        Connection cnn = null;
        PreparedStatement state = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet rset = null;

        try {
            cnn = ConnectionFactory.getConnection();
            state = cnn.prepareStatement(sql);

            state.setInt(1, id);

            rset = state.executeQuery();

            //Enquanto existir dados no banco de dados, fa�a
            while (rset.next()) {

                Task task = new Task();

                task.setId(rset.getInt("id"));
                task.setIdProject(rset.getInt("idProject"));
                task.setName(rset.getString("name"));
                task.setDescription(rset.getString("description"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setNotes(rset.getString("notes"));
                task.setDeadline(rset.getDate("deadline"));
                task.setCompleted(rset.getBoolean("completed"));
                task.setCreateAt(rset.getDate("createAt"));
                task.setUpdateAt(rset.getDate("updateAt"));

                //Adiciono o contato recuperado, a lista de contatos
                tasks.add(task);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar as tarefas", ex);
        } finally {
            ConnectionFactory.closeConnection(cnn, state, rset);
        }
        return tasks;
    }
}
