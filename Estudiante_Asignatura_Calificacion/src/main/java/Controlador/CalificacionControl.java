/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.AsignaturaServicio;
import Servicio.CalificacionServicio;
import Servicio.EstudianteServicio;
import java.util.List;
import modelo.Asignatura;
import modelo.Calificacion;
import modelo.Estudiante;

/**
 *
 * @author HP
 */
public class CalificacionControl {
    private final CalificacionServicio calificacionServicio= new CalificacionServicio();
    private final AsignaturaServicio  asignaturaServicio= new AsignaturaServicio();
    private final EstudianteServicio estudianteServicio= new EstudianteServicio();

    
    public Calificacion crearCalificacion(String [] args){
        Asignatura asignatura= this.asignaturaServicio.buscarporNivel(Integer.parseInt(args[5]));
        Estudiante estudiante=this.estudianteServicio.buscarCiclo(Integer.parseInt(args[4]));
        Calificacion calificacion=new Calificacion(args[0],args[1],Integer.parseInt(args[3]),Integer.parseInt(args[3]), asignatura, estudiante);
        this.calificacionServicio.crear(calificacion);
        return calificacion;
    
    }
    
    
    public List<Calificacion> ListarCalificacion(){
        return this.calificacionServicio.listar();
    }
    
    public Calificacion obtenerRendimiento(String arg){
        return this.calificacionServicio.buscarPromedio(Integer.parseInt(arg));
        
    }
}
