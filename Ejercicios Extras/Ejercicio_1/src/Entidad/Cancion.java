/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Johana
 */
public class Cancion {
    
    private String autor;
    private String titulo;

    public Cancion() {
        
        this.autor = " ";
        this.titulo = " ";
    }

    public Cancion(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
