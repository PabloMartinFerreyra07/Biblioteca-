/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbilioteca;
import java.util.List;
/**
 *
 * @author usuario
 */
public class Biblioteca {
  private LibroService libroService;
    private PersonalService personaService;

    public Biblioteca(LibroService libroService, PersonalService personaService) {
        this.libroService = libroService;
        this.personaService = personaService;
    }

    public void agregarLibro(Libro libro) {
        libroService.agregarLibro(libro);
    }

    public void eliminarLibro(String nombre) {
        libroService.eliminarLibro(nombre);
    }

    public Libro buscarLibroPorNombre(String nombre) {
        return libroService.BuscarLibroPorNombre(nombre);
    }

    public List<Libro> buscarLibrosPorAutor(Persona autor) {
        return libroService.buscarLibrosPorAutor(autor);
    }

    public void agregarPersona(Persona persona) {
        personaService.agregarPersona(persona);
    }

    public void eliminarPersona(String nombre) {
        personaService.eliminarPersona(nombre);
    }

    public List<Libro> getLibros() {
        return libroService.obtenerLibros();
    }

    public List<Persona> getUsuarios() {
        return personaService.obtenerPersonas();
    }

    Object BuscarPersonaPorNombre(String juan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}