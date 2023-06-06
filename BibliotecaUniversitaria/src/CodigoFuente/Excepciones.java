/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

/**
 *
 * @author Alberto y Alin
 */
public class Excepciones extends Exception {
    public static final String usuarioAlta = "El usuario ya esta de alta";
    public static final String usuarioBaja = "El usuario no existe";
    public static final String publicacionUnica = "No disponible, ya esta alquilado";
    public static final String publicacionBaja = "La publicacion no se puede dar de baja porque no exite";
    public static final String prestamoNoExiste = "La publicacion no existe";
    public static final String devolucionNoPrestado = "La publicacion no estaba prestada";

    public Excepciones() {
        super("Se ha producido una excepcion");
    }

    public Excepciones(String message) {
        super(message);
    }
    
}
