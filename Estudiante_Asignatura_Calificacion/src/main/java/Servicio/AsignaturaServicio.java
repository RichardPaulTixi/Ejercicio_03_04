/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author HP
 */
public class AsignaturaServicio implements IAsignaturaServicio{
    
    private final List<Asignatura> asignaturalist= new ArrayList<>();

    @Override
    public Asignatura crear(Asignatura asignatura) {
        this.asignaturalist.add(asignatura);
        return asignatura;
        
    }

    @Override
    public List<Asignatura> listar() {
        
        return this.asignaturalist;
       
    }

    @Override
    public Asignatura buscarporNivel(int nivelAsignatura) {
        Asignatura asignatura=null;
        for(var a:this.asignaturalist){
            if(nivelAsignatura==a.getNivel()){
                asignatura=a;
                break;
            }
        }
        return asignatura;
    }
    
    
}
