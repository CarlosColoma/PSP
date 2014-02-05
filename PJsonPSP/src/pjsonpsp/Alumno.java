/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjsonpsp;
/**
 *
 * @author usuario
 */
//he etado realizando pruebas para conseguir la forma más optima o sencilla.

import java.util.*;

public class Alumno {
    
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        
        String array[] = new String[6];
        int rest = 5;
        
        System.out.println("Escriba nombres para llenar el Array:");
        for(int i=0;i<5;i++){
            array[i] = scaner.nextLine();
            rest--;
            System.out.println("Quedan: "+rest+" Alumnos por introducir.");
        }
        
        
        
        
    }
    
}
