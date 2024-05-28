/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbilioteca;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author usuario
 */
public class PersonalService {
   private List<Persona> personas= new ArrayList<>();
       public void agregarPersona(Persona persona){
           personas.add(persona);
       }
    public List<Persona> obtenerPersonas(){
        return personas;
    }
    public Persona BuscarPersonaPorNombre(String Nombre){
        for(Persona persona: personas){
            if(persona.getNombre().equalsIgnoreCase(Nombre)){
                return persona;
            }
        }
        return null;
    }

    void eliminarPersona(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
