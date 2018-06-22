
package lab09;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_empleados = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jp_ceo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombreCEO = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_ID_Empresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_salarioCEO = new javax.swing.JTextField();
        bt_addCEO = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_CEO = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        bt_delCEO = new javax.swing.JButton();
        bt_editCEO = new javax.swing.JButton();
        tf_pwCEO = new javax.swing.JPasswordField();
        jp_gerente = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tf_passwordManager = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_idEmpresaManager = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_salarioManager = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_nombreManager = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cb_jefeGerente = new javax.swing.JComboBox<>();
        bt_addManager = new javax.swing.JButton();
        bt_editManager = new javax.swing.JButton();
        bt_delManager = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_managers = new javax.swing.JList<>();
        jLabel16 = new javax.swing.JLabel();
        jp_empleado = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcb_jefe = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtree_empresa = new javax.swing.JTree();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_empleados = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_salir = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre:");

        jLabel7.setText("Password:");

        jLabel8.setText("ID de Empresa:");

        jLabel9.setText("Salario:");

        bt_addCEO.setText("Agregar");
        bt_addCEO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCEOMouseClicked(evt);
            }
        });

        jl_CEO.setModel(new DefaultListModel());
        jl_CEO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_CEOMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_CEO);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel15.setText("Gerente General (CEO)");

        bt_delCEO.setText("Eliminar");

        bt_editCEO.setText("Modificar");

        javax.swing.GroupLayout jp_ceoLayout = new javax.swing.GroupLayout(jp_ceo);
        jp_ceo.setLayout(jp_ceoLayout);
        jp_ceoLayout.setHorizontalGroup(
            jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ceoLayout.createSequentialGroup()
                .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_ceoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_editCEO)
                        .addGap(18, 18, 18)
                        .addComponent(bt_addCEO))
                    .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_ceoLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_nombreCEO, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_ceoLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_salarioCEO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_ID_Empresa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_pwCEO, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ceoLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ceoLayout.createSequentialGroup()
                        .addComponent(bt_delCEO)
                        .addGap(65, 65, 65))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_ceoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(21, 21, 21))
        );
        jp_ceoLayout.setVerticalGroup(
            jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_ceoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_ceoLayout.createSequentialGroup()
                        .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_nombreCEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tf_pwCEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_ID_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_salarioCEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_ceoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addCEO)
                    .addComponent(bt_delCEO)
                    .addComponent(bt_editCEO))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerente General", jp_ceo);

        jLabel10.setText("Password:");

        jLabel11.setText("ID de Empresa:");

        jLabel12.setText("Salario:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Jefe:");

        cb_jefeGerente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Gerente General" }));

        bt_addManager.setText("Agregar");
        bt_addManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addManagerMouseClicked(evt);
            }
        });

        bt_editManager.setText("Modificar");

        bt_delManager.setText("Eliminar");

        jl_managers.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_managers);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel16.setText("Lista Gerentes");

        javax.swing.GroupLayout jp_gerenteLayout = new javax.swing.GroupLayout(jp_gerente);
        jp_gerente.setLayout(jp_gerenteLayout);
        jp_gerenteLayout.setHorizontalGroup(
            jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jp_gerenteLayout.createSequentialGroup()
                            .addComponent(bt_editManager)
                            .addGap(30, 30, 30)
                            .addComponent(bt_addManager))
                        .addGroup(jp_gerenteLayout.createSequentialGroup()
                            .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_passwordManager)
                                .addComponent(tf_salarioManager)
                                .addComponent(tf_idEmpresaManager, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_jefeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_gerenteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreManager, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_gerenteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_delManager)
                        .addGap(78, 78, 78))
                    .addGroup(jp_gerenteLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(49, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_gerenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(61, 61, 61))
        );
        jp_gerenteLayout.setVerticalGroup(
            jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_gerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(11, 11, 11)
                .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_gerenteLayout.createSequentialGroup()
                        .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_nombreManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_passwordManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tf_idEmpresaManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tf_salarioManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cb_jefeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_gerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_addManager)
                    .addComponent(bt_editManager)
                    .addComponent(bt_delManager))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gerente", jp_gerente);

        jLabel2.setText("Nombe:");

        jLabel3.setText("Password:");

        jLabel4.setText("ID de Empresa:");

        jLabel5.setText("Salario:");

        jLabel6.setText("Jefe:");

        jcb_jefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Gerente..." }));

        javax.swing.GroupLayout jp_empleadoLayout = new javax.swing.GroupLayout(jp_empleado);
        jp_empleado.setLayout(jp_empleadoLayout);
        jp_empleadoLayout.setHorizontalGroup(
            jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_empleadoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                        .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jcb_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jp_empleadoLayout.setVerticalGroup(
            jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_empleadoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcb_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleado", jp_empleado);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Empresa");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Gerente General");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Gerentes");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("Empleados");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jtree_empresa.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jtree_empresa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administración", jPanel4);

        javax.swing.GroupLayout jd_empleadosLayout = new javax.swing.GroupLayout(jd_empleados.getContentPane());
        jd_empleados.getContentPane().setLayout(jd_empleadosLayout);
        jd_empleadosLayout.setHorizontalGroup(
            jd_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_empleadosLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_empleadosLayout.setVerticalGroup(
            jd_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Administrar");

        jmi_empleados.setText("Empleados");
        jmi_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_empleadosActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_empleados);
        jMenu1.add(jSeparator1);

        jmi_salir.setText("Salir");
        jmi_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_salirActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_salirActionPerformed
        JOptionPane.showConfirmDialog(this, 
                "¿Está seguro que desea salir?","Terminar Aplicación",JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_NO_OPTION==1){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jmi_salirActionPerformed

    private void jmi_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_empleadosActionPerformed
        //abrir JDialog empleados
        jd_empleados.pack();
        jd_empleados.setModal(true);
        jd_empleados.setLocationRelativeTo(this);
        jd_empleados.setVisible(true);
    }//GEN-LAST:event_jmi_empleadosActionPerformed

    private void bt_addCEOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCEOMouseClicked
        String nombre, password;
        int id, salario;
        
        
        
        if(cCEO==0){
            
            try{
                nombre = tf_nombreCEO.getText();
                password = tf_pwCEO.getText();
                id = Integer.parseInt(tf_ID_Empresa.getText());
                salario = Integer.parseInt(tf_salarioCEO.getText());
                ceo = new GerenteGeneral(nombre, password, salario, id);
                ceo.setListaGerentes(listaGerentes);
                DefaultListModel modeloLista = (DefaultListModel)jl_CEO.getModel();
                DefaultComboBoxModel modeloCB = (DefaultComboBoxModel)cb_jefeGerente.getModel();
                JOptionPane.showMessageDialog(jd_empleados, "Gerente General Agregado Correctamente");
                
                modeloCB.addElement(ceo);
                modeloLista.addElement(ceo);
                jl_CEO.setModel(modeloLista);
                cb_jefeGerente.setModel(modeloCB);
                cCEO++;
                
                tf_ID_Empresa.setText("");
                tf_nombreCEO.setText("");
                tf_pwCEO.setText("");
                tf_salarioCEO.setText("");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(jd_empleados, 
                        "El ID y Salario debe ser numérico!","Verifique ID y Salario",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(
                    jd_empleados, "Ya existe un Gerente General!",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            tf_ID_Empresa.setText("");
            tf_nombreCEO.setText("");
            tf_pwCEO.setText("");
            tf_salarioCEO.setText("");
        }
        
    }//GEN-LAST:event_bt_addCEOMouseClicked

    private void jl_CEOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_CEOMouseClicked
        
        if(jl_CEO.getSelectedIndex()>=0){
            tf_nombreCEO.setText(ceo.getNombre());
            tf_pwCEO.setText(ceo.getContrasena());
            tf_ID_Empresa.setText(ceo.getIdEmpresa()+"");
            tf_salarioCEO.setText(ceo.getSalario()+"");
            bt_addCEO.setEnabled(false);
        }
    }//GEN-LAST:event_jl_CEOMouseClicked

    private void bt_addManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addManagerMouseClicked
        String nombre, password;
        int id, salario;
        
        try{
            nombre = tf_nombreManager.getText();
            password = tf_passwordManager.getText();
            id = Integer.parseInt(tf_idEmpresaManager.getText());
            salario = Integer.parseInt(tf_salarioManager.getText());
            
            DefaultListModel modeloLista = (DefaultListModel)jl
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_bt_addManagerMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addCEO;
    private javax.swing.JButton bt_addManager;
    private javax.swing.JButton bt_delCEO;
    private javax.swing.JButton bt_delManager;
    private javax.swing.JButton bt_editCEO;
    private javax.swing.JButton bt_editManager;
    private javax.swing.JComboBox<String> cb_jefeGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> jcb_jefe;
    private javax.swing.JDialog jd_empleados;
    private javax.swing.JList<String> jl_CEO;
    private javax.swing.JList<String> jl_managers;
    private javax.swing.JMenuItem jmi_empleados;
    private javax.swing.JMenuItem jmi_salir;
    private javax.swing.JPanel jp_ceo;
    private javax.swing.JPanel jp_empleado;
    private javax.swing.JPanel jp_gerente;
    private javax.swing.JTree jtree_empresa;
    private javax.swing.JTextField tf_ID_Empresa;
    private javax.swing.JTextField tf_idEmpresaManager;
    private javax.swing.JTextField tf_nombreCEO;
    private javax.swing.JTextField tf_nombreManager;
    private javax.swing.JTextField tf_passwordManager;
    private javax.swing.JPasswordField tf_pwCEO;
    private javax.swing.JTextField tf_salarioCEO;
    private javax.swing.JTextField tf_salarioManager;
    // End of variables declaration//GEN-END:variables

    int cCEO = 0;
    GerenteGeneral ceo;
    ArrayList<Gerente> listaGerentes = new ArrayList();
    ArrayList<Empleado> listaEmpleados = new ArrayList();
}
