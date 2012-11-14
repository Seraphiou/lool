package pkg12.sep;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Seraphin
 */
public abstract class Personnage implements Victime {

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

    public boolean detruit() {//indique si le personnge est mort
        return !(this.pdv > 0);


    }

    public String toString() {//affichage par defaut d'un objet en String
        if (!(this.detruit())) {
            return (this.nom + " " + this.pdv);
        } else {
            return ("X");
        }


    }

    public void addVie(int num) {
        if (Math.abs(num) < (Math.pow(2, 31) - 1)) {//test d'infinité
            if (this.pdv <= 0) {
                this.pdv = 0;
            } else {
                this.pdv += num;
            }
        } else {
            if (num < 0) {
                num = (int) (-Math.pow(2, 31)) + 1;
            } else {
                if (num > 0) {
                    num = (int) (Math.pow(2, 31)) - 1;
                }
            }
        }

    }

    public abstract int subitFrappe(int coup);
    /*methode abstraite pour une attaque d'un monstre car la valeur retournée,valeur correspondante aux dommages
     ou soins rendus a l'attaquant, dépend du type de personnage*/

    public abstract void attaque(Victime v);
    /*methode abstraite pour une attaque car le type de coup subit dépend du type de personnage*/

    public void cataclisme() {
        this.pdv = this.pdv - 1;

    }

    public abstract int subitCharme(int coup);
    /*methode abstraite pour une attaque d'un monstre car la valeur retournée,valeur correspondante aux dommages
     ou soins rendus a l'attaquant, dépend du type de personnage*/
}
