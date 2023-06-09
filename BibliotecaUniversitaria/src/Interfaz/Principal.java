/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import CodigoFuente.GestionPublicaciones;
import CodigoFuente.Administrador;
import CodigoFuente.Excepciones;
import CodigoFuente.FechaPrestamo;
import CodigoFuente.GestionUsuarios;
import CodigoFuente.Libros;
import CodigoFuente.Proyectos;
import CodigoFuente.Publicacion;
import CodigoFuente.Revistas;
import CodigoFuente.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto y Alin
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    private Administrador admin;
    public Principal() {
        initComponents();
        GestionPublicaciones.cargarPublicaciones();
        GestionUsuarios.cargarUsuarios();
        admin = new Administrador("admin","1234");       
    }
    // Metodo para cambiar el icono de la taza de java por uno propio.
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Anagrama = new javax.swing.JLabel();
        Ttitulo = new javax.swing.JLabel();
        ContraseñaLabel1 = new javax.swing.JLabel();
        UsuarioLabel1 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        texto2 = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Universitaria");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(204, 204, 255));
        Panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N

        Anagrama.setBackground(new java.awt.Color(0, 51, 255));
        Anagrama.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Anagrama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anagrama.setText("Biblioteca Universitaria");

        Ttitulo.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        Ttitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttitulo.setText("Bienvenido");

        ContraseñaLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContraseñaLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContraseñaLabel1.setText("Contraseña");

        UsuarioLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UsuarioLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioLabel1.setText("Usuario");

        texto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        texto2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Entrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Entrar.setText("Entrar");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ContraseñaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(texto1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(texto2)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Entrar)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(Anagrama)
                        .addContainerGap())))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Anagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UsuarioLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ContraseñaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(Entrar)
                .addGap(184, 184, 184))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(616, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        /**
         * Solo se contempla la utilizacion del sistema por un unico empleado de la biblioteca.
         * Por lo tanto, el usuario sera "admin" y contraseña "1234".
         */         
        try{
            char[] pass = texto2.getPassword();
            String contraseña = new String(pass);
            String usuario = texto1.getText();
            if(usuario.equals("") || contraseña.equals("")){
                JOptionPane.showMessageDialog(this,"Rellene todos los campos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(admin.getUsuario().equals(usuario)&& admin.getContraseña().equals(contraseña)){
                Gestion gestion = new Gestion(this);
            }else{
                JOptionPane.showMessageDialog(this,"Usuario y contraseña incorrectos","Mensaje",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }        
        // Borramos lo escrito
        texto1.setText("");
        texto2.setText("");
    }//GEN-LAST:event_EntrarActionPerformed
    // Guardar datos
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Guardamos los datos cuando cerramos ventana terminando la aplicacion.
        GestionPublicaciones.guardarPublicaciones();
        GestionUsuarios.guardarUsuarios();
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JLabel Anagrama;
    private javax.swing.JLabel ContraseñaLabel1;
    private javax.swing.JButton Entrar;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Ttitulo;
    private javax.swing.JLabel UsuarioLabel1;
    private javax.swing.JTextField texto1;
    private javax.swing.JPasswordField texto2;
    // End of variables declaration//GEN-END:variables
}
