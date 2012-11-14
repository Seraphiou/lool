package pkg12.sep;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seraphin
 */
public class Monstre extends Personnage{
    
    
    //Constructeur de monstre:
    public Monstre(String inom, int ipdv){
    super(inom,ipdv);//super permet de renvoyer l'acction au constructeur de la classe dont elle herite ici super représente personnage
    
    }
    
    
    //lorsqu'un monstre attaque:
    public void attaque(Victime v) {
        if (!(this.detruit()) || v.detruit()) {//on test si l'un des deux est mort, si cest le cas il ne se passe rien
            this.addVie(v.subitFrappe((this.getVie()) / 2));
            //le monstre infligera au personnage attaqué (p) une attaque de puissance egale a la moitié de ses point de vie
            //ensuite le personnage attaqué(p) renverra la valeur renvoyée par p.subitFrappe(coup)
        }
    } 
    
    
    //Monstre subissant une attaque de monstre:
    public int subitFrappe(int coup) {

        this.addVie(-coup);//lorsqu'un monstre subit une frappe il perd le nombre de points de vie en argument de subitFrappe
        return (-this.getVie()/2);//le monstre renverra des dommages a hauteur de la moitié de ses points de vie
    }
    
    
    //Monstre subissant une attaque de sorcier:
    public int subitCharme(int coup) {
        
        this.addVie(-coup);//lorsqu'un monstre est attaqué par un sorcier, le monstre perdra coup points de vie
        
        return (this.getVie()/2); //le sorcier recevra un soin a hauteur de la moitié des points de vie du monstre subissant l'attaque
    }

    


}

