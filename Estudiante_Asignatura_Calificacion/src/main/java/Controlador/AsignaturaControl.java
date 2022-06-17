/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicio.AsignaturaServicio;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author HP
 */
public class AsignaturaControl {
    private final AsignaturaServicio asignaturaServicio=new AsignaturaServicio(); 
    public Asignatura crearAsignatura(String [] params){
        var asignatura= new Asignatura(params[0],Integer.parseInt(params[1]),Integer.parseInt(params[2]),Integer.parseInt(params[3]),Integer.parseInt(params[4]));
        this.asignaturaServicio.crear(asignatura);
        return asignatura;
    }
    public List<Asignatura> ListarAsignatura(){
        return this.asignaturaServicio.listar();
    }
}
