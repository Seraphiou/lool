package javamonsters;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seraphin
 */
public class Sorcier extends Personnage {

    private double pouvoir;//ajout d'un attribut pouvoir pour les sorciers

    public Sorcier(String inom, int ipdv) {
        super(inom, ipdv); //création grace a la classe supérieure
        this.pouvoir = Math.random();//definition du pouvoir du sorcier dès sa création valeur aléatoire entre 0 et 1
    }

    public void attaque(Personnage p) {
        if (!(this.mort()) || p.mort())  //on teste si l'un des deux personnages est mort si c'est le cas il ne se passe rien.
        {
            this.addVie(p.subitCharme((int) (this.getVie() * this.pouvoir)));
            //la puissance du coup sera de  le nombre de points de vie multiplié par le pouvoir(+ conversion en entier)
            //p subit le charme et renvoie des dommages ou soins
        }


    }
//Sorcier subissant une attaque de Sorcier:
    public int subitCharme(int coup) {

        return 0;//il n'y a dans se cas, ni dommage direct, ni soin ou dommage en retour
    }
//Sorcier subissant une attaque de Monstre:
    public int subitFrappe(int coup) {//la puissance du coup sera de la moitié des points de vie de l'attaquant

        this.addVie(-coup);//le sorcier subissant l'attaque se verra infliger coup degats.
        
        return -((int) (this.getVie() * this.pouvoir));//les degats retournés seront à hauteur du poivoir multiplié par le nombre de points de vie du defenseur.
    }
}
