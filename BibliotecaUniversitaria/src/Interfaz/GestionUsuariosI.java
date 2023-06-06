/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import CodigoFuente.GestionPublicaciones;
import CodigoFuente.Usuario;
import CodigoFuente.GestionUsuarios;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto y Alin
 */
public class GestionUsuariosI extends javax.swing.JFrame {

    /**
     * Creates new form GestionUsuariosI
     */
    private JFrame principal;
    public GestionUsuariosI(JFrame ventana) {
        initComponents();
        principal = ventana;
        principal.setVisible(false);
        this.setVisible(true);
    }
    // Metodo para cambiar el icono de la taza de java por uno propio
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

        PanelFondo1 = new javax.swing.JPanel();
        Tabla1 = new javax.swing.JTabbedPane();
        RegistroUsuarios = new javax.swing.JPanel();
        NombreLabel2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JTextField();
        NIFLabel2 = new javax.swing.JLabel();
        texto2 = new javax.swing.JTextField();
        CategoriaLabel2 = new javax.swing.JLabel();
        seleccionar1 = new javax.swing.JComboBox<>();
        Registrar1 = new javax.swing.JButton();
        comprobar1 = new javax.swing.JButton();
        CategoriaLabel3 = new javax.swing.JLabel();
        texto3 = new javax.swing.JTextField();
        Usuarios = new javax.swing.JPanel();
        NIFLabel1 = new javax.swing.JLabel();
        texto4 = new javax.swing.JTextField();
        Eliminar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ConsultaUsuarios = new javax.swing.JPanel();
        UsuariosLabel1 = new javax.swing.JLabel();
        Actualizar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        Anagrama = new javax.swing.JLabel();
        Ttitulo = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelFondo1.setBackground(new java.awt.Color(204, 204, 255));

        Tabla1.setBackground(new java.awt.Color(51, 255, 255));
        Tabla1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        RegistroUsuarios.setBackground(new java.awt.Color(204, 204, 255));

        NombreLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NombreLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLabel2.setText("Nombre");

        texto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NIFLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NIFLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NIFLabel2.setText("NIF");

        texto2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CategoriaLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CategoriaLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CategoriaLabel2.setText("Categoria");

        seleccionar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        seleccionar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno", "Profesor" }));

