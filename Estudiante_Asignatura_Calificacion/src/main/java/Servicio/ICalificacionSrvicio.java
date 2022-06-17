/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author HP
 */
public interface ICalificacionSrvicio {
    
    public Calificacion crear(Calificacion calificacion);
    public Calificacion modificar(int promedio, Calificacion calificacionFinal);
    public Calificacion eliminar(int promedio);
    public Calificacion buscarPromedio(int promedio);
    public int buscarPosicion(Calificacion calificacion);
    public List<Calificacion> listar();
    
}
