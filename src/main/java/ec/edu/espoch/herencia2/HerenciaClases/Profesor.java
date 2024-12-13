/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia2.HerenciaClases;

/**
 *
 * @author USER
 */
public class Profesor extends Persona {
    private String id;
    private String titulo;

    public Profesor(String id, String titulo, String nombre, String apellido, String cedula, String genero) {
        super(nombre, apellido, cedula, genero);
        this.id = id;
        this.titulo = titulo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Profesor{" + "id=" + id + ", titulo=" + titulo + '}';
    }
    
    
    
}
