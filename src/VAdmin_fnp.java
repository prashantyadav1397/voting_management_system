
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
public class VAdmin_fnp extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    public VAdmin_fnp() {
        initComponents();
        polp.removeAll();
        
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

        background12 = new javax.swing.JLabel();
        options = new javax.swing.JPanel();
        party = new javax.swing.JButton();
        announcements = new javax.swing.JButton();
        pollstn = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        GUIDE7 = new javax.swing.JLabel();
        background3 = new javax.swing.JLabel();
        polp = new javax.swing.JPanel();
        op_party = new javax.swing.JPanel();
        add_party = new javax.swing.JButton();
        show_party = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        addparty = new javax.swing.JPanel();
        p_id = new javax.swing.JLabel();
        party_id = new javax.swing.JTextField();
        p_name = new javax.swing.JLabel();
        party_name = new javax.swing.JTextField();
        Loc = new javax.swing.JLabel();
        party_loc = new javax.swing.JTextField();
        noofmem = new javax.swing.JLabel();
        no_of_mem = new javax.swing.JTextField();
        cuser = new javax.swing.JLabel();
        party_lead = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        inReset2 = new javax.swing.JButton();
        GUIDE5 = new javax.swing.JLabel();
        background1 = new javax.swing.JLabel();
        showparty = new javax.swing.JPanel();
        back2 = new javax.swing.JButton();
        show_parties = new javax.swing.JScrollPane();
        partyshow = new javax.swing.JTable();
        GUIDE6 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        background4 = new javax.swing.JLabel();

        background12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N

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

        GUIDE7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE7.setText("WELCOME TO THE ADMIN DASHBOARD");
        GUIDE7.setMaximumSize(new java.awt.Dimension(100, 24));
        getContentPane().add(GUIDE7);
        GUIDE7.setBounds(560, 20, 320, 15);

        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        getContentPane().add(background3);
        background3.setBounds(0, 0, 1200, 771);

        polp.setLayout(new java.awt.CardLayout());

        op_party.setLayout(null);

