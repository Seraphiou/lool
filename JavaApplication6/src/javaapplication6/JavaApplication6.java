/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Seraphin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "salut moi c'est seraph";
String[] t = s.split("[.,;:?!' ]+");
for( int i = 0; i<t.length; ++i){ System.out.println(t[i]);}
        
        
        
    }
}
