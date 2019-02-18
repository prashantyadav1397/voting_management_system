
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHOK KUMAR YADAV
 */
public class VVoter_fncv extends javax.swing.JFrame {

     Connection con=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    public VVoter_fncv() {
        initComponents();
         cv.removeAll();
      
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

        options = new javax.swing.JPanel();
        result = new javax.swing.JButton();
        manifesto = new javax.swing.JButton();
        pollstn = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        vote = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        GUIDE6 = new javax.swing.JLabel();
        background12 = new javax.swing.JLabel();
        cv = new javax.swing.JPanel();
        background13 = new javax.swing.JLabel();
        cvote = new javax.swing.JPanel();
        partyid = new javax.swing.JTextField();
        canid = new javax.swing.JTextField();
        inReset2 = new javax.swing.JButton();
        c_id = new javax.swing.JLabel();
        v_id = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        voterid = new javax.swing.JTextField();
        p_id = new javax.swing.JLabel();
        GUIDE7 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 540));
        getContentPane().setLayout(null);

        options.setBackground(new java.awt.Color(51, 51, 51));

        result.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        result.setText("RESULTS");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        manifesto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manifesto.setText("MANIFESTO");
        manifesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manifestoActionPerformed(evt);
            }
        });

        pollstn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pollstn.setText("POLL STATIONS");
        pollstn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollstnActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setPreferredSize(null);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        vote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vote.setText("CAST VOTE");
        vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteActionPerformed(evt);
            }
        });

        logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout1.setText("LOGOUT");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manifesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pollstn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pollstn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        getContentPane().add(options);
        options.setBounds(0, 0, 230, 540);

        separator.setForeground(new java.awt.Color(255, 255, 255));
        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        separator.setFocusable(true);
        separator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        separator.setOpaque(true);
        separator.setPreferredSize(new java.awt.Dimension(1, 0));
        getContentPane().add(separator);
        separator.setBounds(226, 0, 2, 540);

        GUIDE6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE6.setForeground(new java.awt.Color(255, 255, 255));
        GUIDE6.setText("WELCOME TO THE VOTER DASHBOARD");
        GUIDE6.setMaximumSize(new java.awt.Dimension(100, 24));
        getContentPane().add(GUIDE6);
        GUIDE6.setBounds(630, 20, 290, 15);

        background12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        background12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background12.setInheritsPopupMenu(false);
        background12.setMaximumSize(new java.awt.Dimension(930, 540));
        background12.setMinimumSize(new java.awt.Dimension(0, 0));
        background12.setPreferredSize(new java.awt.Dimension(930, 540));
        getContentPane().add(background12);
        background12.setBounds(-10, -10, 970, 560);

        cv.setLayout(new java.awt.CardLayout());

        background13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        background13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background13.setInheritsPopupMenu(false);
        background13.setMaximumSize(new java.awt.Dimension(930, 540));
        background13.setMinimumSize(new java.awt.Dimension(0, 0));
        background13.setPreferredSize(new java.awt.Dimension(930, 540));
        cv.add(background13, "card2");

        cvote.setLayout(null);

        partyid.setMaximumSize(new java.awt.Dimension(95, 25));
        partyid.setMinimumSize(new java.awt.Dimension(95, 25));
        partyid.setPreferredSize(new java.awt.Dimension(95, 25));
        cvote.add(partyid);
        partyid.setBounds(400, 150, 150, 26);

        canid.setMaximumSize(new java.awt.Dimension(95, 25));
        canid.setMinimumSize(new java.awt.Dimension(95, 25));
        canid.setPreferredSize(new java.awt.Dimension(95, 25));
        canid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canidActionPerformed(evt);
            }
        });
        cvote.add(canid);
        canid.setBounds(400, 100, 150, 26);

        inReset2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inReset2.setText("RESET");
        inReset2.setMaximumSize(new java.awt.Dimension(111, 33));
        inReset2.setMinimumSize(new java.awt.Dimension(111, 33));
        inReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inReset2ActionPerformed(evt);
            }
        });
        cvote.add(inReset2);
        inReset2.setBounds(440, 360, 110, 26);

        c_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c_id.setForeground(new java.awt.Color(255, 255, 255));
        c_id.setText("Candidate ID:");
        c_id.setMaximumSize(new java.awt.Dimension(95, 25));
        c_id.setMinimumSize(new java.awt.Dimension(95, 25));
        c_id.setPreferredSize(new java.awt.Dimension(95, 25));
        cvote.add(c_id);
        c_id.setBounds(260, 90, 120, 40);

        v_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        v_id.setForeground(new java.awt.Color(255, 255, 255));
        v_id.setText("Voter ID:");
        cvote.add(v_id);
        v_id.setBounds(260, 40, 120, 40);

        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setText("SUBMIT");
        submit.setMaximumSize(new java.awt.Dimension(111, 33));
        submit.setMinimumSize(new java.awt.Dimension(111, 33));
        submit.setPreferredSize(new java.awt.Dimension(111, 33));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        cvote.add(submit);
        submit.setBounds(310, 360, 110, 26);

        voterid.setMaximumSize(new java.awt.Dimension(95, 25));
        voterid.setMinimumSize(new java.awt.Dimension(95, 25));
        voterid.setPreferredSize(new java.awt.Dimension(95, 25));
        cvote.add(voterid);
        voterid.setBounds(400, 50, 150, 26);

        p_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        p_id.setForeground(new java.awt.Color(255, 255, 255));
        p_id.setText("Party ID:");
        cvote.add(p_id);
        p_id.setBounds(260, 140, 120, 40);

        GUIDE7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE7.setForeground(new java.awt.Color(255, 255, 255));
        GUIDE7.setText("CAST YOUR VOTE HERE");
        GUIDE7.setMaximumSize(new java.awt.Dimension(100, 24));
        cvote.add(GUIDE7);
        GUIDE7.setBounds(490, 20, 430, 15);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        cvote.add(background1);
        background1.setBounds(0, 0, 760, 570);

        cv.add(cvote, "card3");

        getContentPane().add(cv);
        cv.setBounds(230, 0, 750, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manifestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manifestoActionPerformed
close();
new VVoter_fnm().setVisible(true);
        
        
    }//GEN-LAST:event_manifestoActionPerformed

    private void pollstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollstnActionPerformed
