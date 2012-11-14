/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concessionaire;

/**
 *
 * @author Seraphin
 */
public class Gps extends OptionVoiture {
    public Autoradio(Voiture base){
    this.base=base;
    }
    public long getPrice(){
    return base.getPrice()+500;
    }
}

