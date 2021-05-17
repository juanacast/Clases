/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrmacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Juana
 */
public class Ejercicio2TLP {
    
    private int legajo;
    private String nombre;
    private int edad;
    private String curso;
    
    public int getLegajo(){
    return legajo;
    }
    
    public void setLegajo(int legajo){
        this.legajo=legajo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public static void main(String[] args) {
        int i=0;
        int tam=1;
        
        Ejercicio2TLP[] datos= new Ejercicio2TLP[tam];
        
        for (i=0; i<datos.length; i++){
            datos [i] = new Ejercicio2TLP();
            datos [i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del estudiante: "));
            datos [i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad del estudiante: ")));
            datos [i].setCurso(JOptionPane.showInputDialog("Ingrese el curso del estudiante: "));
            datos [i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el legajo del estudiante: ")));
        }
        
        for (i=0; i<datos.length; i++){
            JOptionPane.showMessageDialog(null, "Los datos del estudiante son: " + "\nNombre: " +datos[i].getNombre() + "\nEdad: " + datos[i].getEdad() + "\nCurso: " + datos[i].getCurso() + "\nLegajo: " +datos[i].getLegajo());
        }
        
    }
    
    
    
}
