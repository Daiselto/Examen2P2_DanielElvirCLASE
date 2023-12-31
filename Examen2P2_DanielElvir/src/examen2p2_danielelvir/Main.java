/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen2p2_danielelvir;

import java.awt.Component;
import java.awt.MenuComponent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

//getselectionpath getlastcomponent
/**
 *
 * @author HP
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_Contextual = new javax.swing.JPopupMenu();
        CalificarAlumno = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        VerNotas = new javax.swing.JMenuItem();
        EliminarAlumno = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        EximirAlumno = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Principal = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_Calificacion = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jl_ID = new javax.swing.JLabel();
        JL_DNI = new javax.swing.JLabel();
        jl_Clase = new javax.swing.JLabel();
        jl_Alumno = new javax.swing.JLabel();

        CalificarAlumno.setText("Calificar Alumno");
        pp_Contextual.add(CalificarAlumno);
        pp_Contextual.add(jSeparator2);

        VerNotas.setText("Ver Suma de Notas");
        pp_Contextual.add(VerNotas);

        EliminarAlumno.setText("Eliminar Alumno");
        EliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAlumnoActionPerformed(evt);
            }
        });
        pp_Contextual.add(EliminarAlumno);
        pp_Contextual.add(jSeparator3);

        EximirAlumno.setText("Eximir Alumno");
        pp_Contextual.add(EximirAlumno);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setForeground(new java.awt.Color(0, 51, 153));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("UNIVERSIDAD");
        JT_Principal.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JT_Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_PrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JT_Principal);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Actualizar Arbol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Administracion de Notas");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Clase");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Clase");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Alumno");

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Calificar Tareas");

        JT_Calificacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Actividad", "Valor", "Nota"
            }
        ));
        jScrollPane2.setViewportView(JT_Calificacion);

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Guardar los cambios de nota en la base de datos");

        jl_ID.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_ID.setForeground(new java.awt.Color(204, 0, 51));
        jl_ID.setText("x");
        jl_ID.setToolTipText(".");

        JL_DNI.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        JL_DNI.setForeground(new java.awt.Color(204, 0, 51));
        JL_DNI.setText("x");
        JL_DNI.setToolTipText(".");

        jl_Clase.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_Clase.setForeground(new java.awt.Color(204, 0, 51));
        jl_Clase.setText("x");
        jl_Clase.setToolTipText(".");

        jl_Alumno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jl_Alumno.setForeground(new java.awt.Color(204, 0, 51));
        jl_Alumno.setText("x");
        jl_Alumno.setToolTipText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JL_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jl_ID)
                    .addComponent(jl_Clase))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(JL_DNI)
                    .addComponent(jl_Alumno))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTreeModel modelo = (DefaultTreeModel) JT_Principal.getModel();

        tempAlumno = new ArrayList();

        File fcarros = null;
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc = null;
        int count = 0;

        try {
            fcarros = new File("./Datos.txt");
            fr = new FileReader(fcarros);
            br = new BufferedReader(fr);

            if (fcarros.exists()) {
                String cadena;
                String nom;
                int cuenta;
                String id;
                String correo;
                int id_clase;
                String Clase;
                String campus;
                String tipo;
                String ciudad;
                String facultad;

                DefaultTreeModel modeloTree = (DefaultTreeModel) JT_Principal.getModel();
                String linea;
                linea = br.readLine();
                linea = br.readLine();
                linea = br.readLine();
                linea = br.readLine();
                linea = br.readLine();
                linea = br.readLine();

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                    String[] alumnos = linea.split("\\|");
                    System.out.println(alumnos.length);
                    if (alumnos.length == 5) {
                        nom = alumnos[0];
                        System.out.println(nom);
                        String[] CuentayID = alumnos[1].split("&");
                        cuenta = Integer.parseInt(CuentayID[0].substring(0, CuentayID[0].length()));
                        System.out.println(cuenta);
                        id = CuentayID[1];
                        System.out.println(id);
                        correo = alumnos[2];
                        System.out.println(correo);
                        String[] tercera = alumnos[3].split("#");
                        String[] clases = tercera[0].split(",");
                        String[] infoCamp = tercera[1].split(";");
                        id_clase = Integer.parseInt(clases[0]);
                        System.out.println(id_clase);
                        Clase = clases[1];
                        System.out.println(Clase);
                        campus = infoCamp[0];
                        System.out.println(campus);
                        tipo = infoCamp[1];
                        System.out.println(tipo);
                        ciudad = infoCamp[2];
                        System.out.println(ciudad);
                        facultad = alumnos[4];
                        System.out.println(facultad);
                        if (infoCamp[1].equalsIgnoreCase("ALUMNO")) {
                            Alumno x = new Alumno(nom, cuenta, id, correo, id_clase, Clase, campus, tipo, ciudad, facultad);
                            tempAlumno.add(x);
                            System.out.println(tempAlumno);
                        }
                    }
                }
                System.out.println(tempAlumno);
                JT_Principal.setModel(modeloTree);
            }

            br.close();
            fr.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error, puede que alguno de los archivos no exista.");
            e.printStackTrace();
        } finally {
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
            DefaultMutableTreeNode pr2 = null;
            DefaultMutableTreeNode pr4 = null;
            DefaultMutableTreeNode web = null;
            DefaultMutableTreeNode nombre1 = null;
            DefaultMutableTreeNode nombre2 = null;
            DefaultMutableTreeNode nombre3 = null;
            DefaultMutableTreeNode act1 = null;
            DefaultMutableTreeNode act2 = null;
            DefaultMutableTreeNode act3 = null;
            pr2 = new DefaultMutableTreeNode("PROGRAMACION II");
            pr4 = new DefaultMutableTreeNode("PROGRAMACION IV");
            web = new DefaultMutableTreeNode("WEB");
            raiz.add(pr2);
            raiz.add(pr4);
            raiz.add(web);
            for (Alumno a : tempAlumno) {
                if (a.getClase().equals("PROGRAMACIÓN II")) {
                    nombre1 = new DefaultMutableTreeNode(a.getNombre());
                    pr2.add(nombre1);
                }
            }

            for (Alumno a2 : tempAlumno) {
                if (a2.getClase().equals("PROGRAMACION IV")) {
                    nombre2 = new DefaultMutableTreeNode(a2.getNombre());
                    pr4.add(nombre2);
                }
            }

            for (Alumno a3 : tempAlumno) {
                if (a3.getClase().equals("WEB")) {
                    nombre3 = new DefaultMutableTreeNode(a3.getNombre());
                    web.add(nombre3);

                }
            }

            Dba db = new Dba("./examen 2.mdb");
            db.conectar();
            try {
                db.query.execute("SELECT a.descripcion_actividad"
                        + "FROM actividades a ");
                
                ResultSet rs = db.query.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
                
                
                
                db.desconectar();
            } catch (Exception e) {
            }

            modelo.reload();
            JT_Principal.setModel(modelo);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void JT_PrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_PrincipalMouseClicked
        if (evt.isMetaDown()) {
            pp_Contextual.show(JT_Principal, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_JT_PrincipalMouseClicked

    private void EliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAlumnoActionPerformed
        JT_Principal.remove((Component) JT_Principal.getSelectionPath().getLastPathComponent());
    }//GEN-LAST:event_EliminarAlumnoActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private ArrayList<Alumno> tempAlumno = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CalificarAlumno;
    private javax.swing.JMenuItem EliminarAlumno;
    private javax.swing.JMenuItem EximirAlumno;
    private javax.swing.JLabel JL_DNI;
    private javax.swing.JTable JT_Calificacion;
    private javax.swing.JTree JT_Principal;
    private javax.swing.JMenuItem VerNotas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel jl_Alumno;
    private javax.swing.JLabel jl_Clase;
    private javax.swing.JLabel jl_ID;
    private javax.swing.JPopupMenu pp_Contextual;
    // End of variables declaration//GEN-END:variables
}
