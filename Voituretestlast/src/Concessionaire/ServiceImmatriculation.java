/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concessionaire;

/**
 *
 * @author Seraphin
 */
public class ServiceImmatriculation {
    private static ServiceImmatriculation instance;
    private ServiceImmatriculation(){};
    public ServiceImmatriculation getInstance(){
    if(instance==null){
    return new ServiceImmatriculation();
    }else{
    return instance;
    
    }
}

}
