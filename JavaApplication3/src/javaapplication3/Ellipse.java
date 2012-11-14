/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Seraphin
 */
public class Ellipse {
 Centre c;
 private float ra;
 private float rb;
 
 public Ellipse(float ix,float iy,float ira,float irb){
 this.c=new Centre(ix,iy);
 this.ra=ira;
 this.rb=irb;
 }
  public void deplacer(float dx, float dy){
 c.deplacer(dx, dy);
 }
    
}
