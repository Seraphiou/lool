package javamonsters;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seraphin
 */
public abstract class Personnage {

    private String nom; // nom du personnage
    private int pdv;// nombre de point de vie du personnage

    public Personnage(String inom, int ipdv) {// constructeur avec arguments
        this.nom = inom;
        this.pdv = ipdv;

    }

    public String getNom() {//retourne le nom du personnage
        return this.nom;

    }

    public int getVie() {//retourne le noombre de point de vie restant au personnage
        return this.pdv;

    }

    public boolean mort() {//indique si le personnge est mort
        return !(this.pdv > 0);


    }

    public String toString() {//affichage par defaut d'un objet en String
        if (!(this.mort())) {
            return ("Je m'appelle " + this.nom + " et j'ai " + this.pdv + " point(s) de vie");
        } else {
            return (nom + " est mort(e).");
        }


    }

    public void addVie(int num) {
        this.pdv += num;
    }

    public abstract int subitFrappe(int coup);
/*methode abstraite pour une attaque d'un monstre car la valeur retournée,valeur correspondante aux dommages
        ou soins rendus a l'attaquant, dépend du type de personnage*/

    public abstract void attaque(Personnage p);
    /*methode abstraite pour une attaque car le type de coup subit dépend du type de personnage*/
    
    

    public abstract int subitCharme(int coup);
    /*methode abstraite pour une attaque d'un monstre car la valeur retournée,valeur correspondante aux dommages
        ou soins rendus a l'attaquant, dépend du type de personnage*/
}
