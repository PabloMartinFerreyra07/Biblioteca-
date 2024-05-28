/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbilioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author usuario
 */
public class LibroService {
    private List<Libro> libros= new ArrayList<>();
    public void agregarLibro(Libro libro){
        
    }
    public List<Libro> obtenerLibros(){
        return libros;
    }
    public Libro BuscarLibroPorNombre(String Nombre){
        for (Libro libro: libros){
            if (libro.getNombre().equalsIgnoreCase(Nombre)){
                return libro;
            }
        }
        return null;
    }
     public List<Libro> buscarLibrosPorAutor(Persona autor) {
        return libros.stream()
            .filter(libro -> libro.getAutor().equals(autor))
            .collect(Collectors.toList());
    }

    void eliminarLibro(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
