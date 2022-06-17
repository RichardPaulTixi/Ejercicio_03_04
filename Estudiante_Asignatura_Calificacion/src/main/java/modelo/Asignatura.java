/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Asignatura {
    private String nombre;
    private int tipo;
    private int codigo;
    private int horas;
    private int nivel;

    public Asignatura(String nombre, int tipo, int codigo, int horas, int nivel) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.codigo = codigo;
        this.horas = horas;
        this.nivel = nivel;
    }
    
    public boolean GenericaOProfesional(){
        var tipomateria=false;
        if (this.nivel>4){
            tipomateria=true;
        }
        return tipomateria;
    }
    
    public int NumeroMatricula(){
        var matricula=0;
        if (this.tipo>0 && this.tipo<2){
            matricula=1;
        }
        if (this.tipo>1 && this.tipo<3){
            matricula=2;
        }
        if (this.tipo>2 && this.tipo<4){
            matricula=3;
        }
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", tipo=" + tipo + ", codigo=" + codigo + ", horas=" + horas + ", nivel=" + nivel + '}';
    }
    
}
