
package co.edu.udec.poo4.model.entidades;

import java.util.ArrayList;
import java.util.HashMap;


public class Usuario {
    
    public String cedula;
    public String nombre;
    public String apellido;
    public String telefono;
    public String password;
    public String email;
    public ArrayList<Rutina> rutinas; 
  
    
    public static HashMap<String, Usuario>usuariosGYM;
    public static Usuario UsuarioActual;
    
    
    
    
    
     
    
}
