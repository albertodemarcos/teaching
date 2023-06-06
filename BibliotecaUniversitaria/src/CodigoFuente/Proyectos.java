/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

import java.io.Serializable;

/**
 *
 * @author Alberto y Alin
 */
public class Proyectos extends Publicacion implements Serializable{
    private String tribunal;
    private String titulacion;
    private int calificacion;

    public Proyectos(String isbn, String titulo, String autores, String fechaPublica,
            String materia, String fotografia, boolean alquilado, FechaPrestamo fechaprest,String tipo,
            String tribunal, String titulacion, int calificacion) {
        super(isbn, titulo, autores, fechaPublica, materia, fotografia, alquilado, fechaprest,tipo);
        this.tribunal = tribunal;
        this.titulacion = titulacion;
        this.calificacion = calificacion;
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if((calificacion>=0) && (calificacion<=10) ){
            this.calificacion = calificacion;
        }else
            System.out.println("ERROR");
    }

    @Override
    public String toString() {
        String m1;
        if(this.isAlquilado()){
            m1 = "NO DISPONIBLE";
        }else{
            m1 = "DISPONIBLE";
        }
        String mensaje;
        mensaje = "\nPROYECTO: "+
                "\nISBN: "+this.getIsbn()+
                "\nTÍTULO: "+this.getTitulo()+
                "\nAUTOR/ES: "+this.getAutores()+
                "\nFECHA PUBLICACIÓN: "+this.getFechaPublica()+
                "\nMATERIA: "+this.getMateria()+
                "\nTITULACIÓN:"+this.titulacion+
                "\nCALIFICACIÓN:"+this.calificacion+
                "\nTRIBUNAL:"+this.tribunal+
                "\nESTADO: "+m1+"\n";
        return mensaje;
    }

    
    
}
