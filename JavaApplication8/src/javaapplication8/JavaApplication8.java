/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Seraphin
 */
public class JavaApplication8 {
    
public static long fibonacci(int n){
if(n==0){return 0;}
if(n==1){return 1;}
else{
        return (fibonacci(n-1)+fibonacci(n-2));
}



}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(45));
        
        
        // TODO code application logic here
    }
}
