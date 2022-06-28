
package ProjectApp001;

import java.sql.Connection;
import java.sql.DriverManager;
import Model.Task;
import controller.TaskController;
import java.util.Date;
import java.sql.SQLException;
import Model.Project;
import controller.ProjectController;
import java.util.Scanner;


public class App {
    
    public static void main(String[] args) throws SQLException {

       TaskController taskController = new TaskController();
       
       Task task = new Task();
       Scanner read = new Scanner(System.in);

       /*task.setIdProject(9);
       task.setName("Task01");
       task.setDescription("test commands for\nthe new application");
       task.setNotes("Nothing to say for while");
       task.setCompleted(true);
       task.setDeadline(new Date());
       taskController.save(task);
       */
       
       
       /*task.setId(7);
       task.setIdProject(11);
       task.setName("Task02");
       task.setDescription("Test commands\nof the application");
       task.setNotes("Without notes for while");
       task.setCompleted(true);
       
       taskController.update(task);
       
      
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        
        /*project.setId(9);
        project.setName("Project001");
        project.setDescription("Test commands for\nthe new task");
        projectController.update(project);
        */
        
       /*project.setId(9);
       project.setName("Project01");
       project.setDescription("Comando feito para\ntestar a aplicação");
       projectController.update(project);
       */
    }
}