        add_party.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add_party.setText("ADD POLITICAL PARTY");
        add_party.setMaximumSize(new java.awt.Dimension(160, 33));
        add_party.setPreferredSize(new java.awt.Dimension(110, 25));
        add_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_partyActionPerformed(evt);
            }
        });
        op_party.add(add_party);
        add_party.setBounds(400, 180, 180, 25);

        show_party.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        show_party.setText("SHOW POLITICAL PARTY");
        show_party.setMaximumSize(new java.awt.Dimension(153, 33));
        show_party.setPreferredSize(new java.awt.Dimension(110, 25));
        show_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_partyActionPerformed(evt);
            }
        });
        op_party.add(show_party);
        show_party.setBounds(200, 180, 180, 25);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        op_party.add(background);
        background.setBounds(0, 0, 760, 570);

        polp.add(op_party, "card4");

        addparty.setLayout(null);

        p_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        p_id.setText("Party ID :");
        addparty.add(p_id);
        p_id.setBounds(290, 40, 130, 40);

        party_id.setMaximumSize(new java.awt.Dimension(95, 25));
        party_id.setMinimumSize(new java.awt.Dimension(95, 25));
        party_id.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(party_id);
        party_id.setBounds(450, 50, 150, 26);

        p_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        p_name.setText("Party Name:");
        p_name.setMaximumSize(new java.awt.Dimension(95, 25));
        p_name.setMinimumSize(new java.awt.Dimension(95, 25));
        p_name.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(p_name);
        p_name.setBounds(290, 90, 130, 40);

        party_name.setMaximumSize(new java.awt.Dimension(95, 25));
        party_name.setMinimumSize(new java.awt.Dimension(95, 25));
        party_name.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(party_name);
        party_name.setBounds(450, 100, 150, 26);

        Loc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Loc.setText("Location:");
        addparty.add(Loc);
        Loc.setBounds(290, 140, 130, 40);

        party_loc.setMaximumSize(new java.awt.Dimension(95, 25));
        party_loc.setMinimumSize(new java.awt.Dimension(95, 25));
        party_loc.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(party_loc);
        party_loc.setBounds(450, 150, 150, 26);

        noofmem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        noofmem.setText("No. of Members:");
        noofmem.setMaximumSize(new java.awt.Dimension(95, 25));
        noofmem.setMinimumSize(new java.awt.Dimension(95, 25));
        noofmem.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(noofmem);
        noofmem.setBounds(290, 190, 150, 40);

        no_of_mem.setMaximumSize(new java.awt.Dimension(95, 25));
        no_of_mem.setMinimumSize(new java.awt.Dimension(95, 25));
        no_of_mem.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(no_of_mem);
        no_of_mem.setBounds(450, 200, 150, 26);

        cuser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cuser.setText("Party Leader:");
        addparty.add(cuser);
        cuser.setBounds(290, 240, 130, 40);

        party_lead.setMaximumSize(new java.awt.Dimension(95, 25));
        party_lead.setMinimumSize(new java.awt.Dimension(95, 25));
        party_lead.setPreferredSize(new java.awt.Dimension(95, 25));
        addparty.add(party_lead);
        party_lead.setBounds(450, 250, 150, 26);

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("BACK");
        back.setMaximumSize(new java.awt.Dimension(111, 33));
        back.setMinimumSize(new java.awt.Dimension(111, 33));
        back.setPreferredSize(new java.awt.Dimension(111, 33));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        addparty.add(back);
        back.setBounds(230, 360, 110, 26);

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
        addparty.add(submit);
        submit.setBounds(360, 360, 110, 26);

        inReset2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        inReset2.setText("RESET");
        inReset2.setMaximumSize(new java.awt.Dimension(111, 33));
        inReset2.setMinimumSize(new java.awt.Dimension(111, 33));
        inReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inReset2ActionPerformed(evt);
            }
        });
        addparty.add(inReset2);
        inReset2.setBounds(490, 360, 110, 26);

        GUIDE5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE5.setText("ADD A NEW POLITICAL PARTY");
        GUIDE5.setMaximumSize(new java.awt.Dimension(100, 24));
        addparty.add(GUIDE5);
        GUIDE5.setBounds(490, 20, 250, 15);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        addparty.add(background1);
        background1.setBounds(0, 0, 760, 570);

        polp.add(addparty, "card3");

        showparty.setLayout(null);

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
        showparty.add(back2);
        back2.setBounds(110, 380, 110, 26);

        partyshow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Party ID", "Party Name", "Location", "No. of Members", "Leader"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        show_parties.setViewportView(partyshow);

        showparty.add(show_parties);
        show_parties.setBounds(110, 70, 530, 300);

        GUIDE6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE6.setText("POLITICAL PARTIES");
        GUIDE6.setMaximumSize(new java.awt.Dimension(100, 24));
        showparty.add(GUIDE6);
        GUIDE6.setBounds(530, 20, 250, 15);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        showparty.add(background2);
        background2.setBounds(0, 0, 760, 570);

        polp.add(showparty, "card4");

        background4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        polp.add(background4, "card5");

        getContentPane().add(polp);
        polp.setBounds(230, 0, 700, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partyActionPerformed

        polp.removeAll();
        polp.add(op_party);
        polp.repaint();
        polp.revalidate();
    }//GEN-LAST:event_partyActionPerformed

    private void announcementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementsActionPerformed
        close();
        new VAdmin_fna().setVisible(true);
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

    private void add_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_partyActionPerformed
       polp.removeAll();
       polp.add(addparty);
       polp.repaint();
       polp.revalidate();
    }//GEN-LAST:event_add_partyActionPerformed

    private void show_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_partyActionPerformed
       polp.removeAll();
       polp.add(showparty);
       polp.repaint();
       polp.revalidate();
       con=connect.ConnectDB();
   
    try {
       
               String sql1="select * from party";
            DefaultTableModel tb= (DefaultTableModel) partyshow.getModel();
        tb.setRowCount(0);
       
            String rg[]=new String[5];
         pst1=con.prepareStatement(sql1);
          rs= pst1.executeQuery();
          
          if(rs.next())
          {
              
              do
              {
                rg[0]=rs.getString(1);
                rg[1]=rs.getString(2);
                rg[2]=rs.getString(3);
                rg[3]=rs.getString(4);
                rg[4]=rs.getString(5);
                
                tb.addRow(rg);
                
              }while(rs.next());
          }
              
    
    }
   catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } 
    }//GEN-LAST:event_show_partyActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        polp.removeAll();
       polp.add(op_party);
       polp.repaint();
       polp.revalidate();
    }//GEN-LAST:event_backActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
         polp.removeAll();
       polp.add(op_party);
       polp.repaint();
       polp.revalidate();
    }//GEN-LAST:event_back2ActionPerformed

    private void inReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inReset2ActionPerformed
        party_id.setText("");
        party_name.setText("");
        party_loc.setText("");
        party_lead.setText("");
        no_of_mem.setText("");
        
    }//GEN-LAST:event_inReset2ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
 con=connect.ConnectDB();
        try{
            String sql1="insert into party(party_id,pname,ploc,nom,plead) values(?,?,?,?,?)";
           
            
             pst1=con.prepareStatement(sql1);
            pst1.setString(1,party_id.getText());
            pst1.setString(2,party_name.getText());
            pst1.setString(3,party_loc.getText());
            pst1.setString(4,no_of_mem.getText());
            pst1.setString(5,party_lead.getText());
           
            pst1.execute();
            
         
            
            JOptionPane.showMessageDialog(null, "Succesfull");
        party_id.setText("");
        party_name.setText("");
        party_loc.setText("");
        party_lead.setText("");
        no_of_mem.setText("");
        
                }
        catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    }         // TODO add your handling code here:
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
    private javax.swing.JLabel GUIDE5;
    private javax.swing.JLabel GUIDE6;
    private javax.swing.JLabel GUIDE7;
    private javax.swing.JLabel Loc;
    private javax.swing.JButton add_party;
    private javax.swing.JPanel addparty;
    private javax.swing.JButton announcements;
    private javax.swing.JButton back;
    private javax.swing.JButton back2;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background12;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background3;
    private javax.swing.JLabel background4;
    private javax.swing.JLabel cuser;
    private javax.swing.JButton inReset2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField no_of_mem;
    private javax.swing.JLabel noofmem;
    private javax.swing.JPanel op_party;
    private javax.swing.JPanel options;
    private javax.swing.JLabel p_id;
    private javax.swing.JLabel p_name;
    private javax.swing.JButton party;
    private javax.swing.JTextField party_id;
    private javax.swing.JTextField party_lead;
    private javax.swing.JTextField party_loc;
    private javax.swing.JTextField party_name;
    private javax.swing.JTable partyshow;
    private javax.swing.JButton pollstn;
    private javax.swing.JPanel polp;
    private javax.swing.JSeparator separator;
    private javax.swing.JScrollPane show_parties;
    private javax.swing.JButton show_party;
    private javax.swing.JPanel showparty;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
