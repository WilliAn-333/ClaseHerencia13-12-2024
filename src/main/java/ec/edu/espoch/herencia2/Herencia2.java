/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.herencia2;

import ec.edu.espoch.herencia2.HerenciaClases.Cordinador;
import ec.edu.espoch.herencia2.HerenciaClases.Estudiante;
import ec.edu.espoch.herencia2.HerenciaClases.Profesor;

/**
 *
 * @author USER
 */
public class Herencia2 {

    public static void main(String[] args) {
    Estudiante objEstudiante=new Estudiante("333","Willian","Caisaguano","0504836453","MASCULINO");
        System.out.println(objEstudiante.toString());
        
        
    Profesor objProfesor=new Profesor("3333","INGENIERO TI","Willian","Caisaguano","0504836453","MASCULINO");
        System.out.println(objProfesor.toString());
        
    Cordinador objCordinador=new Cordinador("33333","INGENIERO","INGENIERO","PEPITO","PEREZ","052348568","MASCULINO");
        System.out.println(objCordinador.toString());
    }
    
 
}
