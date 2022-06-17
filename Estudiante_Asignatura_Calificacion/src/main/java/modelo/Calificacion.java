/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Calificacion {
    private String rendimiento;
    private String rango;
    private int promedio;  // insertar nota /10
    private int porcentaje;
    private Asignatura unAsignatura;
    private Estudiante unEstudiante; 

    public Calificacion(String rendimiento, String rango, int promedio, 
            int porcentaje, Asignatura unAsignatura, Estudiante unEstudiante) {
        this.rendimiento = rendimiento;
        this.rango = rango;
        this.promedio = promedio;
        this.porcentaje = porcentaje;
        this.unAsignatura = unAsignatura;
        this.unEstudiante = unEstudiante;
    }
    
    public int CalcularNota(){
        var nota=this.promedio*10;
        return nota;
        
    }
    
    public boolean ApruebaMateria(){
        var aprueba=false;
        if (this.promedio>70){
            aprueba=true;
        }
        return aprueba;
    }

    
    public String getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(String rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Asignatura getUnAsignatura() {
        return unAsignatura;
    }

    public void setUnAsignatura(Asignatura unAsignatura) {
        this.unAsignatura = unAsignatura;
    }

    public Estudiante getUnEstudiante() {
        return unEstudiante;
    }

    public void setUnEstudiante(Estudiante unEstudiante) {
        this.unEstudiante = unEstudiante;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "rendimiento=" + rendimiento + ", rango=" + rango 
                + ", promedio=" + promedio + ", porcentaje=" + porcentaje 
                + ", unAsignatura=" + unAsignatura + ", unEstudiante=" + unEstudiante + '}';
    }
    
    
    
}
