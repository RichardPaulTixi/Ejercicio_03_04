/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author HP
 */
public interface IAsignaturaServicio {
    
    public Asignatura crear(Asignatura asignatura);
    public Asignatura buscarporNivel(int nivelAsignatura);
    public List<Asignatura> listar();
    
    
}
