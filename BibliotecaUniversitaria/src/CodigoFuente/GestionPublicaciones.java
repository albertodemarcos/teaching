/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alberto y Alin
 */
public class GestionPublicaciones {
    static ArrayList<Publicacion> publicaciones = new ArrayList();
    private static Publicacion pub1;

    public GestionPublicaciones() {
    }

    public static Publicacion getPub1() {
        return pub1;
    }

    public static void setPub1(Publicacion pub1) {
        GestionPublicaciones.pub1 = pub1;
    }

    public static ArrayList<Publicacion> getPublicaciones() {
         //Comparador para ordenar por ISBN
        Comparator Comp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Publicacion p1 = (Publicacion) o1;
                Publicacion p2 = (Publicacion) o2;
                return p1.getIsbn().compareTo(p2.getIsbn());
            }
        };
        //Ordenamos el array
        Collections.sort(publicaciones, Comp);        
        return publicaciones;
    }

    public static void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        GestionPublicaciones.publicaciones = publicaciones;
    }
    
    // Alta publicación
    public static boolean altaPublicacion(Publicacion p1){
        if(!publicaciones.contains(p1)){
            publicaciones.add(p1); 
            return true;
        }else{
            return false;            
        }
    }
    // Baja publicación
    public static boolean bajaPublicacion(Publicacion p1){
        if(publicaciones.contains(p1)){
            publicaciones.remove(p1);
            return true;
        }else{
            return false;
        }
    }
    // Consulta publicación
    public static void consultaPublicaciones(JTextArea area,String tipo){        
        for(int i=0; i<publicaciones.size();i++){
           if(publicaciones.get(i).getTipo().equals("libros") && tipo.equals("Libros")){
                Libros l1 = (Libros) publicaciones.get(i);
                area.append(l1.toString()+"\n");                
            }else if(publicaciones.get(i).getTipo().equals("revistas")&& tipo.equals("Revistas")){
                Revistas r1 = (Revistas) publicaciones.get(i);
                area.append(r1.toString()+"\n");                
            }else if(publicaciones.get(i).getTipo().equals("proyectos")&& tipo.equals("Proyectos")){
                Proyectos p1 = (Proyectos) publicaciones.get(i);
                area.append(p1.toString()+"\n");                
            }
        }               
    }
    public static void consultaPublicaciones2(String tipo,JTable table){

        
    }
    // Modifica publicación
    public static boolean modificaPublicacion(Publicacion p,String titulo,String autores,
            String fechaP,String materia, String fotografia, String var1, String var2, String var3){
        if(p==null || !publicaciones.contains(p)){
            return false;
        }
        p.setTitulo(titulo);
        p.setAutores(autores);
        p.setFechaPublica(fechaP);
        p.setMateria(materia);
        p.setFotografia(fotografia);
        // Tipo de publicacion
        String tipo = p.getTipo();
        if(tipo.equals("libros")){
            Libros l = (Libros) p;
            l.setEditorial(var1);
            l.setLocalidad(var2);
            l.setEdicion(var3);
        }else if(tipo.equals("revistas")){
            Revistas r = (Revistas) p;
            r.setPeriocidad(var1);
            r.setVolumen(Integer.parseInt(var2));
            r.setNumero(Integer.parseInt(var3));
        }
        else if(tipo.equals("proyectos")){
            Proyectos p1 = (Proyectos) p;
            p1.setTribunal(var1);
            p1.setTitulacion(var2);
            p1.setCalificacion(Integer.parseInt(var3));
        }
        return true;
    }    
    // Busca publicacion por titulo y/o autor
    public static ArrayList buscaPublicacion1(String titulo, String autor, String tipo){
        Iterator it = publicaciones.iterator();
        ArrayList<String> descripciones = new ArrayList();
        int i = 0;
        int j = publicaciones.size();
        if(tipo.equals("Libros")){
            // Si los dos son distintos, buscamos los dos
            if(!autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(l1.getAutores()) && titulo.equals(l1.getTitulo()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
            }
            // Si solo tenemos autor
            }else if(!autor.equals("") && titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(l1.getAutores()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
                }
                // Si solo tenemos titulo
            }else if(autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(titulo.equals(l1.getTitulo()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
                }
            }
        }
        else if(tipo.equals("Revistas")){
            // Si los dos son distintos, buscamos los dos
            if(!autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(r1.getAutores()) && titulo.equals(r1.getTitulo()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
            }
            // Si solo tenemos autor
            }else if(!autor.equals("") && titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(r1.getAutores()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
                }
                // Si solo tenemos titulo
            }else if(autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(titulo.equals(r1.getTitulo()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
                }
            }
        }
        else if(tipo.equals("Proyectos")){
            // Si los dos son distintos, buscamos los dos
            if(!autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(p1.getAutores()) && titulo.equals(p1.getTitulo()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
            }
            // Si solo tenemos autor
            }else if(!autor.equals("") && titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(autor.equals(p1.getAutores()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
                }
                // Si solo tenemos titulo
            }else if(autor.equals("") && !titulo.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(titulo.equals(p1.getTitulo()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
                }
            }
        }
        return descripciones;
    }
    // Busca publicacion por materia y/o fecha de publicacion
    public static ArrayList buscaPublicacion2(String materia, String fechapres, String tipo){
        Iterator it = publicaciones.iterator();
        ArrayList<String> descripciones = new ArrayList();
        int i = 0;
        int j = publicaciones.size();
        if(tipo.equals("Libros")){
            // Si los dos son distintos, buscamos los dos
            if(!materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(l1.getMateria()) && fechapres.equals(l1.getFechaPublica()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
            }
            // Si solo tenemos materia
            }else if(!materia.equals("") && fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(l1.getMateria()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
                }
                // Si solo tenemos fecha publicacion
            }else if(materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion l1 = (Publicacion) publicaciones.get(i);
                    if(fechapres.equals(l1.getFechaPublica()) && l1.getTipo().equals("libros")){
                        descripciones.add(l1.toString());
                    }
                i++;
                }
            }
        }
        else if(tipo.equals("Revistas")){
            // Si los dos son distintos, buscamos los dos
            if(!materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(r1.getMateria()) && fechapres.equals(r1.getFechaPublica()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
            }
            // Si solo tenemos materia
            }else if(!materia.equals("") && fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(r1.getMateria()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
                }
                // Si solo tenemos fecha
            }else if(materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion r1 = (Publicacion) publicaciones.get(i);
                    if(fechapres.equals(r1.getFechaPublica()) && r1.getTipo().equals("revistas")){
                        descripciones.add(r1.toString());
                    }
                i++;
                }
            }
        }
        else if(tipo.equals("Proyectos")){
            // Si los dos son distintos, buscamos los dos
            if(!materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(p1.getMateria()) && fechapres.equals(p1.getFechaPublica()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
            }
            // Si solo tenemos materia
            }else if(!materia.equals("") && fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(materia.equals(p1.getMateria()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
                }
                // Si solo tenemos fecha
            }else if(materia.equals("") && !fechapres.equals("")){
                while(it.hasNext() & (i<j)){
                    Publicacion p1 = (Publicacion) publicaciones.get(i);
                    if(fechapres.equals(p1.getFechaPublica()) && p1.getTipo().equals("proyectos")){
                        descripciones.add(p1.toString());
                    }
                i++;
                }
            }
        }
        return descripciones;
    }    
    // Prestamo de una publicacion 
    public static void prestamoPublicacion(String isbn, int dia, int mes, int anio){        
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Publicacion p1 = (Publicacion) o1;
                Publicacion p2 = (Publicacion) o2;
                return p1.getIsbn().compareTo(p2.getIsbn());
            }
        };
        //Ordenamos el array
        Collections.sort(publicaciones, NomPerComp);
        //creamos una persona con el nombre a buscar
        Publicacion p = new Publicacion();
        p.setIsbn(isbn);
        int pos = Collections.binarySearch(publicaciones, p, NomPerComp);
        if (pos >= 0 && !publicaciones.get(pos).isAlquilado()) {
            publicaciones.get(pos).setAlquilado(true);            
            publicaciones.get(pos).getFechaprest().setDia(dia);
            publicaciones.get(pos).getFechaprest().setMes(mes);
            publicaciones.get(pos).getFechaprest().setAnio(anio);
        }else
            System.out.println("ERROR");
    } 
    // Devolucion de una publicacion 
    public static long devolucionPublicacion(String isbn, String nif){ 
        String categoria = GestionUsuarios.getUsuarios().get(nif).getCategoria();
          //Comparador para ordenar las publicaciones por su isbn
        Comparator NomPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Publicacion p1 = (Publicacion) o1;
                Publicacion p2 = (Publicacion) o2;
                return p1.getIsbn().compareTo(p2.getIsbn());
            }
        };
        //Ordenamos el array
        Collections.sort(publicaciones, NomPerComp);
        //creamos una persona con el nombre a buscar
        Publicacion p = new Publicacion();
        p.setIsbn(isbn);
        int pos = Collections.binarySearch(publicaciones, p, NomPerComp);
        String tipo = publicaciones.get(pos).getTipo();
        int dia = publicaciones.get(pos).getFechaprest().getDia();
        int mes = publicaciones.get(pos).getFechaprest().getMes();
        int anio = publicaciones.get(pos).getFechaprest().getAnio();   
        final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
        Date hoy = new Date(); //Fecha de hoy
        Calendar calendar = new GregorianCalendar(anio, mes-1, dia); 
        java.sql.Date fecha = new java.sql.Date(calendar.getTimeInMillis());
        long difDias = ( hoy.getTime() - fecha.getTime() )/MILLSECS_PER_DAY;
        if ((pos >= 0) && (publicaciones.get(pos).isAlquilado())==true) {
            publicaciones.get(pos).setAlquilado(false); 
        }
        long sancion=0;
        if (categoria.equals("Profesor")){            
            if(tipo.equals("libros") && (difDias>10) ){                
                sancion = difDias-10;                
            } else if(tipo.equals("revistas") && (difDias>6)){
                sancion = difDias-6;                
            } else if(tipo.equals("proyectos") && (difDias>12)){
                sancion = difDias-12;                
            }
        } else if (categoria.equals("Alumno")){            
            if(tipo.equals("libros") && (difDias>6) ){
                sancion = difDias-6;                
            } else if(tipo.equals("revistas") && (difDias>3)){
                sancion = difDias-3;                
            } else if(tipo.equals("proyectos") && (difDias>10)){
                sancion = difDias-10;               
            }
        }else{
            System.out.println("ERROR");
        }
        publicaciones.get(pos).getFechaprest().setDia(0);
        publicaciones.get(pos).getFechaprest().setMes(0);
        publicaciones.get(pos).getFechaprest().setAnio(0);
        return sancion;
    }
    // Cargar el ArrayList de publicaciones
    public static void cargarPublicaciones() {
        try (FileInputStream cargaFIS = new FileInputStream("publicaciones.dat")) {
            ObjectInputStream cargaOIS = new ObjectInputStream(cargaFIS);
            publicaciones = (ArrayList) cargaOIS.readObject();
            cargaFIS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
    }
    // Guardar el ArrayList de publicaciones
    public static void guardarPublicaciones() {
        try (FileOutputStream guardarFOS = new FileOutputStream("publicaciones.dat")) {
            ObjectOutputStream guardarOOS = new ObjectOutputStream(guardarFOS);        
            guardarOOS.writeObject(publicaciones);
            guardarOOS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    // Generar ficha del prestamo
    public static void generaFicha(Publicacion p, Usuario u,long sancion) throws IOException {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaDevolucion = date.format(formatter);
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(u.getNif() +" "+fechaDevolucion+ ".txt")));     

        salida.println("-------------------------------- Ficha Persona --------------------------------");
        salida.println("\n");
        salida.println("DNI: " + u.getNif());
        salida.println("\n");
        salida.println("Nombre: " + u.getNombre());
        salida.println("\n");
        salida.println("Categoria: " +u.getCategoria() );
        salida.println("\n");
        salida.println("Fecha Incripcion: " +u.getFechaInscripcion());
        salida.println("\n");
        salida.println("-------------------------------- Ficha Publicación --------------------------------");
        salida.println("\n");
        salida.println("ISBN: " + p.getIsbn());
        salida.println("\n");
        salida.println("Titulo: " + p.getTitulo());
        salida.println("\n");
        salida.println("Autores: " +p.getAutores());
        salida.println("\n");
        salida.println("Materia: " +p.getMateria());
        salida.println("\n");
        salida.println("Fecha Incripcion: " +p.getFechaPublica());
        salida.println("\n");
        if(p.getTipo().equals("libros")){
            salida.println("Categoria: "+"Libro");
            salida.println("\n"); 
        }else if(p.getTipo().equals("revistas")){
            salida.println("Categoria: "+"Revista");
            salida.println("\n"); 
        }else if(p.getTipo().equals("proyectos")){
            salida.println("Categoria: "+"Proyecto");
            salida.println("\n"); 
        }               
        if (p.getTipo().equals("libros")) { 
            Libros l = (Libros) p;
            salida.println("Editorial: "+l.getEditorial());
            salida.println("\n");
            salida.println("Localidad: "+l.getLocalidad());
            salida.println("\n");
            salida.println("Edicion: "+l.getEdicion());
        }else if(p.getTipo().equals("revistas")){ 
            Revistas r = (Revistas) p;
            salida.println("Periodicidad: "+r.getPeriocidad());
            salida.println("\n");
            salida.println("Volumen: "+r.getVolumen());
            salida.println("\n");
            salida.println("Número: "+r.getNumero());
        }else if(p.getTipo().equals("proyectos")){
            Proyectos p1 = (Proyectos) p;
            salida.println("Tribunal: "+p1.getTribunal());
            salida.println("\n");
            salida.println("Titulacion: "+p1.getTitulacion());
            salida.println("\n");
            salida.println("Calificacion: "+p1.getCalificacion());
        }
        if(sancion>0){
            if(sancion==1){
                salida.println("\n");
                salida.println("Has devuelto la publicacion "+sancion+" dia tarde");
            }else{
                salida.println("\n");
                salida.println("Has devuelto la publicacion "+sancion+" dias tarde"); } 
        }
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }
}
