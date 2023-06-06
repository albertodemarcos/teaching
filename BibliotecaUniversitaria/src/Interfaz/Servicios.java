/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import CodigoFuente.GestionPublicaciones;
import CodigoFuente.GestionUsuarios;
import CodigoFuente.Publicacion;
import CodigoFuente.Usuario;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alberto y Alin
 */
public class Servicios extends javax.swing.JFrame {

    /**
     * Creates new form Servicios
     */
    private JFrame principal;
    public Servicios(JFrame ventana) {
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
        Tablero1 = new javax.swing.JTabbedPane();
        BusquedaPublicaciones = new javax.swing.JPanel();
        var2 = new javax.swing.JRadioButton();
        texto2 = new javax.swing.JTextField();
        texto1 = new javax.swing.JTextField();
        var1 = new javax.swing.JRadioButton();
        seleccionar1 = new javax.swing.JComboBox<>();
        Limpiar1 = new javax.swing.JButton();
        Buscar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoArea1 = new javax.swing.JTextArea();
        seleccionar2 = new javax.swing.JComboBox<>();
        Prestamos = new javax.swing.JPanel();
        Solicitar1 = new javax.swing.JButton();
        texto4 = new javax.swing.JTextField();
        ISBNLabel1 = new javax.swing.JLabel();
        texto3 = new javax.swing.JTextField();
        NIFLabel1 = new javax.swing.JLabel();
        FechaPrestamoLabel1 = new javax.swing.JLabel();
        textoMes1 = new javax.swing.JTextField();
        BarraLabel1 = new javax.swing.JLabel();
        textoDia1 = new javax.swing.JTextField();
        textoAnio1 = new javax.swing.JTextField();
        BarraLabel2 = new javax.swing.JLabel();
        Devoluciones = new javax.swing.JPanel();
        NIFLabel2 = new javax.swing.JLabel();
        texto5 = new javax.swing.JTextField();
        FechaDevolucionLabel2 = new javax.swing.JLabel();
        texto6 = new javax.swing.JTextField();
        Devolver1 = new javax.swing.JButton();
        Anagrama = new javax.swing.JLabel();
        Volver1 = new javax.swing.JButton();
        Ttitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PanelFondo1.setBackground(new java.awt.Color(204, 204, 255));

        Tablero1.setBackground(new java.awt.Color(102, 204, 255));
        Tablero1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        BusquedaPublicaciones.setBackground(new java.awt.Color(204, 204, 255));

        var2.setBackground(new java.awt.Color(204, 204, 204));
        var2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        var2.setText("Título");

        texto2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        texto1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        var1.setBackground(new java.awt.Color(204, 204, 204));
        var1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        var1.setText("Autor");

        seleccionar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        seleccionar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AutorTitulo", "MateriaFechaP" }));
        seleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionar1ActionPerformed(evt);
            }
        });

        Limpiar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Limpiar1.setText("Limpiar");
        Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar1ActionPerformed(evt);
            }
        });

        Buscar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Buscar1.setText("Buscar");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });

        textoArea1.setColumns(20);
        textoArea1.setRows(5);
        jScrollPane1.setViewportView(textoArea1);

        seleccionar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        seleccionar2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Revistas", "Proyectos" }));

        javax.swing.GroupLayout BusquedaPublicacionesLayout = new javax.swing.GroupLayout(BusquedaPublicaciones);
        BusquedaPublicaciones.setLayout(BusquedaPublicacionesLayout);
        BusquedaPublicacionesLayout.setHorizontalGroup(
            BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BusquedaPublicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(BusquedaPublicacionesLayout.createSequentialGroup()
                                .addComponent(var1)
                                .addGap(244, 244, 244)
                                .addComponent(var2)
                                .addGap(18, 18, 18)
                                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BusquedaPublicacionesLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(Limpiar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Buscar1)
                                .addGap(89, 89, 89))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(BusquedaPublicacionesLayout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BusquedaPublicacionesLayout.createSequentialGroup()
                        .addComponent(seleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                        .addComponent(seleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        BusquedaPublicacionesLayout.setVerticalGroup(
            BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BusquedaPublicacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(var1)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(var2)
                    .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(BusquedaPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar1)
                    .addComponent(Limpiar1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Tablero1.addTab("Busqueda Publicaciones", BusquedaPublicaciones);

        Prestamos.setBackground(new java.awt.Color(204, 204, 255));

        Solicitar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Solicitar1.setText("Solicitar");
        Solicitar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Solicitar1ActionPerformed(evt);
            }
        });

        texto4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        ISBNLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ISBNLabel1.setText("ISBN");

        texto3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        NIFLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NIFLabel1.setText("NIF");

        FechaPrestamoLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        FechaPrestamoLabel1.setText("FECHA PRESTAMO");

        textoMes1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BarraLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BarraLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BarraLabel1.setText("/");

        textoDia1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        textoAnio1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BarraLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BarraLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BarraLabel2.setText("/");

        javax.swing.GroupLayout PrestamosLayout = new javax.swing.GroupLayout(Prestamos);
        Prestamos.setLayout(PrestamosLayout);
        PrestamosLayout.setHorizontalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Solicitar1)
                            .addGroup(PrestamosLayout.createSequentialGroup()
                                .addComponent(NIFLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(ISBNLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(FechaPrestamoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BarraLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(textoMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BarraLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textoAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        PrestamosLayout.setVerticalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamosLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIFLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISBNLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FechaPrestamoLabel1)
                    .addComponent(textoMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarraLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarraLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(Solicitar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
        );

        Tablero1.addTab("Prestamos", Prestamos);

        Devoluciones.setBackground(new java.awt.Color(204, 204, 255));

        NIFLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NIFLabel2.setText("NIF");

        texto5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        FechaDevolucionLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        FechaDevolucionLabel2.setText("ISBN");

        texto6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Devolver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Devolver1.setText("Devolver");
        Devolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Devolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DevolucionesLayout = new javax.swing.GroupLayout(Devoluciones);
        Devoluciones.setLayout(DevolucionesLayout);
        DevolucionesLayout.setHorizontalGroup(
            DevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionesLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(DevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DevolucionesLayout.createSequentialGroup()
                        .addComponent(NIFLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(FechaDevolucionLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DevolucionesLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(Devolver1)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        DevolucionesLayout.setVerticalGroup(
            DevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DevolucionesLayout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(DevolucionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIFLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaDevolucionLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(Devolver1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        Tablero1.addTab("Devoluciones", Devoluciones);

        Anagrama.setBackground(new java.awt.Color(0, 51, 255));
        Anagrama.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Anagrama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anagrama.setText("Biblioteca Universitaria");

        Volver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        Ttitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Ttitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttitulo.setText("Servicios");

        javax.swing.GroupLayout PanelFondo1Layout = new javax.swing.GroupLayout(PanelFondo1);
        PanelFondo1.setLayout(PanelFondo1Layout);
        PanelFondo1Layout.setHorizontalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tablero1)
            .addGroup(PanelFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Anagrama)
                .addContainerGap())
        );
        PanelFondo1Layout.setVerticalGroup(
            PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Anagrama, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelFondo1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Volver1)
                            .addComponent(Ttitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Tablero1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(636, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar1ActionPerformed
        //
        textoArea1.setText(" ");
    }//GEN-LAST:event_Limpiar1ActionPerformed
    // Buscador principal
    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
        // Pestaña Busqueda de publicaciones
        try{
            ArrayList<String> descripciones;
            Iterator it;
            String combox = (String) seleccionar1.getSelectedItem(); // tipos
            String comboxp = (String) seleccionar2.getSelectedItem(); // publicaciones
            // variables
            String v1 = texto1.getText(); // Autor y materia
            String v2 = texto2.getText(); // Titulo y fechap
            if(comboxp.equals("Libros")){
                if(combox.equals("AutorTitulo")){
                    if(var1.isSelected()&& !var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1("", v1, "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected() && !var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, "", "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, v1, "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }else if(combox.equals("MateriaFechaP")){
                    if(var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1, "", "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2("", v2, "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1,v2, "Libros");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }
            }else if(comboxp.equals("Revistas")){
                if(combox.equals("AutorTitulo")){
                    if(var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1("", v1, "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, "", "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, v1, "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }else if(combox.equals("MateriaFechaP")){
                    if(var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1, "", "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2("", v2, "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1, v2, "Revistas");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }
            }else if(comboxp.equals("Proyectos")){
                if(combox.equals("AutorTitulo")){
                    if(var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1("", v1, "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, "", "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion1(v2, v1, "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }else if(combox.equals("MateriaFechaP")){
                    if(var1.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1, "", "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2("", v2, "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }else if(var1.isSelected() && var2.isSelected()){
                        descripciones = GestionPublicaciones.buscaPublicacion2(v1, v2, "Proyectos");
                        it = descripciones.iterator();
                        while(it.hasNext()){
                            textoArea1.append("\n"+it.next()+"\n");
                        }
                    }
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        texto1.setText("");
        texto2.setText("");
    }//GEN-LAST:event_Buscar1ActionPerformed
    // Volver
    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        dispose();
        principal.setVisible(true);
    }//GEN-LAST:event_Volver1ActionPerformed
    // Pestaña Prestamos
    private void Solicitar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Solicitar1ActionPerformed
        // Solicitar una publicacion para ser prestada a un usuario
        try{            
            String nif = texto3.getText();
            String isbn = texto4.getText();            
            if(nif.equals("")|| isbn.equals("")){
                JOptionPane.showMessageDialog(this,"Rellene todos los campos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(buscarPublicacionIsbn(isbn)!= null && GestionUsuarios.getUsuarios().containsKey(nif)){
                int dia = Integer.parseInt(textoDia1.getText());
                int mes = Integer.parseInt(textoMes1.getText());
                int anio = Integer.parseInt(textoAnio1.getText());            
                if((dia>0&&dia<31)&&(mes>0&&mes<=12)&&(anio>2000&&anio<3000)){
                    GestionPublicaciones.prestamoPublicacion(isbn, dia, mes, anio);
                    JOptionPane.showMessageDialog(this,"Prestamo concedido","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this,"Introducir fecha correcta","Error",JOptionPane.ERROR_MESSAGE);
                }    
            }else{
                 JOptionPane.showMessageDialog(this,"No existe el usuario y/o publicacion","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException | HeadlessException e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        texto3.setText("");
        texto4.setText("");  
        textoDia1.setText("");
        textoMes1.setText("");
        textoAnio1.setText("");
    }//GEN-LAST:event_Solicitar1ActionPerformed
    // Pestaña Devoluciones
    private void Devolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Devolver1ActionPerformed
        // Devolver una publicacion que ha sido prestada a un usuario
        try{
            String nif = texto5.getText();
            String isbn = texto6.getText();
            if(nif.equals("")|| isbn.equals("")){
                JOptionPane.showMessageDialog(this,"Rellene todos los campos","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(buscarPublicacionIsbn(isbn)!= null && GestionUsuarios.getUsuarios().containsKey(nif)){
                Publicacion p = buscarPublicacionIsbn(isbn);
                if(p.isAlquilado()){
                    long sancion = GestionPublicaciones.devolucionPublicacion(isbn, nif);                
                    Usuario u = GestionUsuarios.getUsuarios().get(nif);
                    GestionPublicaciones.generaFicha(p, u, sancion);
                    if(sancion>0){
                        JOptionPane.showMessageDialog(this,"Sancion: "+sancion,"Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(this,"Ha sido devuelto correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"La publicacion no esta alquilada","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(this,"Dato no válido:\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        texto5.setText("");
        texto6.setText("");
    }//GEN-LAST:event_Devolver1ActionPerformed
    // Pestaña Busque publicaciones
    private void seleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionar1ActionPerformed
        // TODO add your handling code here:
        String tipo = (String) seleccionar1.getSelectedItem();
        if(tipo.equals("AutorTitulo")){
            var1.setText("Autor");
            var2.setText("Titulo");
        }else if(tipo.equals("MateriaFechaP")){
            var1.setText("Materia");
            var2.setText("Fecha P");
        }        
    }//GEN-LAST:event_seleccionar1ActionPerformed
    // Guardar Datos
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        GestionPublicaciones.guardarPublicaciones();
        GestionUsuarios.guardarUsuarios();
    }//GEN-LAST:event_formWindowClosing
    // Metodo buscar publicacion por isbn
    private Publicacion buscarPublicacionIsbn(String isbn){ 
        /**
         * Metodo para que nos devuelva la publicacion correspondiente
         * con el isbn introducido por pantalla. En caso de no existir, 
         * nos devuelve un objeto vacio.
         */ 
        Iterator it = GestionPublicaciones.getPublicaciones().iterator();      
        while(it.hasNext()){
            Publicacion p = (Publicacion) it.next();
            if(p.getIsbn().equals(isbn)){
                return p;
            }
        }
        return null;
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anagrama;
    private javax.swing.JLabel BarraLabel1;
    private javax.swing.JLabel BarraLabel2;
    private javax.swing.JButton Buscar1;
    private javax.swing.JPanel BusquedaPublicaciones;
    private javax.swing.JPanel Devoluciones;
    private javax.swing.JButton Devolver1;
    private javax.swing.JLabel FechaDevolucionLabel2;
    private javax.swing.JLabel FechaPrestamoLabel1;
    private javax.swing.JLabel ISBNLabel1;
    private javax.swing.JButton Limpiar1;
    private javax.swing.JLabel NIFLabel1;
    private javax.swing.JLabel NIFLabel2;
    private javax.swing.JPanel PanelFondo1;
    private javax.swing.JPanel Prestamos;
    private javax.swing.JButton Solicitar1;
    private javax.swing.JTabbedPane Tablero1;
    private javax.swing.JLabel Ttitulo;
    private javax.swing.JButton Volver1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> seleccionar1;
    private javax.swing.JComboBox<String> seleccionar2;
    private javax.swing.JTextField texto1;
    private javax.swing.JTextField texto2;
    private javax.swing.JTextField texto3;
    private javax.swing.JTextField texto4;
    private javax.swing.JTextField texto5;
    private javax.swing.JTextField texto6;
    private javax.swing.JTextField textoAnio1;
    private javax.swing.JTextArea textoArea1;
    private javax.swing.JTextField textoDia1;
    private javax.swing.JTextField textoMes1;
    private javax.swing.JRadioButton var1;
    private javax.swing.JRadioButton var2;
    // End of variables declaration//GEN-END:variables
}