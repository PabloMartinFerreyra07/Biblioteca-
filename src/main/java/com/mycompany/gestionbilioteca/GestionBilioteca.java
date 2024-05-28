/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionbilioteca;

import java.util.List;

/**
 *
 * @author usuario
 */
public class GestionBilioteca {

    public static void main(String[] args) {
         // Crear servicios
        LibroService libroService = new LibroService();
        PersonalService personaService = new PersonalService();

        // Crear biblioteca inyectando los servicios
        Biblioteca biblioteca = new Biblioteca(libroService, personaService);

        // Crear una persona (autor) y agregarla
        Persona autor = new Persona("Garcia Marquez", "Gabriel");
        biblioteca.agregarPersona(autor);

        // Crear un libro y agregarlo a la biblioteca
        Libro libro = new Libro("Cien años de soledad", autor, "Realismo magico");
        biblioteca.agregarLibro(libro);

        // Imprimir detalles del libro
        System.out.println("Título: " + libro.getNombre());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
        System.out.println("Género: " + libro.getGenero());

        // Buscar un libro por nombre
        Libro encontrado = biblioteca.buscarLibroPorNombre("Cien años de soledad");
        if (encontrado != null) {
            System.out.println("Libro encontrado: " + encontrado.getNombre());
        } else {
            System.out.println("Libro no encontrado");
        }

        // Buscar todos los libros de un autor
        List<Libro> librosDelAutor = biblioteca.buscarLibrosPorAutor(autor);
        System.out.println("Libros de " + autor.getNombre() + " " + autor.getApellido() + ":");
        for (Libro l : librosDelAutor) {
            System.out.println(" - " + l.getNombre());
        }

        // Eliminar un libro
        biblioteca.eliminarLibro("Cien años de soledad");
        if (biblioteca.buscarLibroPorNombre("Cien años de soledad") == null) {
            System.out.println("Libro eliminado correctamente");
        }

        // Agregar y eliminar un cliente (usuario)
        Persona cliente = new Persona("Perez", "Juan");
        biblioteca.agregarPersona(cliente);
        System.out.println("Cliente agregado: " + cliente.getNombre() + " " + cliente.getApellido());

        biblioteca.eliminarPersona("Juan");
        if (biblioteca.BuscarPersonaPorNombre("Juan") == null) {
            System.out.println("Cliente eliminado correctamente");
        }
    }
}
