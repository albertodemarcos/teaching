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
public class Revistas extends Publicacion implements Serializable{
    private String periocidad;
    private int volumen;
    private int numero;

    public Revistas(String isbn, String titulo, String autores, String fechaPublica,
            String materia, String fotografia, boolean alquilado, FechaPrestamo fechaprest,String tipo,
            String periocidad, int volumen, int numero) {
        super(isbn, titulo, autores, fechaPublica, materia, fotografia, alquilado, fechaprest,tipo);
        this.periocidad = periocidad;
        this.volumen = volumen;
        this.numero = numero;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        if(periocidad.equals("trimestral")){
            this.periocidad = "trimestral";
        }else if(periocidad.equals("semestral")){
            this.periocidad = "semestral";
        }else if(periocidad.equals("anual")){
            this.periocidad = "anual";
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        mensaje = "\nREVISTA: "+
                "\nISBN: "+this.getIsbn()+
                "\nTÍTULO: "+this.getTitulo()+
                "\nAUTOR/ES: "+this.getAutores()+
                "\nFECHA PUBLICACIÓN: "+this.getFechaPublica()+
                "\nMATERIA: "+this.getMateria()+
                "\nPERIOCIDAD: "+this.periocidad+
                "\nVOLUMEN: "+this.volumen+
                "\nNÚMERO: "+this.numero+
                "\nESTADO: "+m1+"\n";
        return mensaje;
    }

    
    
    
}
