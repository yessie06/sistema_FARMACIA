/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

//import capaPresntacion.Producto_IU;
//import capaPresntacion.Marca_IU;
//import capaPresntacion.Categoria_IU;
//import capaPresntacion.Medida_IU;
import java.awt.Dimension;

/**
 *
 * @author USUARIO
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btnProductos = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnIngresos = new javax.swing.JButton();
        btnEgresos = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_item_laboratorio = new javax.swing.JMenu();
        menu_iten_tipousuario = new javax.swing.JMenuItem();
        menu_item_usuario = new javax.swing.JMenuItem();
        Menu_Item_Turno = new javax.swing.JMenuItem();
        Menu_Item_Laboratorio = new javax.swing.JMenuItem();
        menu_item_categoria = new javax.swing.JMenuItem();
        menu_item_medida = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FARMACIA");

        escritorio.setBackground(new java.awt.Color(51, 51, 51));
        escritorio.setForeground(new java.awt.Color(153, 153, 255));

        jToolBar1.setRollover(true);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/box.png"))); // NOI18N
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra.png"))); // NOI18N
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresos.png"))); // NOI18N
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);

        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/egresos.png"))); // NOI18N
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);

        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta1.png"))); // NOI18N
        btnVenta.setFocusable(false);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVenta);

        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_1.png"))); // NOI18N
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCaja);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar_1.png"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCerrar);

        escritorio.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
        );

        Menu_item_laboratorio.setText("MANTENIMIENTO");
        Menu_item_laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_item_laboratorioActionPerformed(evt);
            }
        });

        menu_iten_tipousuario.setText("Tipo de Usuario");
        menu_iten_tipousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_iten_tipousuarioActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(menu_iten_tipousuario);

        menu_item_usuario.setText("Usuario");
        menu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_usuarioActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(menu_item_usuario);

        Menu_Item_Turno.setText("Turno");
        Menu_Item_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Item_TurnoActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(Menu_Item_Turno);

        Menu_Item_Laboratorio.setText("Laboratorio");
        Menu_Item_Laboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Item_LaboratorioActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(Menu_Item_Laboratorio);

        menu_item_categoria.setText("Categotia");
        menu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_categoriaActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(menu_item_categoria);

        menu_item_medida.setText("Medida");
        menu_item_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_medidaActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(menu_item_medida);

        jMenuItem1.setText("Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_item_laboratorio.add(jMenuItem1);

        jMenuBar1.add(Menu_item_laboratorio);

        menu_compras.setText("COMPRAS");
        jMenuBar1.add(menu_compras);

        menu_inventario.setText("INVENTARIO");
        jMenuBar1.add(menu_inventario);

        menu_ventas.setText("VENTAS");
        jMenuBar1.add(menu_ventas);

        menu_caja.setText("CAJA");
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_iten_tipousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_iten_tipousuarioActionPerformed
        // TODO add your handling code here:
        TipoUsuario_IU frame = new TipoUsuario_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_iten_tipousuarioActionPerformed

    private void menu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_usuarioActionPerformed
        // TODO add your handling code here:
        Usuario_IU frame = new Usuario_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();

    }//GEN-LAST:event_menu_item_usuarioActionPerformed

    private void Menu_item_laboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_item_laboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_item_laboratorioActionPerformed

    private void Menu_Item_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Item_TurnoActionPerformed
        // TODO add your handling code here:
        Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_Menu_Item_TurnoActionPerformed

    private void Menu_Item_LaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Item_LaboratorioActionPerformed
        // TODO add your handling code here:
//        Marca_IU frame = new Marca_IU();
//        escritorio.add(frame);
//        Dimension desktopSize = escritorio.getSize();
//        Dimension FrameSize = frame.getSize();
//        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
//
//        frame.show();

    }//GEN-LAST:event_Menu_Item_LaboratorioActionPerformed

    private void menu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_categoriaActionPerformed
//        // TODO add your handling code here:
//        Categoria_IU frame = new Categoria_IU();
//        escritorio.add(frame);
//        Dimension desktopSize = escritorio.getSize();
//        Dimension FrameSize = frame.getSize();
//        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
//
//        frame.show();


    }//GEN-LAST:event_menu_item_categoriaActionPerformed

    private void menu_item_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_medidaActionPerformed
        // TODO add your handling code here:
//         Medida_IU frame = new Medida_IU();
//        escritorio.add(frame);
//        Dimension desktopSize = escritorio.getSize();
//        Dimension FrameSize = frame.getSize();
//        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
//
//        frame.show();


        
    }//GEN-LAST:event_menu_item_medidaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//         Producto_IU frame = new Producto_IU();
//        escritorio.add(frame);
//        Dimension desktopSize = escritorio.getSize();
//        Dimension FrameSize = frame.getSize();
//        frame.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
//
//        frame.show();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Menu_Item_Laboratorio;
    private javax.swing.JMenuItem Menu_Item_Turno;
    public javax.swing.JMenu Menu_item_laboratorio;
    private javax.swing.JButton btnCaja;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnEgresos;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnVenta;
    public static javax.swing.JDesktopPane escritorio;
    public javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JMenu menu_caja;
    public javax.swing.JMenu menu_compras;
    public javax.swing.JMenu menu_inventario;
    private javax.swing.JMenuItem menu_item_categoria;
    private javax.swing.JMenuItem menu_item_medida;
    private javax.swing.JMenuItem menu_item_usuario;
    private javax.swing.JMenuItem menu_iten_tipousuario;
    public javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
