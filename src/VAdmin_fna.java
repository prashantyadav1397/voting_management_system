
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHOK KUMAR YADAV
 */
public class VAdmin_fna extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    public VAdmin_fna() {
        initComponents();
        anno.removeAll();
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
        party = new javax.swing.JButton();
        announcements = new javax.swing.JButton();
        pollstn = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        GUIDE6 = new javax.swing.JLabel();
        background12 = new javax.swing.JLabel();
        anno = new javax.swing.JPanel();
        addanno = new javax.swing.JPanel();
        anno_id = new javax.swing.JTextField();
        inReset3 = new javax.swing.JButton();
        announcement = new javax.swing.JLabel();
        a_id = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        anno_ = new javax.swing.JTextArea();
        GUIDE4 = new javax.swing.JLabel();
        background6 = new javax.swing.JLabel();
        showanno = new javax.swing.JPanel();
        anno_show = new javax.swing.JScrollPane();
        annoshow = new javax.swing.JTable();
        back2 = new javax.swing.JButton();
        GUIDE5 = new javax.swing.JLabel();
        background7 = new javax.swing.JLabel();
        op_anno = new javax.swing.JPanel();
        add_anno = new javax.swing.JButton();
        show_anno = new javax.swing.JButton();
        background5 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 540));
        getContentPane().setLayout(null);

        options.setBackground(new java.awt.Color(51, 51, 51));

        party.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        party.setText("PARTIES");
        party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partyActionPerformed(evt);
            }
        });

        announcements.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        announcements.setText("ANNOUNCEMENTS");
        announcements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementsActionPerformed(evt);
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

        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(announcements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pollstn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(party, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(announcements, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pollstn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
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
        GUIDE6.setText("WELCOME TO THE ADMIN DASHBOARD");
        GUIDE6.setMaximumSize(new java.awt.Dimension(100, 24));
        getContentPane().add(GUIDE6);
        GUIDE6.setBounds(560, 20, 320, 15);

        background12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        getContentPane().add(background12);
        background12.setBounds(0, 0, 1030, 570);

        anno.setLayout(new java.awt.CardLayout());

        addanno.setLayout(null);

        anno_id.setMaximumSize(new java.awt.Dimension(95, 25));
        anno_id.setMinimumSize(new java.awt.Dimension(95, 25));
        anno_id.setPreferredSize(new java.awt.Dimension(95, 25));
        addanno.add(anno_id);
        anno_id.setBounds(370, 50, 260, 26);

        inReset3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inReset3.setText("RESET");
        inReset3.setMaximumSize(new java.awt.Dimension(111, 33));
        inReset3.setMinimumSize(new java.awt.Dimension(111, 33));
        inReset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inReset3ActionPerformed(evt);
            }
        });
        addanno.add(inReset3);
        inReset3.setBounds(500, 360, 110, 26);

        announcement.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        announcement.setText("Announcement:");
        announcement.setMaximumSize(new java.awt.Dimension(95, 25));
        announcement.setMinimumSize(new java.awt.Dimension(95, 25));
        announcement.setPreferredSize(new java.awt.Dimension(95, 25));
        addanno.add(announcement);
        announcement.setBounds(180, 90, 200, 40);

        a_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        a_id.setText("Announcement ID :");
        addanno.add(a_id);
        a_id.setBounds(180, 40, 200, 40);

        back1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back1.setText("BACK");
        back1.setMaximumSize(new java.awt.Dimension(111, 33));
        back1.setMinimumSize(new java.awt.Dimension(111, 33));
        back1.setPreferredSize(new java.awt.Dimension(111, 33));
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        addanno.add(back1);
        back1.setBounds(240, 360, 110, 26);

        submit1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit1.setText("SUBMIT");
        submit1.setMaximumSize(new java.awt.Dimension(111, 33));
        submit1.setMinimumSize(new java.awt.Dimension(111, 33));
        submit1.setPreferredSize(new java.awt.Dimension(111, 33));
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        addanno.add(submit1);
        submit1.setBounds(370, 360, 110, 26);

        anno_.setColumns(20);
        anno_.setRows(5);
        addanno.add(anno_);
        anno_.setBounds(370, 100, 260, 240);

        GUIDE4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE4.setText("ADD A NEW ANNOUNCEMENT");
        GUIDE4.setMaximumSize(new java.awt.Dimension(100, 24));
        addanno.add(GUIDE4);
        GUIDE4.setBounds(470, 20, 250, 15);

        background6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        addanno.add(background6);
        background6.setBounds(0, 0, 760, 570);

        anno.add(addanno, "card3");

        showanno.setLayout(null);

        annoshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Announcement ID", "Announcement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        anno_show.setViewportView(annoshow);

        showanno.add(anno_show);
        anno_show.setBounds(110, 70, 530, 300);

        back2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back2.setText("BACK");
        back2.setMaximumSize(new java.awt.Dimension(111, 33));
        back2.setMinimumSize(new java.awt.Dimension(111, 33));
        back2.setPreferredSize(new java.awt.Dimension(111, 33));
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        showanno.add(back2);
        back2.setBounds(110, 380, 110, 26);

        GUIDE5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE5.setText("ANNOUNCEMENTS");
        GUIDE5.setMaximumSize(new java.awt.Dimension(100, 24));
        showanno.add(GUIDE5);
        GUIDE5.setBounds(530, 20, 250, 15);

        background7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        showanno.add(background7);
        background7.setBounds(0, 0, 760, 570);

        anno.add(showanno, "card4");

        op_anno.setLayout(null);

        add_anno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_anno.setText("ADD ANNOUNCEMENTS");
        add_anno.setMaximumSize(new java.awt.Dimension(160, 33));
        add_anno.setPreferredSize(new java.awt.Dimension(110, 25));
        add_anno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_annoActionPerformed(evt);
            }
        });
        op_anno.add(add_anno);
        add_anno.setBounds(410, 180, 170, 25);

        show_anno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_anno.setText("SHOW ANNOUNCEMENTS");
        show_anno.setMaximumSize(new java.awt.Dimension(153, 33));
        show_anno.setPreferredSize(new java.awt.Dimension(110, 25));
        show_anno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_annoActionPerformed(evt);
            }
        });
        op_anno.add(show_anno);
        show_anno.setBounds(210, 180, 170, 25);

        background5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        op_anno.add(background5);
        background5.setBounds(0, 0, 760, 570);

        anno.add(op_anno, "card4");

        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        anno.add(background4, "card5");

        getContentPane().add(anno);
        anno.setBounds(230, 0, 750, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partyActionPerformed
close();
       new VAdmin_fnp().setVisible(true);
    }//GEN-LAST:event_partyActionPerformed

    private void announcementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementsActionPerformed

       anno.removeAll();
       anno.add(op_anno);
       anno.repaint();
       anno.revalidate();
    }//GEN-LAST:event_announcementsActionPerformed

    private void pollstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollstnActionPerformed
