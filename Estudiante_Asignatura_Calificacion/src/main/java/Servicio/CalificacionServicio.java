/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author HP
 */
public class CalificacionServicio implements ICalificacionSrvicio{
    
    private final List<Calificacion> calificacionlist= new ArrayList<>();

    @Override
    public Calificacion crear(Calificacion calificacion) {
       this.calificacionlist.add(calificacion);
       return calificacion;
    }

    @Override
    public List<Calificacion> listar() {
        return this.calificacionlist;
    }

    @Override
    public Calificacion modificar(int promedio, Calificacion calificacionFinal) {
        var posicion=this.buscarPosicion(this.buscarPromedio(promedio));
        this.listar().get(posicion).setPromedio(calificacionFinal.getPromedio());
        this.listar().get(posicion).setRendimiento(calificacionFinal.getRendimiento());
        this.listar().get(posicion).setPorcentaje(calificacionFinal.getPorcentaje());
        this.listar().get(posicion).setRango(calificacionFinal.getRango());
        this.listar().get(posicion).setUnAsignatura(calificacionFinal.getUnAsignatura());
        this.listar().get(posicion).setUnEstudiante(calificacionFinal.getUnEstudiante());
        return calificacionFinal;
    }

    @Override
    public Calificacion eliminar(int promedio) {
        Calificacion calificacion=this.buscarPromedio(promedio);
        var posicion=this.buscarPosicion(calificacion);
        this.listar().remove(posicion);
        return calificacion;
        
    }

    @Override
    public Calificacion buscarPromedio(int promedio) {
        Calificacion calificacion=null;
        for(var p:this.calificacionlist){
            if(promedio==p.getPromedio()){
                calificacion=p;
                break;
            }
        }
        return calificacion;
    }

    @Override
    public int buscarPosicion(Calificacion calificacion) {
                int posicion=-1;
        for(var p:this.calificacionlist){
            posicion++;
            if(p.getPromedio()==calificacion.getPromedio()){
                break;
            }
        }
        return posicion;
    }
    
}
