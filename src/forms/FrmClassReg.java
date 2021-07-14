package forms;

import dao.ClassRegDAO;
import entities.ClassReg;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import util.ValidField;

public class FrmClassReg extends javax.swing.JFrame {
    public FrmClassReg() {
        initComponents();        
        feedTable(); 
    }
    
    public void feedTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtbclass.getModel();
        modelo.setNumRows(0);
        ClassRegDAO dao = new ClassRegDAO();
        jtbclass.removeAll();
        for(ClassReg cr: dao.read()) {
            modelo.addRow(new Object[] {
                cr.getCod(),
                cr.getName(),
                cr.getWorkload(),
                cr.getProfessor(),
                cr.getPreReq(),
                cr.getWeekDays()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lbcod = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbworkload = new javax.swing.JLabel();
        lbprof = new javax.swing.JLabel();
        lbpreReq = new javax.swing.JLabel();
        lbweekDays = new javax.swing.JLabel();
        lbsearch = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtworkload = new javax.swing.JTextField();
        txtprof = new javax.swing.JTextField();
        txtpreReq = new javax.swing.JTextField();
        txtweekDays = new javax.swing.JTextField();
        txtpesq = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbclass = new javax.swing.JTable();
        btnclose = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Aulas");

        lbcod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbcod.setText("Código");

        lbname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbname.setText("Nome");

        lbworkload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbworkload.setText("Carga Horária");

        lbprof.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbprof.setText("Professor");

        lbpreReq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbpreReq.setText("Pré requisito");

        lbweekDays.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbweekDays.setText("Dias da semana");

        lbsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbsearch.setText("Pesquisa");

        txtcod.setEditable(false);
        txtcod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtcod.setFocusable(false);

        txtname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtworkload.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtprof.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtpreReq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtweekDays.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtpesq.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtpesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesqKeyReleased(evt);
            }
        });

        btninsert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btninsert.setText("Insert");
        btninsert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jtbclass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbclass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtbclass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Carga Horária", "Professor", "Pré Requisito", "Dias da Semana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtbclassMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtbclass);

        btnclose.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnclose.setText("Close");
        btnclose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbweekDays)
                            .addComponent(lbpreReq)
                            .addComponent(lbprof)
                            .addComponent(lbworkload)
                            .addComponent(lbname)
                            .addComponent(lbcod))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreReq)
                            .addComponent(txtweekDays)
                            .addComponent(txtprof)
                            .addComponent(txtname)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtworkload, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 354, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btndelete)
                        .addGap(55, 55, 55)
                        .addComponent(btnclose))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbsearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtpesq)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcod)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbworkload)
                    .addComponent(txtworkload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbprof)
                    .addComponent(txtprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbpreReq)
                    .addComponent(txtpreReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbweekDays)
                    .addComponent(txtweekDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbsearch)
                    .addComponent(txtpesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnclose))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        ClassReg cr = new ClassReg();
        ClassRegDAO dao = new ClassRegDAO();
        ValidField vf = new ValidField();
        
        /*
        if(vf.isEmpty(txtname)||vf.isEmpty(txtworkload)||vf.isEmpty(txtprof)||vf.isEmpty(txtweekDays)) {
            return;
        } */
        
        cr.setName(txtname.getText());
        cr.setWorkload(Double.parseDouble(txtworkload.getText()));
        cr.setProfessor(txtprof.getText());
        cr.setPreReq(txtpreReq.getText());
        cr.setWeekDays(txtweekDays.getText());
        dao.insert(cr);

        txtcod.setText("");
        txtname.setText("");
        txtworkload.setText("");
        txtprof.setText("");
        txtpreReq.setText("");
        txtweekDays.setText("");
        
        feedTable();
    }//GEN-LAST:event_btninsertActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncloseActionPerformed

    private void jtbclassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbclassMousePressed
        if(jtbclass.getSelectedRow() != -1) {
            txtcod.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),0).toString());
            txtname.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),1).toString());
            txtworkload.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),2).toString());
            txtprof.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),3).toString());
            txtpreReq.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),4).toString());
            txtweekDays.setText(jtbclass.getValueAt(jtbclass.getSelectedRow(),5).toString());
        }
    }//GEN-LAST:event_jtbclassMousePressed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        ClassReg cr = new ClassReg();
        ClassRegDAO dao = new ClassRegDAO();
        cr.setCod((int)jtbclass.getValueAt(jtbclass.getSelectedRow(),0));
        cr.setName(txtname.getText());
        cr.setWorkload(Double.parseDouble(txtworkload.getText()));
        cr.setProfessor(txtprof.getText());
        cr.setPreReq(txtpreReq.getText());
        cr.setWeekDays(txtweekDays.getText());
        dao.update(cr);
        
        txtname.setText("");
        txtworkload.setText("");
        txtprof.setText("");
        txtpreReq.setText("");
        txtweekDays.setText("");
        
        feedTable();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        ClassReg cr = new ClassReg();
        ClassRegDAO dao = new ClassRegDAO();
        cr.setCod((int)jtbclass.getValueAt(jtbclass.getSelectedRow(),0));
        int input = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar esses dados?", "Alerta",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(input == 0)
            dao.delete(cr);
        txtcod.setText("");
        txtcod.setText("");
        txtname.setText("");
        txtworkload.setText("");
        txtprof.setText("");
        txtpreReq.setText("");
        txtweekDays.setText("");
        
        feedTable();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtpesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesqKeyReleased
      DefaultTableModel modelo = (DefaultTableModel) jtbclass.getModel();
        modelo.setNumRows(0);
        ClassRegDAO dao = new ClassRegDAO();
        jtbclass.removeAll();
        for(ClassReg cr: dao.readLike(txtpesq.getText().toString())) {
            modelo.addRow(new Object[] {
                cr.getCod(),
                cr.getName(),
                cr.getWorkload(),
                cr.getProfessor(),
                cr.getPreReq(),
                cr.getWeekDays()
            });
        }         
    }//GEN-LAST:event_txtpesqKeyReleased

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
            java.util.logging.Logger.getLogger(FrmClassReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmClassReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmClassReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmClassReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmClassReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable jtbclass;
    private javax.swing.JLabel lbcod;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbpreReq;
    private javax.swing.JLabel lbprof;
    private javax.swing.JLabel lbsearch;
    private javax.swing.JLabel lbweekDays;
    private javax.swing.JLabel lbworkload;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpesq;
    private javax.swing.JTextField txtpreReq;
    private javax.swing.JTextField txtprof;
    private javax.swing.JTextField txtweekDays;
    private javax.swing.JTextField txtworkload;
    // End of variables declaration//GEN-END:variables
}