close();
new VVoter_fnpl().setVisible(true); 
    }//GEN-LAST:event_pollstnActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteActionPerformed
        cv.removeAll();
        cv.add(cvote);
        cv.repaint();
        cv.revalidate();
        
    }//GEN-LAST:event_voteActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
       
       close();
       
        new home().setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        close();
        new VVoter_fnr().setVisible(true);
    }//GEN-LAST:event_resultActionPerformed

    private void canidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_canidActionPerformed

    private void inReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inReset2ActionPerformed
        voterid.setText("");
        canid.setText("");
        partyid.setText("");
    }//GEN-LAST:event_inReset2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

         con=connect.ConnectDB();
        try{
            String sql1="insert into votes(v_id,can_id,party_id) values(?,?,?)";
           
            
             pst1=con.prepareStatement(sql1);
            pst1.setString(1,voterid.getText());
            pst1.setString(2,canid.getText());
             pst1.setString(3,partyid.getText());
           
            pst1.execute();
            
         
            
            JOptionPane.showMessageDialog(null, "Succesfull");
      voterid.setText("");
        canid.setText("");
        partyid.setText("");
                }
        catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } 
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VVoter_fn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel GUIDE6;
    private javax.swing.JLabel GUIDE7;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background12;
    private javax.swing.JLabel background13;
    private javax.swing.JLabel c_id;
    private javax.swing.JTextField canid;
    private javax.swing.JPanel cv;
    private javax.swing.JPanel cvote;
    private javax.swing.JButton inReset2;
    private javax.swing.JButton logout1;
    private javax.swing.JButton manifesto;
    private javax.swing.JPanel options;
    private javax.swing.JLabel p_id;
    private javax.swing.JTextField partyid;
    private javax.swing.JButton pollstn;
    private javax.swing.JButton result;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton submit;
    private javax.swing.JLabel v_id;
    private javax.swing.JButton vote;
    private javax.swing.JTextField voterid;
    // End of variables declaration//GEN-END:variables
}