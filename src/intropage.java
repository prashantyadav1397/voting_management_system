
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;



public class intropage extends javax.swing.JFrame {

   
    public intropage() {
        initComponents();
       
    }
        public void close()
    {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        intropage = new javax.swing.JPanel();
        election_voting = new javax.swing.JLabel();
        management = new javax.swing.JLabel();
        system = new javax.swing.JLabel();
        RITWICK = new javax.swing.JLabel();
        USN1 = new javax.swing.JLabel();
        HOME = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        GUIDE = new javax.swing.JLabel();
        bacground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 540));

        intropage.setMinimumSize(new java.awt.Dimension(930, 540));
        intropage.setName(""); // NOI18N
        intropage.setLayout(null);

        election_voting.setBackground(new java.awt.Color(255, 255, 255));
        election_voting.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        election_voting.setForeground(new java.awt.Color(255, 255, 255));
        election_voting.setText("ELECTION VOTING");
        intropage.add(election_voting);
        election_voting.setBounds(250, 120, 420, 64);

        management.setBackground(new java.awt.Color(255, 255, 255));
        management.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        management.setForeground(new java.awt.Color(255, 255, 255));
        management.setText("MANAGMENT");
        intropage.add(management);
        management.setBounds(290, 170, 348, 64);

        system.setBackground(new java.awt.Color(255, 255, 255));
        system.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        system.setForeground(new java.awt.Color(255, 255, 255));
        system.setText("SYSTEM");
        intropage.add(system);
        system.setBounds(360, 220, 219, 64);

        RITWICK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RITWICK.setForeground(new java.awt.Color(240, 240, 240));
        RITWICK.setText("PRASHANT YADAV");
        RITWICK.setMaximumSize(new java.awt.Dimension(100, 24));
        intropage.add(RITWICK);
        RITWICK.setBounds(410, 360, 170, 15);

        USN1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        USN1.setForeground(new java.awt.Color(240, 240, 240));
        USN1.setText("1SG15CS072");
        USN1.setMaximumSize(new java.awt.Dimension(100, 24));
        intropage.add(USN1);
        USN1.setBounds(410, 380, 150, 15);

        HOME.setBackground(new java.awt.Color(153, 102, 255));
        HOME.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HOME.setText("HOME");
        HOME.setToolTipText("");
        HOME.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });
        intropage.add(HOME);
        HOME.setBounds(320, 450, 102, 25);

        EXIT.setBackground(new java.awt.Color(153, 102, 255));
        EXIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        intropage.add(EXIT);
        EXIT.setBounds(480, 450, 99, 25);

        GUIDE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE.setForeground(new java.awt.Color(240, 240, 240));
        GUIDE.setText("SUBMITTED BY:-");
        GUIDE.setMaximumSize(new java.awt.Dimension(100, 24));
        intropage.add(GUIDE);
        GUIDE.setBounds(410, 340, 170, 15);

        bacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Election+Background[1].jpg"))); // NOI18N
        intropage.add(bacground);
        bacground.setBounds(0, 0, 990, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(intropage, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(intropage, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        close();
        new home().setVisible(true);
    }//GEN-LAST:event_HOMEActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(intropage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intropage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intropage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intropage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intropage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel GUIDE;
    private javax.swing.JButton HOME;
    private javax.swing.JLabel RITWICK;
    private javax.swing.JLabel USN1;
    private javax.swing.JLabel bacground;
    private javax.swing.JLabel election_voting;
    private javax.swing.JPanel intropage;
    private javax.swing.JLabel management;
    private javax.swing.JLabel system;
    // End of variables declaration//GEN-END:variables
}
