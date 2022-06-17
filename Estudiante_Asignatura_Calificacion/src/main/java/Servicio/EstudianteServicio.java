/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author HP
 */
public class EstudianteServicio implements IEstudianteServicio{
    
    private final List<Estudiante> estudianteList = new ArrayList<>();

    @Override
    public Estudiante crear(Estudiante estudiante) {
        this.estudianteList.add(estudiante);
        return estudiante;
    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }

    @Override
    public Estudiante buscarCiclo(int cicloEstudiante) {
        Estudiante estudiante=null;
        for(var e:this.estudianteList){
            if(cicloEstudiante==e.getCiclo()){
                estudiante=e;
                break;
            }
        }
        return estudiante;
    }
    
}
