/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Seraphin
 */
public class Centre {
    float x;
    float y;
    public Centre(float ix,float iy){
    this.x=ix;
    this.y=iy;
}
    public void deplacer(float dx, float dy){
    this.x+=dx;
    this.y+=dy;
    
    
    
    }
    
}
