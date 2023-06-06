/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Alberto y Alin
 */
public class Usuario implements Serializable  {
    private String nif;
    private String nombre;
    private String categoria;
    private String fechaInscripcion;

    public Usuario(String nif, String nombre, String categoria, String fechaInscripcion) {
        this.nif = nif;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if(categoria.equals("alumno")){
            this.categoria = "alumno";
        }else if(categoria.equals("profesor")){
            this.categoria = "profesor";
        }
        
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString(){
        String mensaje;
        mensaje = "\nUSUARIO: "+
                "\nNIF: "+this.nif+
                "\nNOMBRE: "+this.nombre+
                "\nCATEGORIA: "+this.categoria+
                "\nINSCRIPCION: "+this.fechaInscripcion+"\n";
        return mensaje;
    }

   
    
}
