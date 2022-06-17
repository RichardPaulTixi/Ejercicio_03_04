/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

/**
 *
 * @author HP
 */
public class Estudiante_Asignatura_Calificacion {

    public static void main(String[] args) {
       // System.out.println("Hello World!");
       
       var v1= new VentanaAsignatura();
       v1.setVisible(true);
       
       var v2 = new VentanaEstudiante();
       v2.setVisible(true);
       
       var v3= new VentanaCalificacion();
       v3.setVisible(true);
       
       var v4= new VentanaDelete();
       v4.setVisible(true);
    }
}
