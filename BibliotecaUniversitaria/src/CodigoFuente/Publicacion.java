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
public class Publicacion implements Serializable {
    private String isbn;
    private String titulo;
    private String autores;
    private String fechaPublica;
    private String materia;
    private String fotografia; // ruta de la ubicacion de la foto.
    private boolean alquilado; // Hay solo un ejemplar.
    private FechaPrestamo fechaprest; 
    private String tipo;

    public Publicacion(String isbn, String titulo, String autores, String fechaPublica, String materia, String fotografia, boolean alquilado, FechaPrestamo fechaprest,String tipo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.fechaPublica = fechaPublica;
        this.materia = materia;
        this.fotografia = fotografia;
        this.alquilado = alquilado;
        this.fechaprest = fechaprest;
        this.tipo = tipo;
    }
    public Publicacion() {
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getFechaPublica() {
        return fechaPublica;
    }

    public void setFechaPublica(String fechaPublica) {
        this.fechaPublica = fechaPublica;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public FechaPrestamo getFechaprest() {
        return fechaprest;
    }

    public void setFechaprest(FechaPrestamo fechaprest) {
        this.fechaprest = fechaprest;
    }

   

    @Override
    public String toString() {
        return "Publicacion{" + "isbn=" + isbn + ", titulo=" + titulo + ", autores=" + autores + ", fechaPublica=" + fechaPublica + ", materia=" + materia + ", fotografia=" + fotografia + ", alquilado=" + alquilado + '}';
    }

    
    
}
