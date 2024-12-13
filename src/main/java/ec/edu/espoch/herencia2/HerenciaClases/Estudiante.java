/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.herencia2.HerenciaClases;

/**
 *
 * @author USER
 */
public class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String codigo, String nombre, String apellido, String cedula, String genero) {
        super(nombre, apellido, cedula, genero);
        this.codigo = codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "codigo=" + codigo + '}';
    }
    
    
    
}