close();
        new VAdmin_fnpl().setVisible(true);
    }//GEN-LAST:event_pollstnActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        close();
        new home().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void add_annoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_annoActionPerformed
          anno.removeAll();
       anno.add(addanno);
       anno.repaint();
       anno.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_add_annoActionPerformed

    private void show_annoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_annoActionPerformed
          anno.removeAll();
       anno.add(showanno);
       anno.repaint();
       anno.revalidate();
       
       con=connect.ConnectDB();
       try {
       
               String sql1="select * from announce";
            DefaultTableModel tb1= (DefaultTableModel) annoshow.getModel();
        tb1.setRowCount(0);
       
            String rg[]=new String[2];
         pst1=con.prepareStatement(sql1);
          rs= pst1.executeQuery();
          
          if(rs.next())
          {
              
              do
              {
                rg[0]=rs.getString(1);
                rg[1]=rs.getString(2);
              
                tb1.addRow(rg);
                
              }while(rs.next());
          }
              
    
    }
   catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } 
    }//GEN-LAST:event_show_annoActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
          anno.removeAll();
       anno.add(op_anno);
       anno.repaint();
       anno.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_back1ActionPerformed

    private void inReset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inReset3ActionPerformed
        anno_id.setText("");
        anno_.setText("");
    }//GEN-LAST:event_inReset3ActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        con=connect.ConnectDB();
        try{
            String sql1="insert into announce(aid,anno) values(?,?)";
           
            
             pst1=con.prepareStatement(sql1);
            pst1.setString(1,anno_id.getText());
            pst1.setString(2,anno_.getText());
           
            pst1.execute();
            
         
            
            JOptionPane.showMessageDialog(null, "Succesfull");
      anno_id.setText("");
        anno_.setText("");
                }
        catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } 
    }//GEN-LAST:event_submit1ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
          anno.removeAll();
       anno.add(op_anno);
       anno.repaint();
       anno.revalidate();// TODO add your handling code here:
    }//GEN-LAST:event_back2ActionPerformed

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
            java.util.logging.Logger.getLogger(VAdmin_fnp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fnp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fnp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fnp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmin_fnp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel GUIDE4;
    private javax.swing.JLabel GUIDE5;
    private javax.swing.JLabel GUIDE6;
    private javax.swing.JLabel a_id;
    private javax.swing.JButton add_anno;
    private javax.swing.JPanel addanno;
    private javax.swing.JPanel anno;
    private javax.swing.JTextArea anno_;
    private javax.swing.JTextField anno_id;
    private javax.swing.JScrollPane anno_show;
    private javax.swing.JTable annoshow;
    private javax.swing.JLabel announcement;
    private javax.swing.JButton announcements;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JLabel background12;
    private javax.swing.JLabel background4;
    private javax.swing.JLabel background5;
    private javax.swing.JLabel background6;
    private javax.swing.JLabel background7;
    private javax.swing.JButton inReset3;
    private javax.swing.JButton logout;
    private javax.swing.JPanel op_anno;
    private javax.swing.JPanel options;
    private javax.swing.JButton party;
    private javax.swing.JButton pollstn;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton show_anno;
    private javax.swing.JPanel showanno;
    private javax.swing.JButton submit1;
    // End of variables declaration//GEN-END:variables
}
