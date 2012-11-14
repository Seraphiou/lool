/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Seraphin
 */
public class JavaApplication1 {
           static final int n=15;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab;
        
        tab = new int[n];
        for (int i = 0; i <n; i++) {
            tab[i] =(int)(Math.random() * 10);
        }
        int mult=1;
        for (int i = 0; i <n; i++) {
            System.out.println("Tableau["+i+"]="+tab[i]);
        }
        for (int i = 0; i <n; i++) {
       
            
            mult*=tab[i];
            
        }
        System.out.println("La somme des nombres du tableau est de "+mult);
        int frou=1;
        for(int e:tab){
            frou*=e;
        }
        System.out.println("La somme des nombres du tableau est de "+frou);

    }
}
