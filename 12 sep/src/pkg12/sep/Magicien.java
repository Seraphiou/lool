/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.sep;

/**
 *
 * @author Seraphin
 */
public class Magicien extends Sorcier implements Victime,SuperPouvoir{
    
    private double superpouvoir=extra*this.getPouvoir();
    
    public Magicien(String inom,int ipdv){
    super(inom,ipdv);
    
    }
   public double sort(){
       return (Math.random()*this.superpouvoir);
   
   
   }
    public int subitCharme(int coup) {

        return (int)(this.sort()*coup);
    }
    
    
}
