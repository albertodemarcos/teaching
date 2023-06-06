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
public class Libros extends Publicacion implements Serializable {
    private String editorial;
    private String localidad;
    private String edicion;

    public Libros(String isbn, String titulo, String autores, String fechaPublica,
            String materia, String fotografia, boolean alquilado, FechaPrestamo fechaprest,String tipo,
            String editorial, String localidad, String edicion) {
        super(isbn, titulo, autores, fechaPublica, materia, fotografia, alquilado, fechaprest,tipo);
        this.editorial = editorial;
        this.localidad = localidad;
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
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
        mensaje = "\nLIBRO: "+
                "\nISBN: "+this.getIsbn()+
                "\nTÍTULO: "+this.getTitulo()+
                "\nAUTOR/ES: "+this.getAutores()+
                "\nFECHA PUBLICACIÓN: "+this.getFechaPublica()+
                "\nMATERIA: "+this.getMateria()+
                "\nEDITORIAL: "+this.editorial+
                "\nEDICIÓN: "+this.edicion+
                "\nLOCALIDAD: "+this.localidad+
                "\nESTADO: "+m1+"\n";
        return mensaje;
    }

    
    
}
