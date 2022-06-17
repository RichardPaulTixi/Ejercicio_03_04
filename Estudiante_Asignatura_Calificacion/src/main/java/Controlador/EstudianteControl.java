/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.EstudianteServicio;
import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author HP
 */
public class EstudianteControl {
    private final EstudianteServicio estudianteServicio= new EstudianteServicio();
    public Estudiante crearEstudiante(String [] params){
        var estudiante = new Estudiante(params[0],params[1],params[2],Integer.valueOf(params[3]),Integer.valueOf(params[4]));
        this.estudianteServicio.crear(estudiante);
        return estudiante;
    }
    public List<Estudiante>ListarEstudiante(){
        return this.estudianteServicio.listar();
    }
}
