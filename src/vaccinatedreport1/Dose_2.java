
package vaccinatedreport1;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class Dose_2 extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Dose_2() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conn = DbConnection.ConnecrDb();
        jTextVacName.setVisible(false);
    }
private void clearField()
{
    jTextPName.setText(null);
    jTextAge.setText(null);
    jTextMobNo.setText(null);
    jTextHosDes.setText(null);
    jTextPrice.setText(null);
    jTextAdhr.setText(null);
    //jTextPrice.setText("123");
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextVacName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextGen = new javax.swing.JTextField();
        jTextMobNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextHosDes = new javax.swing.JTextField();
        jTextPrice = new javax.swing.JTextField();
        jTextPName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonSub = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextAdhr = new javax.swing.JTextField();
        jComboBoxVacName = new javax.swing.JComboBox<>();
        jTextDoseDt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextVacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 520, 109, 35));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("VACCINE NAME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 175, 35));

        jTextGen.setEnabled(false);
        jPanel1.add(jTextGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 180, 35));

        jTextMobNo.setEnabled(false);
        jTextMobNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextMobNoKeyTyped(evt);
            }
        });
        jPanel1.add(jTextMobNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 180, 35));

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText(" VACCINATION DOSE II FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 360, 31));

        jTextAge.setEnabled(false);
        jTextAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAgeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAgeKeyTyped(evt);
            }
        });
        jPanel1.add(jTextAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 180, 35));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("CONTACT NUMBER");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 175, 35));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("PRICE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 175, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PATIENT NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 175, 35));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("GENDER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 175, 35));
        jPanel1.add(jTextHosDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 180, 35));

        jTextPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPriceKeyTyped(evt);
            }
        });
        jPanel1.add(jTextPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 180, 35));

        jTextPName.setEnabled(false);
        jTextPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPNameActionPerformed(evt);
            }
        });
        jTextPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPNameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 180, 35));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("AADHAR NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 175, 35));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("HOSPITAL DESCRIPTION");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, 35));

        jButtonSub.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSub.setText("SUBMIT");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 640, 119, 35));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("AGE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 175, 35));

        jTextAdhr.setEnabled(false);
        jTextAdhr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextAdhrKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAdhrKeyTyped(evt);
            }
        });
        jPanel1.add(jTextAdhr, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, 180, 35));

        jComboBoxVacName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COVAXIN", "COVIDSHEILD", "SPUTNIK", "PFTIZER", "OTHER" }));
        jComboBoxVacName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVacNameActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxVacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 106, 35));
        jPanel1.add(jTextDoseDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 125, 11));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vaccinatedreport1/Does.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 1340, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1459, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        // TODO add your handling code here:
        String sql="Insert into Tab_Dose2 values(?,?,?,?,?,?,?,?,?)";
        //for checking whether all the fields are filled or not
        if(jTextPName.getText().length()==0 ||jTextAdhr.getText().length()==0 || jTextAge.getText().length()==0|| jTextMobNo.getText().length()==0|| jTextHosDes.getText().length()==0 || jComboBoxVacName.getSelectedItem().toString().length()==0||jTextPrice.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Please fill all the details");
        else
        {
            //for throwing all details into the database
            try
            {
                pst = conn.prepareStatement(sql);
                pst.setString(1,jTextPName.getText());
                pst.setString(2,jTextAge.getText());
                pst.setString(3,jTextGen.getText());
                //pst.setString(3,jComboBoxGen.getSelectedItem().toString());
                pst.setString(4,jTextMobNo.getText());
                pst.setString(5,jTextHosDes.getText());
                if("OTHER".equals(jComboBoxVacName.getSelectedItem().toString()))
                {   pst.setString(6,jTextVacName.getText()); }
                else{
                pst.setString(6,jComboBoxVacName.getSelectedItem().toString());}
                pst.setString(7,jTextPrice.getText());
                LocalDate currentDate7 = LocalDate.now();
                LocalDate currentDatePlus7 = currentDate7.plusDays(28);
                System.out.println(currentDatePlus7);
                
                String cd7=currentDate7.format(DateTimeFormatter.ISO_DATE);
                jTextDoseDt.setText(cd7);
                pst.setString(8,jTextDoseDt.getText());
                pst.setString(9,jTextAdhr.getText());
                pst.execute();
                
                JOptionPane.showMessageDialog(null,"Inserted Successfully");
                clearField(); //for clearing all the fields after clicking submit button
                dispose();
                new Bill2().setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }   

    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jTextPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPNameActionPerformed

    private void jTextPNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            jTextPName.setEditable(true);
        }
        else
        {
            jTextPName.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextPNameKeyTyped

    private void jTextAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAgeKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        String age=jTextAge.getText();
        int len=age.length();
        if(Character.isDigit(c)&&(len<3))
        {
            jTextAge.setEditable(true);
        }
        else
        {
            jTextAge.setEditable(false);
        }
    }//GEN-LAST:event_jTextAgeKeyTyped

    private void jTextAdhrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhrKeyTyped
        char c=evt.getKeyChar();
        String adhr=jTextAdhr.getText();
        int len=adhr.length();
        if(Character.isDigit(c)&&(len<12))
        {
            jTextAdhr.setEditable(true);
        }
        else
        {
            jTextAdhr.setEditable(false);    
        }   
    }//GEN-LAST:event_jTextAdhrKeyTyped

    private void jTextMobNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextMobNoKeyTyped
        char c=evt.getKeyChar();
        String MobNo=jTextMobNo.getText();
        int len=MobNo.length();
        if((!(Character.isLetter(c)))&&(len<14))
        {
            jTextMobNo.setEditable(true);
        }
        else
        {
            jTextMobNo.setEditable(false);    
        } 
    }//GEN-LAST:event_jTextMobNoKeyTyped

    private void jTextPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPriceKeyTyped
        char c=evt.getKeyChar();
        
        if(!(Character.isLetter(c)))
        {
            jTextPrice.setEditable(true);
        }
        else
        {
            jTextPrice.setEditable(false);    
        }
    }//GEN-LAST:event_jTextPriceKeyTyped

    private void jTextAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAgeKeyPressed
        if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {
            jTextAge.setEditable(true);
        }
        else
        {
            jTextAge.setEditable(false);
        }
    }//GEN-LAST:event_jTextAgeKeyPressed

    private void jTextAdhrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAdhrKeyPressed
        if(evt.getExtendedKeyCode()== KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {   jTextAdhr.setEditable(true);    }
        else
        {   jTextAdhr.setEditable(false);   }
    }//GEN-LAST:event_jTextAdhrKeyPressed

    private void jComboBoxVacNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVacNameActionPerformed
        if(jComboBoxVacName.getSelectedItem().toString()=="OTHER")
        {   jTextVacName.setVisible(true);  }
        else
        {   jTextVacName.setVisible(false);   }
    }//GEN-LAST:event_jComboBoxVacNameActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jTextHosDes.requestFocus();
        jTextDoseDt.setVisible(false);
        String Adhar=UID_Form.jTextAdhr.getText();
        try{
            Connection d1_con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//Vaccination_Report.db");
            
            Statement d1_stmt = d1_con.createStatement();
            
            String d1_SQL = "SELECT * FROM Tab_Dose1 WHERE Adhr = '" + Adhar + "'";
            ResultSet d1_rs = d1_stmt.executeQuery(d1_SQL);
            if(d1_rs.next())
            {
                //JOptionPane.showMessageDialog(null,"again, This UID is already Registered!");
                jTextPName.setText(d1_rs.getString("PName"));
                jTextAge.setText(d1_rs.getString("Age"));
                jTextMobNo.setText(d1_rs.getString("MobNo"));
                jTextGen.setText(d1_rs.getString("Gen"));
            }
            d1_rs.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        
        jTextAdhr.setText(UID_Form.jTextAdhr.getText());
        
    }//GEN-LAST:event_formWindowActivated
 
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
            java.util.logging.Logger.getLogger(Dose_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dose_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dose_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dose_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dose_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSub;
    private javax.swing.JComboBox<String> jComboBoxVacName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAdhr;
    private javax.swing.JTextField jTextAge;
    private javax.swing.JTextField jTextDoseDt;
    private javax.swing.JTextField jTextGen;
    private javax.swing.JTextField jTextHosDes;
    private javax.swing.JTextField jTextMobNo;
    private javax.swing.JTextField jTextPName;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextVacName;
    // End of variables declaration//GEN-END:variables
}
