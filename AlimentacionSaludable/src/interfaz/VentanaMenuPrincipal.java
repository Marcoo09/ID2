package interfaz;

import dominio.Persona;
import dominio.Sistema;
import java.awt.Image;
import java.awt.Toolkit;

public final class VentanaMenuPrincipal extends javax.swing.JDialog {

    private Sistema sistema;

    public VentanaMenuPrincipal(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sistema = unSistema;
        this.listaUsuariosVentana.setListData(sistema.getListaUsuarios().toArray());
        this.listaProfesionalesVentana.setListData(sistema.getListaProfesionales().toArray());
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Imagen5.png"));
        return retValue;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema unSistema) {
        this.sistema = unSistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblTituloVentana = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        lblTituloVentana1 = new javax.swing.JLabel();
        btnCerrarSistema = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        lblNuevoUsuario = new javax.swing.JLabel();
        lblIconoNuevoUsuario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaUsuariosVentana = new javax.swing.JList();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProfesionalesVentana = new javax.swing.JList();
        btnAgregarUsuario = new javax.swing.JLabel();
        iconPlus = new javax.swing.JLabel();
        lblRegistrarProfesional = new javax.swing.JLabel();
        btnAgregarProfesional = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblRegistrarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(164, 211, 249));

        lblTituloVentana.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana.setText("Saludable");

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoBrocoli.png"))); // NOI18N

        lblTituloVentana1.setFont(new java.awt.Font("Segoe Script", 1, 50)); // NOI18N
        lblTituloVentana1.setForeground(new java.awt.Color(0, 51, 153));
        lblTituloVentana1.setText("Alimentación");

        btnCerrarSistema.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setForeground(new java.awt.Color(51, 51, 51));
        btnCerrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Close_Window_48px.png"))); // NOI18N
        btnCerrarSistema.setBorderPainted(false);
        btnCerrarSistema.setContentAreaFilled(false);
        btnCerrarSistema.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSistema.setFocusPainted(false);
        btnCerrarSistema.setInheritsPopupMenu(true);
        btnCerrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblTituloVentana))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCerrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblTituloVentana1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(lblTituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(lblTituloVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
        );

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 390, 750);

        panel2.setBackground(new java.awt.Color(51, 51, 51));
        panel2.setForeground(new java.awt.Color(51, 51, 51));
        panel2.setLayout(null);

        lblNuevoUsuario.setFont(new java.awt.Font("Levenim MT", 0, 65)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setText("Inicio de Sesión");
        panel2.add(lblNuevoUsuario);
        lblNuevoUsuario.setBounds(240, 30, 470, 91);

        lblIconoNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fotoDeUsuarioStandard.png"))); // NOI18N
        panel2.add(lblIconoNuevoUsuario);
        lblIconoNuevoUsuario.setBounds(130, 30, 100, 100);

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Profesional");
        panel2.add(lblNombre);
        lblNombre.setBounds(580, 150, 181, 38);

        listaUsuariosVentana.setBackground(new java.awt.Color(51, 51, 51));
        listaUsuariosVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaUsuariosVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaUsuariosVentana.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaUsuariosVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaUsuariosVentanaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaUsuariosVentana);

        panel2.add(jScrollPane2);
        jScrollPane2.setBounds(80, 190, 230, 330);

        listaProfesionalesVentana.setBackground(new java.awt.Color(51, 51, 51));
        listaProfesionalesVentana.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        listaProfesionalesVentana.setForeground(new java.awt.Color(255, 255, 255));
        listaProfesionalesVentana.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaProfesionalesVentanaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaProfesionalesVentana);

        panel2.add(jScrollPane1);
        jScrollPane1.setBounds(550, 190, 230, 330);

        btnAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarUsuario.png"))); // NOI18N
        btnAgregarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarUsuarioMouseClicked(evt);
            }
        });
        panel2.add(btnAgregarUsuario);
        btnAgregarUsuario.setBounds(150, 540, 110, 90);

        iconPlus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarProf.png"))); // NOI18N
        panel2.add(iconPlus);
        iconPlus.setBounds(680, 580, 50, 80);

        lblRegistrarProfesional.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblRegistrarProfesional.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarProfesional.setText("Regístrate como profesional");
        panel2.add(lblRegistrarProfesional);
        lblRegistrarProfesional.setBounds(530, 640, 290, 38);

        btnAgregarProfesional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarProfesional.png"))); // NOI18N
        btnAgregarProfesional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProfesionalMouseClicked(evt);
            }
        });
        panel2.add(btnAgregarProfesional);
        btnAgregarProfesional.setBounds(620, 540, 100, 90);

        lblNombre2.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Usuario");
        panel2.add(lblNombre2);
        lblNombre2.setBounds(140, 150, 110, 38);

        lblRegistrarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lblRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarUsuario.setText("Regístrate como usuario");
        panel2.add(lblRegistrarUsuario);
        lblRegistrarUsuario.setBounds(80, 640, 260, 38);

        getContentPane().add(panel2);
        panel2.setBounds(395, 0, 900, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.sistema.guardarDatosSistema();
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void listaUsuariosVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaUsuariosVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaUsuariosVentana.getSelectedValue());
        VentanaMenuPrincipalUsuario ventanaPrincipalUsuarios = new VentanaMenuPrincipalUsuario(sistema);
        this.setVisible(false);
        ventanaPrincipalUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaUsuariosVentanaValueChanged

    private void listaProfesionalesVentanaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaProfesionalesVentanaValueChanged
        this.sistema.setPersonaLogueada((Persona) listaProfesionalesVentana.getSelectedValue());
        VentanaMenuPrincipalProfesional ventanaPrincipalProfesionales = new VentanaMenuPrincipalProfesional(sistema);
        this.setVisible(false);
        ventanaPrincipalProfesionales.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listaProfesionalesVentanaValueChanged

    private void btnAgregarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioMouseClicked
        VentanaRegistrarUsuario ventanaRegistrarUsuario = new VentanaRegistrarUsuario(sistema);
        this.setVisible(false);
        ventanaRegistrarUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarUsuarioMouseClicked

    private void btnAgregarProfesionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProfesionalMouseClicked
        VentanaRegistrarProfesional ventanaRegProfesional = new VentanaRegistrarProfesional(sistema);
        this.setVisible(false);
        ventanaRegProfesional.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarProfesionalMouseClicked

    private void btnCerrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSistemaActionPerformed
        this.sistema.guardarDatosSistema();
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnCerrarSistemaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarProfesional;
    private javax.swing.JLabel btnAgregarUsuario;
    private javax.swing.JButton btnCerrarSistema;
    private javax.swing.JLabel iconPlus;
    private javax.swing.JLabel icono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIconoNuevoUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JLabel lblRegistrarProfesional;
    private javax.swing.JLabel lblRegistrarUsuario;
    private javax.swing.JLabel lblTituloVentana;
    private javax.swing.JLabel lblTituloVentana1;
    private javax.swing.JList listaProfesionalesVentana;
    private javax.swing.JList listaUsuariosVentana;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables

}
