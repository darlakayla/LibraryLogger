package InternalPages;


import InternalPages.generatedailylogs;
import InternalPages.libraryDashbord;
import InternalPages.studentInfo;
import InternalPages.updateLogs;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
        initComponents();
    }
    Color navcolor= new Color(153,153,255);
    Color headcolor= new Color(204,204,255);    
    Color bodycolor = new Color(102,102,255);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        mimimize = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        firstname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        studentinfo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updatelogs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        generate = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        maindesktop = new javax.swing.JDesktopPane();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        header.setBackground(new java.awt.Color(204, 204, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        header.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 40));

        mimimize.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        mimimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mimimize.setText("—");
        mimimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mimimizeMouseClicked(evt);
            }
        });
        header.add(mimimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 50));

        jPanel1.add(header);
        header.setBounds(200, 0, 630, 50);

        navbar.setBackground(new java.awt.Color(153, 153, 255));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        navbar.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/USER (1).png"))); // NOI18N
        navbar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 50));

        settings.setBackground(new java.awt.Color(153, 153, 255));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SETTINGS");
        settings.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 28));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/settingsss (1).png"))); // NOI18N
        settings.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        navbar.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 50));

        studentinfo.setBackground(new java.awt.Color(153, 153, 255));
        studentinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentinfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentinfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentinfoMouseExited(evt);
            }
        });
        studentinfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("STUDENT INFO");
        studentinfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("INPUT");
        studentinfo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 0, 90, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/studentinfo (1).png"))); // NOI18N
        studentinfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        navbar.add(studentinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        updatelogs.setBackground(new java.awt.Color(153, 153, 255));
        updatelogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatelogsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatelogsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatelogsMouseExited(evt);
            }
        });
        updatelogs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UPDATE LOGS");
        updatelogs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 100, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/daily logs (1).png"))); // NOI18N
        updatelogs.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        navbar.add(updatelogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 200, 50));

        dashboard.setBackground(new java.awt.Color(153, 153, 255));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DASHBOARD");
        dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, 28));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIBRARY ");
        dashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 0, 120, 28));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lib dashboard (1).png"))); // NOI18N
        dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        navbar.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, 50));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("WELCOME!");
        navbar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 20));

        generate.setBackground(new java.awt.Color(153, 153, 255));
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMouseExited(evt);
            }
        });
        generate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("GENERATE ");
        generate.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 95, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DAILY LOGS ");
        generate.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 95, 28));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/daily logs (1).png"))); // NOI18N
        generate.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        navbar.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 50));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 200, 440);

        maindesktop.setBackground(new java.awt.Color(102, 102, 255));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("LOGGER");
        maindesktop.add(jLabel17);
        jLabel17.setBounds(0, 190, 630, 50);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 2, 45)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("LIBRARY");
        maindesktop.add(jLabel18);
        jLabel18.setBounds(0, 140, 630, 50);

        jPanel1.add(maindesktop);
        maindesktop.setBounds(200, 50, 630, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mimimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mimimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_mimimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
       if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_exitMouseClicked

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(bodycolor);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(navcolor);
    }//GEN-LAST:event_settingsMouseExited

    private void studentinfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentinfoMouseEntered
        studentinfo.setBackground(bodycolor);
    }//GEN-LAST:event_studentinfoMouseEntered

    private void studentinfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentinfoMouseExited
        studentinfo.setBackground(navcolor);
    }//GEN-LAST:event_studentinfoMouseExited

    private void updatelogsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatelogsMouseEntered
        updatelogs.setBackground(bodycolor);
    }//GEN-LAST:event_updatelogsMouseEntered

    private void updatelogsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatelogsMouseExited
        updatelogs.setBackground(navcolor);
    }//GEN-LAST:event_updatelogsMouseExited

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(bodycolor);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(navcolor);
    }//GEN-LAST:event_dashboardMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        libraryDashbord lb = new libraryDashbord();
        maindesktop.add(lb).setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseEntered
        generate.setBackground(bodycolor);
    }//GEN-LAST:event_generateMouseEntered

    private void generateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseExited
        generate.setBackground(navcolor);
    }//GEN-LAST:event_generateMouseExited

    private void studentinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentinfoMouseClicked
        studentInfo si = new studentInfo();
        maindesktop.add(si).setVisible(true);
    }//GEN-LAST:event_studentinfoMouseClicked

    private void generateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseClicked
        generatedailylogs ge = new generatedailylogs();
        maindesktop.add(ge).setVisible(true);
    }//GEN-LAST:event_generateMouseClicked

    private void updatelogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatelogsMouseClicked
        updateLogs ul = new updateLogs();
        maindesktop.add(ul).setVisible(true);
    }//GEN-LAST:event_updatelogsMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        settings se = new settings();
        maindesktop.add(se).setVisible(true);
    }//GEN-LAST:event_settingsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exit;
    public static javax.swing.JLabel firstname;
    private javax.swing.JPanel generate;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JLabel mimimize;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel studentinfo;
    private javax.swing.JPanel updatelogs;
    // End of variables declaration//GEN-END:variables
}
