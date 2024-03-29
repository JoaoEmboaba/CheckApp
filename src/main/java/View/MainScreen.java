
package View;

import Model.Project;
import Controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Controller.ProjectController;
import java.util.List;

/**
 *
 * @author jvemboaba
 */
public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;

    DefaultListModel<Project> projectModel;

    public MainScreen() {
        initComponents();
        decorateTableTask();

        initDataController();
        initComponentsModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        JPanelList1 = new javax.swing.JPanel();
        jLabelEmptyIcon = new javax.swing.JLabel();
        jLabelEmptyListIcon = new javax.swing.JLabel();
        jLabelEmptyListSubtitle = new javax.swing.JLabel();
        jPanelToolBar = new javax.swing.JPanel();
        jToolBarTitle = new javax.swing.JLabel();
        jToolBarSubtitle = new javax.swing.JLabel();
        jPainelProjects = new javax.swing.JPanel();
        jlabelProjectsTitle = new javax.swing.JLabel();
        jLabelProjectsAdd = new javax.swing.JLabel();
        jPanelTasks = new javax.swing.JPanel();
        jTasksTitle = new javax.swing.JLabel();
        jTasksAdd = new javax.swing.JLabel();
        JPainelProjectList = new javax.swing.JPanel();
        jListProjects = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanelEmptyList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        jLabel4.setText("jLabel4");

        JPanelList1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelEmptyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartphone.png"))); // NOI18N

        jLabelEmptyListIcon.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabelEmptyListIcon.setForeground(new java.awt.Color(102, 102, 255));
        jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListIcon.setText("Nenhuma tarefa por aqui :D");

        jLabelEmptyListSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmptyListSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmptyListSubtitle.setText("Clique no botão \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout JPanelList1Layout = new javax.swing.GroupLayout(JPanelList1);
        JPanelList1.setLayout(JPanelList1Layout);
        JPanelList1Layout.setHorizontalGroup(
                JPanelList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelList1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(JPanelList1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabelEmptyIcon, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(120, 120, 120))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelList1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 221,
                                        Short.MAX_VALUE)
                                .addGap(164, 164, 164)));
        JPanelList1Layout.setVerticalGroup(
                JPanelList1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanelList1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabelEmptyIcon, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(80, Short.MAX_VALUE)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 700));
        setMinimumSize(new java.awt.Dimension(400, 200));

        jPanelToolBar.setBackground(new java.awt.Color(153, 153, 255));

        jToolBarTitle.setFont(new java.awt.Font("Yu Gothic Light", 3, 36)); // NOI18N
        jToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        jToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check-up-medico (2).png"))); // NOI18N
        jToolBarTitle.setText(" CheckApp");

        jToolBarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        jToolBarSubtitle.setText("Write everything, forget nothing");

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
                jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelToolBarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelToolBarLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanelToolBarLayout.setVerticalGroup(
                jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelToolBarLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToolBarSubtitle)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPainelProjects.setBackground(new java.awt.Color(204, 204, 204));
        jPainelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jlabelProjectsTitle.setForeground(new java.awt.Color(102, 102, 255));
        jlabelProjectsTitle.setText("Projects");

        jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais (1).png"))); // NOI18N
        jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectsAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPainelProjectsLayout = new javax.swing.GroupLayout(jPainelProjects);
        jPainelProjects.setLayout(jPainelProjectsLayout);
        jPainelProjectsLayout.setHorizontalGroup(
                jPainelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelProjectsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 157,
                                        Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)));
        jPainelProjectsLayout.setVerticalGroup(
                jPainelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPainelProjectsLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPainelProjectsLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanelTasks.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTasksTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTasksTitle.setForeground(new java.awt.Color(102, 102, 255));
        jTasksTitle.setText("Tasks");

        jTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais (1).png"))); // NOI18N
        jTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTasksAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
        jPanelTasks.setLayout(jPanelTasksLayout);
        jPanelTasksLayout.setHorizontalGroup(
                jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 378,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86,
                                        Short.MAX_VALUE)
                                .addComponent(jTasksAdd)
                                .addGap(14, 14, 14)));
        jPanelTasksLayout.setVerticalGroup(
                jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTasksLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelTasksLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTasksAdd, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        JPainelProjectList.setBackground(new java.awt.Color(204, 204, 204));
        JPainelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setBackground(new java.awt.Color(204, 204, 204));
        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(50);
        jList1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jListProjects.setViewportView(jList1);

        javax.swing.GroupLayout JPainelProjectListLayout = new javax.swing.GroupLayout(JPainelProjectList);
        JPainelProjectList.setLayout(JPainelProjectListLayout);
        JPainelProjectListLayout.setHorizontalGroup(
                JPainelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPainelProjectListLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jListProjects)
                                .addContainerGap()));
        JPainelProjectListLayout.setVerticalGroup(
                JPainelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPainelProjectListLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jListProjects, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                .addContainerGap()));

        jPanelEmptyList.setBackground(new java.awt.Color(204, 204, 204));
        jPanelEmptyList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Nome", "Descrição", "Prazo", "Tarefa Concluída"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean[] {
                    false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTableTasks.setToolTipText("");
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(50);
        jTableTasks.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTableTasks);

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
                jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1));
        jPanelEmptyListLayout.setVerticalGroup(
                jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPainelProjects, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JPainelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelEmptyList, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPainelProjects, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JPainelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelEmptyList, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabelProjectsAddMouseClicked

        // Torna o caixa de dialogo criada visível para o usuário
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
    }// GEN-LAST:event_jLabelProjectsAddMouseClicked

    private void jTasksAddMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTasksAddMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        // taskDialogScreen.setProject(null);
        taskDialogScreen.setVisible(true);
    }// GEN-LAST:event_jTasksAddMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPainelProjectList;
    private javax.swing.JPanel JPanelList1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelEmptyIcon;
    private javax.swing.JLabel jLabelEmptyListIcon;
    private javax.swing.JLabel jLabelEmptyListSubtitle;
    private javax.swing.JLabel jLabelProjectsAdd;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jListProjects;
    private javax.swing.JPanel jPainelProjects;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JPanel jPanelTasks;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JLabel jTasksAdd;
    private javax.swing.JLabel jTasksTitle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jToolBarSubtitle;
    private javax.swing.JLabel jToolBarTitle;
    private javax.swing.JLabel jlabelProjectsTitle;

    // End of variables declaration//GEN-END:variables
    public void decorateTableTask() {

        // Customizando o header da table de tarefas
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(153, 153, 255));
        jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
        // Criando um sort automático para as colunas da table
        jTableTasks.setAutoCreateRowSorter(true);

    }

    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();

    }

    public void initComponentsModel() {
        projectModel = new DefaultListModel<Project>();
        loadProjects();

    }

    public void loadProjects() {
    }

    List<Project> projects;

        projectModel.clear();

        for (int i = 0; i < projects.size() - 1; i++) {

            Project project = projects.get(i);
            projectModel.addElement(project);
        }
    }

}