        Registrar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Registrar1.setText("Registrar");
        Registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar1ActionPerformed(evt);
            }
        });

        comprobar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comprobar1.setText("Comprobar");
        comprobar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobar1ActionPerformed(evt);
            }
        });

        CategoriaLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CategoriaLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CategoriaLabel3.setText("-");

        texto3.setEditable(false);
        texto3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout RegistroUsuariosLayout = new javax.swing.GroupLayout(RegistroUsuarios);
        RegistroUsuarios.setLayout(RegistroUsuariosLayout);
        RegistroUsuariosLayout.setHorizontalGroup(
            RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroUsuariosLayout.createSequentialGroup()
                .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroUsuariosLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NIFLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(RegistroUsuariosLayout.createSequentialGroup()
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CategoriaLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(comprobar1))))
                    .addGroup(RegistroUsuariosLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(CategoriaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(seleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroUsuariosLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(Registrar1)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        RegistroUsuariosLayout.setVerticalGroup(
            RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroUsuariosLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIFLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprobar1))
                .addGap(58, 58, 58)
                .addGroup(RegistroUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoriaLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(Registrar1)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        Tabla1.addTab("Registro Usuarios", RegistroUsuarios);

        Usuarios.setBackground(new java.awt.Color(204, 204, 255));
        Usuarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        NIFLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NIFLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NIFLabel1.setText("NIF ");

        texto4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Eliminar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Eliminar1.setText("Eliminar");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Formato para dar de baja (00000000-U)");

        javax.swing.GroupLayout UsuariosLayout = new javax.swing.GroupLayout(Usuarios);
        Usuarios.setLayout(UsuariosLayout);
        UsuariosLayout.setHorizontalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminar1)
                .addGap(279, 279, 279))
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(NIFLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        UsuariosLayout.setVerticalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(85, 85, 85)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIFLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(Eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        Tabla1.addTab("Baja  usuario", Usuarios);

        ConsultaUsuarios.setBackground(new java.awt.Color(204, 204, 255));

        UsuariosLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsuariosLabel1.setText("USUARIOS");

        Actualizar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Actualizar1.setText("Consultar");
        Actualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar1ActionPerformed(evt);
            }
        });

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout ConsultaUsuariosLayout = new javax.swing.GroupLayout(ConsultaUsuarios);
        ConsultaUsuarios.setLayout(ConsultaUsuariosLayout);
        ConsultaUsuariosLayout.setHorizontalGroup(
            ConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaUsuariosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(ConsultaUsuariosLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(UsuariosLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(Actualizar1)))
                .addGap(19, 19, 19))
        );
        ConsultaUsuariosLayout.setVerticalGroup(
            ConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsuariosLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        Tabla1.addTab("Consulta Usuarios", ConsultaUsuarios);

        Anagrama.setBackground(new java.awt.Color(0, 51, 255));
        Anagrama.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Anagrama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anagrama.setText("Biblioteca Universitaria");

        Ttitulo.setFont(new java.awt.Font("Arial Black", 2, 24)); // NOI18N
        Ttitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttitulo.setText("Gestión Usuarios");

        Volver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondo1Layout = new javax.swing.GroupLayout(PanelFondo1);
        PanelFondo1.setLayout(PanelFondo1Layout);
        PanelFondo1Layout.setHorizontalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Anagrama)
                .addContainerGap())
            .addGroup(PanelFondo1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelFondo1Layout.setVerticalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver1))
                .addGap(7, 7, 7)
                .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(636, 586));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Pestaña Baja Usuario
    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        // Dar de baja a un usuario mediante su NIF
        try{
            String nif = texto4.getText();
            if(nif.equals("")){
                    JOptionPane.showMessageDialog(this,"Rellene el campo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }            
            if(GestionUsuarios.getUsuarios().containsKey(nif)){                
                GestionUsuarios.bajaUsuario(nif);
                JOptionPane.showMessageDialog(this,"Dado de baja correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Usuario no exite","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);            
        }
        
    }//GEN-LAST:event_Eliminar1ActionPerformed
    // Pestaña Registro Usuarios
    private void Registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar1ActionPerformed
        // Registro de usuarios (Alumno o Profesor)
        try{
            String nombre = texto1.getText();
            String nif = texto2.getText()+"-"+texto3.getText();
            LocalDate ld = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String fecha = ld.format(formatter);
            if(nombre.equals("")|| nif.equals("")){
                JOptionPane.showMessageDialog(this,"Rellene los campos correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
            if(!GestionUsuarios.getUsuarios().containsKey(nif)){
                if(seleccionar1.getSelectedItem().equals("Alumno")){
                    Usuario u = new Usuario(nif,nombre,"Alumno",fecha);
                    GestionUsuarios.altaUsuario(u); 
                    JOptionPane.showMessageDialog(this,"Alumno registrado correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
                else if(seleccionar1.getSelectedItem().equals("Profesor")){
                    Usuario p = new Usuario(nif,nombre,"Profesor",fecha);
                    GestionUsuarios.altaUsuario(p);     
                    JOptionPane.showMessageDialog(this,"Profesor registrado correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            } else{
                JOptionPane.showMessageDialog(this,"Este usuario ya esta dado de alta","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }        
        texto1.setText("");
        texto2.setText("");   
        texto3.setText("");  
    }//GEN-LAST:event_Registrar1ActionPerformed
    // Volver
    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_Volver1ActionPerformed
    // Pestaña Consulta Usuarios
    private void Actualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar1ActionPerformed
        // Mostramos todos los usuarios registrados en el sistema  
        try{
        ArrayList<Usuario> usuario = usuariosF();
        DefaultTableModel modelo1 = new DefaultTableModel();
        modelo1.addColumn("NIF");
        modelo1.addColumn("NOMBRE");
        modelo1.addColumn("CATEGORIA");
        modelo1.addColumn("FECHA INSCRIPCION");
        for(int i=0;i<usuario.size();i++){
            Usuario u = (Usuario) usuario.get(i);
            Object v1 [] = {u.getNif(),u.getNombre(),u.getCategoria(),u.getFechaInscripcion()};
            modelo1.addRow(v1);
        }
        tabla1.setModel(modelo1); 
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,"ERROR:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Actualizar1ActionPerformed

   // Pestaña Registro Usuarios
    private void comprobar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobar1ActionPerformed
        // Mostar la letra del nif de un usuario que va a ser registrado.
        String dni = texto2.getText();        
        if(comprobarDni(dni)){
            texto3.setText(String.valueOf(calculaLetraNIF(Integer.parseInt(dni))));
        }           
    }//GEN-LAST:event_comprobar1ActionPerformed
    // Guardar datos
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Guardamos datos antes de salir de la aplicacion
        GestionPublicaciones.guardarPublicaciones();
        GestionUsuarios.guardarUsuarios();        
    }//GEN-LAST:event_formWindowClosing
    // Metodo para comprobar si el usuario introduce 8 digitos
    private boolean comprobarDni(String dni){
        if(dni.length() != 8){
            JOptionPane.showMessageDialog(this,"Introduzca 8 numeros","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }else
            return true;
    }
    // Metodo para calcular la letra a partir de los 8 digitos introducidos
    private char calculaLetraNIF(int dninum) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int pos = dninum % 23;
        return letras[pos];
}
    private ArrayList usuariosF(){
        ArrayList<Usuario> us = new ArrayList();
        Iterator it = GestionUsuarios.getUsuarios().entrySet().iterator();        
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();            
            String key = (String) e.getKey();             
            Usuario u =  GestionUsuarios.getUsuarios().get(key);
            us.add(u);
        }
    return us;
}    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar1;
    private javax.swing.JLabel Anagrama;
    private javax.swing.JLabel CategoriaLabel2;
    private javax.swing.JLabel CategoriaLabel3;
    private javax.swing.JPanel ConsultaUsuarios;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JLabel NIFLabel1;
    private javax.swing.JLabel NIFLabel2;
    private javax.swing.JLabel NombreLabel2;
    private javax.swing.JPanel PanelFondo1;
    private javax.swing.JButton Registrar1;
    private javax.swing.JPanel RegistroUsuarios;
    private javax.swing.JTabbedPane Tabla1;
    private javax.swing.JLabel Ttitulo;
    private javax.swing.JPanel Usuarios;
    private javax.swing.JLabel UsuariosLabel1;
    private javax.swing.JButton Volver1;
    private javax.swing.JButton comprobar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccionar1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto4;
    // End of variables declaration//GEN-END:variables
}