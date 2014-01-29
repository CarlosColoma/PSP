

package Pexec;

public class PExec {
    
    public static void main (String [] args){
        
        try 
        { 
            
           Process p = Runtime.getRuntime().exec ("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
           System.out.println("Iniciar Google Chrome");
        } 
        catch (Exception e) 
        { 
           System.out.println("Programa no ejecutable"); 
        }

     }
    
}
