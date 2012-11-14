/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Seraphin
 */
public class Cercle {
 Centre c;
 private float r;
 
 public Cercle(float ix,float iy,float ir){
 this.c=new Centre(ix,iy);
 this.r=ir;
 
 }
 public void deplacer(float dx, float dy){
 c.deplacer(dx, dy);
 }
    
    
}
