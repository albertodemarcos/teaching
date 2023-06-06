/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodigoFuente;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JTextArea;

/**
 *
 * @author Alberto y Alin
 */
public class GestionUsuarios {
    static HashMap<String,Usuario> usuarios = new HashMap();

    public GestionUsuarios() {
        
    }
    // Metodos get y set
    public static HashMap<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(HashMap<String, Usuario> usuarios) {
        GestionUsuarios.usuarios = usuarios;
    }
    // Alta usuario
    public static void altaUsuario(Usuario u) {
        try{
            if(usuarios.containsKey(u.getNif())){
            throw new Excepciones(Excepciones.usuarioAlta);            
        }else{
            usuarios.put(u.getNif(), u); 
            }
        }catch(Exception e){
            System.out.println("\n"+e.getMessage());            
        }
        
    }
    // Baja usuario
    public static void bajaUsuario(String nif){
        try{
            if(usuarios.containsKey(nif)){
                usuarios.remove(nif);
                System.out.println("Ha sido de baja");
            }else{
                throw new Exception(Excepciones.usuarioBaja);
            }
        }catch(Exception e){
            System.out.println("\n"+e.getMessage()); 
        }
    }
    // Consulta Usuarios
    public static void consultarUsuarios(JTextArea area){
        Iterator it = usuarios.entrySet().iterator();        
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();            
            String key = (String) e.getKey();             
            Usuario u =  usuarios.get(key);
            area.append(u.toString()+"\n");            
        }
        
    }
    // Cargar el HashMap de usuarios
    public static void cargarUsuarios() {
        try (FileInputStream cargaFIS = new FileInputStream("usuarios.dat")) {
            ObjectInputStream cargaOIS = new ObjectInputStream(cargaFIS);
            usuarios = (HashMap) cargaOIS.readObject();
            cargaFIS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }    
    }
    // Guardar el HashMap de usuarios
    public static void guardarUsuarios() {
        try (FileOutputStream guardarFOS = new FileOutputStream("usuarios.dat")) {
            ObjectOutputStream guardarOOS = new ObjectOutputStream(guardarFOS);        
            guardarOOS.writeObject(usuarios);
            guardarOOS.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
