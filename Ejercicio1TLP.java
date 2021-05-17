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
public class Ejercicio1TLP {
    private String nombre;
    private String raza;
    private int edad;
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
        nombre=nombre;
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public static void main(String[] args) {
        int i=0, tam=1;
        Ejercicio1TLP[] datos= new Ejercicio1TLP[tam];
        
        for(i=0;i<datos.length;i++){
        datos[i]=new Ejercicio1TLP();
        datos[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre de su mascota"));
        datos[i].setRaza(JOptionPane.showInputDialog("Ingrese la raza de su mascota: "));
        datos [i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad de su mascota: ")));
        
    }
    
        for(i=0; i<datos.length; i++){
            JOptionPane.showMessageDialog(null, "Los datos de su mascota son: " + "\nNombre: " +datos[i].getNombre() + "\nRaza: " +datos[i].getRaza() + "\nEdad: " +datos[i].getEdad());
        }
    }
}    
