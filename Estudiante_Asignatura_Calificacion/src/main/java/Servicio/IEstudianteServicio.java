/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author HP
 */
public interface IEstudianteServicio {
    public Estudiante crear(Estudiante estudiante);
    public Estudiante buscarCiclo(int cicloEstudiante);
    public List<Estudiante> listar();
}
