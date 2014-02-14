/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pjsonpsp;
/**
 *
 * @author usuario
 */
//añadido import de google y impresión del array.

import com.google.gson.Gson;
import java.util.*;


public class Alumno {
    
    public static void main(String[] args){
        Gson gson = new Gson();
        Scanner scaner = new Scanner(System.in);
        
        String array[] = new String[6];
        int rest = 5;
        
        System.out.println("Escriba nombres para llenar el Array:");
        for(int i=0;i<5;i++){
            array[i] = scaner.nextLine();
            rest--;
            System.out.println("Quedan: "+rest+" Alumnos por introducir.");
        }
        //Imprime el array
        
        gson.toJson(array);
        
    }
    
}
