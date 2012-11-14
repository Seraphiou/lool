/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Seraphin
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1585625;
        int n = 0;
        while (x / Math.pow(2, n) > 1) {
           
            n++;

        }
        int y;
        y = x;
        while(n!=-1){if ((y / (Math.pow(2, n)))>1) {
            System.out.print("1");
            y=y%((int)(Math.pow(2, n)));
            n--;
        }else {
            System.out.print("0");
            n--;
        }
        }
        




    }
}
