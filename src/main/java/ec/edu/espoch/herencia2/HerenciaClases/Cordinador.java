/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia2.HerenciaClases;

/**
 *
 * @author USER
 */
public class Cordinador extends Persona {
    private String id;
    private String titulo;
    private String cargo;

    public Cordinador(String id, String titulo, String cargo, String nombre, String apellido, String cedula, String genero) {
        super(nombre, apellido, cedula, genero);
        this.id = id;
        this.titulo = titulo;
        this.cargo = cargo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cordinador{" + "id=" + id + ", titulo=" + titulo + ", cargo=" + cargo + '}';
    }

    
}
