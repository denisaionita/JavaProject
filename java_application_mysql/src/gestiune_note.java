
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.*;

 
/**
 *
 * @author Denisa123
 */

public class gestiune_note extends javax.swing.JFrame {

    /**
     * Creates new form gestiune_note
     */
    
    Connecter conn=new Connecter();
    Statement stm;
    ResultSet Res;
    DefaultTableModel model= new DefaultTableModel();
    //private Object table;
    
    public gestiune_note() throws SQLException {
        initComponents();
        model.addColumn("id");
        model.addColumn("Nume");
        model.addColumn("Prenume");
        model.addColumn("Sectie");
        model.addColumn("Note");
        try{
            stm=conn.obtainconnection().createStatement();
            ResultSet Rs;
            Rs = stm.executeQuery("Select * from studenti");
            while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nume"),Rs.getString("Prenume"),Rs.getString("Sectie"),Rs.getString("nota")});
            }   
        }
        catch(Exception e){
    System.err.println(e);}
      table.setModel(model);
    
    }
        
              
        
              
        
        
  /*  private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnume = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnota = new javax.swing.JTextField();
        txtprenume = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtsec = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        txtsort = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtcautare = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLayeredPane1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 3, 24)); // NOI18N
        jLabel6.setText("Gestionarea Situatiei Studentilor");

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel2.setText("Nume :");

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel3.setText("Prenume :");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel4.setText("Sectie :");

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jLabel5.setText("Nota :");

        txtnume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txtnota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnotaActionPerformed(evt);
            }
        });

        txtprenume.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtprenume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprenumeActionPerformed(evt);
            }
        });

        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setName("Studenti"); // NOI18N
        table.setPreferredSize(new java.awt.Dimension(265, 196));
        table.setSelectionBackground(new java.awt.Color(51, 51, 51));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtsec.setEditable(true);
        txtsec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATE", "INFO", "CTI" }));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton2.setText("Sort BY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtsort.setBackground(new java.awt.Color(153, 255, 204));
        txtsort.setEditable(true);
        txtsort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nume", "Prenume", "Nota" }));
        txtsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsortActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton8.setText("Adauga");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton3.setText("Sterge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton1.setText("reActualizeaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton7.setText("modifica");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton4.setText("SEarch");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtcautare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcautareActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        jButton6.setText("Made By");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(txtsort, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtprenume)
                                    .addComponent(txtnume)
                                    .addComponent(txtsec, 0, 0, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcautare, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))))
                .addContainerGap(676, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnume, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtprenume, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtnota, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(txtsort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton8))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(txtcautare, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void deplace(int i){


try{
txtid.setText(model.getValueAt(i,0).toString());
txtnume.setText(model.getValueAt(i,1).toString());
txtprenume.setText(model.getValueAt(i,2).toString());
txtnota.setText(model.getValueAt(i,0).toString());
txtsec.setSelectedItem(model.getValueAt(i,3).toString());

}
catch(Exception e){System.err.println(e);
JOptionPane.showMessageDialog(null,"Deplacement error"+e.getLocalizedMessage());}

}
    private void afisare(){
        try{
            model.setRowCount(0);
            stm=conn.obtainconnection().createStatement();
            ResultSet Rs;
            Rs = stm.executeQuery("Select * from studenti");
            while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nume"),Rs.getString("Prenume"),Rs.getString("Sectie"),Rs.getString("nota")});
            }   
        }
        catch(Exception e){
    System.err.println(e);}
      table.setModel(model);
    }
    private void sortare(){
        try{
            model.setRowCount(0);
            stm=conn.obtainconnection().createStatement();
            ResultSet Rs;
            //String sortare;
           
            //sortare = Arrays.toString(txtsort.getSelectedObjects());
            //String varName = (String)txtsort.getSelectedItem();
String sortare = txtsort.getSelectedItem().toString();
           if((sortare).equals("Nume")){ Rs = stm.executeQuery("Select * from studenti ORDER BY Nume ");
           while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nume"),Rs.getString("Prenume"),Rs.getString("Sectie"),Rs.getString("nota")});
            }   }
           else{ if((sortare).equals("Prenume")){Rs = stm.executeQuery("Select * from studenti ORDER BY Prenume ");
           while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nume"),Rs.getString("Prenume"),Rs.getString("Sectie"),Rs.getString("nota")});
            } 
           }else{if((sortare).equals("Nota")){Rs = stm.executeQuery("Select * from studenti ORDER BY nota ");
           while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("Nume"),Rs.getString("Prenume"),Rs.getString("Sectie"),Rs.getString("nota")});
            } }
           
           }
               }
           
            
        }
        catch(Exception e){
    System.err.println(e);}
      table.setModel(model);
    
        
    }
    private void txtnumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnotaActionPerformed

    private void txtprenumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprenumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprenumeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         afisare();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
try{if(JOptionPane.showConfirmDialog(null,"Atentie, vreti sa stergeti un student. Sunteti sigur?","stergere student",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
       if(txtid.getText().length()!=0){
       stm.executeUpdate("Delete From studenti where id= "+txtid.getText());
       afisare();}
       else{JOptionPane.showMessageDialog(null,"Reintroduceti va rog campul id ");}
    
}catch(Exception e){JOptionPane.showMessageDialog(null,"Eroare la stergere\n"+e.getMessage());

}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
       model.setRowCount(0);
       {
            Res=stm.executeQuery("Select * from studenti WHERE nota= '"+txtcautare.getText()+"'");
       }while (Res.next()){
       Object [] student={Res.getInt(1),Res.getString(2),Res.getString(3),Res.getString(4),Res.getInt(5)};
       model.addRow(student);
       }if(model.getRowCount()==0){
       JOptionPane.showMessageDialog(null,"Nu exista niciun student");
       }else{
           int i=0;
           deplace(i);
       }
       }catch(Exception e){System.err.println(e);
       JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcautareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcautareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcautareActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      try{int i=table.getSelectedRow();
     deplace(i);

}catch(Exception e){JOptionPane.showMessageDialog(null,"Deplacement error "+e.getLocalizedMessage());}
    }//GEN-LAST:event_tableMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       Realise a=new Realise();
       a.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     try{ if(JOptionPane.showConfirmDialog(null,"Confirma modificarea","modificare",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION){
         stm.executeUpdate("UPDATE studenti SET Nume='"+txtnume.getText()+"',Prenume='"+txtprenume.getText()+"',Sectie='"+txtsec.getSelectedItem().toString()+"',nota='"+txtnota.getText()+"'WHERE id= "+txtid.getText());
        afisare(); 
      }
     }catch(Exception e){JOptionPane.showMessageDialog(null,"Eroare la modificare!");
     System.err.println(e);}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String id=txtid.getText();
        String nume=txtnume.getText();
        String prenume=txtprenume.getText();
        String sectie=txtsec.getSelectedItem().toString();
        String nota=txtnota.getText();
        String request;
        request = "Insert into studenti(id,Nume,Prenume,Sectie,nota)VALUES('"+id+"','"+nume+"','"+prenume+"','"+sectie+"','"+nota+"')";
        try{
            stm.executeUpdate(request);
            JOptionPane.showMessageDialog(null,"Studentul a fost adaugat cu succes");
            txtnume.setText("");
            txtprenume.setText("");
            txtsec.getSelectedItem();
            txtnota.setText("");
    
         afisare();
        
        
        
        }catch(Exception ex){JOptionPane.showMessageDialog(null,ex.getMessage());}
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try{ 
         sortare(); 
      
     }catch(Exception e){JOptionPane.showMessageDialog(null,"Eroare la sortare!");
     System.err.println(e);}       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsortActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestiune_note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new gestiune_note().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(gestiune_note.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtcautare;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnota;
    private javax.swing.JTextField txtnume;
    private javax.swing.JTextField txtprenume;
    private javax.swing.JComboBox<String> txtsec;
    private javax.swing.JComboBox<String> txtsort;
    // End of variables declaration//GEN-END:variables

   

 
}

