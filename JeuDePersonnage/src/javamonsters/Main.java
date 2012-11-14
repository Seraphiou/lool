package javamonsters;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Seraphin
 */
public class Main {

    public static void main(String[] args) {
        //Création des cinq sorciers
        Sorcier s1 = new Sorcier("Harry Potter", (int) (Math.random() * 100));
        Sorcier s2 = new Sorcier("Gandalf", (int) (Math.random() * 100));
        Sorcier s3 = new Sorcier("Saruman", (int) (Math.random() * 100));
        Sorcier s4 = new Sorcier("Merlin l'enchanteur", (int) (Math.random() * 100));
        Sorcier s5 = new Sorcier("La fée Carabosse", (int) (Math.random() * 100));
        //Création des cinq Monstres j'ai mis le maximum de point de vie des Monstres à 200 pour tomber plus souvent sur le cas ou un seul monstre reste
        Personnage m1 = new Monstre("Alien", (int) (Math.random() * 200));
        Monstre m2 = new Monstre("Shrek", (int) (Math.random() * 200));
        Monstre m3 = new Monstre("Cyclope", (int) (Math.random() * 200));
        Monstre m4 = new Monstre("Goliath", (int) (Math.random() * 200));
        Monstre m5 = new Monstre("Le Yéti", (int) (Math.random() * 200));
        //Création du tableau de personnages
        m1=s1;
        Personnage[] tableauPersonnages = new Personnage[10];
        //rangement des Personnages créés dans le tableau
        tableauPersonnages[0] = s1;
        tableauPersonnages[1] = s2;
        tableauPersonnages[2] = s3;
        tableauPersonnages[3] = s4;
        tableauPersonnages[4] = s5;
        tableauPersonnages[5] = m1;
        tableauPersonnages[6] = m2;
        tableauPersonnages[7] = m3;
        tableauPersonnages[8] = m4;
        tableauPersonnages[9] = m5;

        //declaration et initialisation des variables de tirage de personnage
        int var1 = 0;
        int var2 = 0;

        //initialisation des compteurs
        int nombreDeRescapes = 3;//compteur du nombre de personnages vivants
        int nombreAttaque = 0;//compteur du nombre d'attaques
        int nombreMonstrestues = 0;//compteur du nombre de monstres tués

        for (int i = 0; i < 100 && nombreDeRescapes > 1 && nombreMonstrestues < 5; i++) {//S'il reste un seul monstre, si on arrive a 100, s'il n'y a plus de monstre le jeu se bloque.

            //mise a  zero des compteurs
            nombreDeRescapes = 0;
            nombreMonstrestues = 0;

            //egalisation des deux variables de tirages pour la condition du while
            var1 = 0;
            var2 = 0;

            while ((var1 == var2) || tableauPersonnages[var1].mort() || tableauPersonnages[var2].mort()) {//conditions pour que l'attaque soit valables

                var1 = (int) (Math.random() * 10);//tirage de le variable 1
                var2 = (int) (Math.random() * 10);//tirage de le variable 2
            }

            //Attaque!
            tableauPersonnages[var1].attaque(tableauPersonnages[var2]);

            //incrémentation du nombre d'attaque
            nombreAttaque++;
            //affichage des statuts des personnages après chaque attaques
            for (int j = 0; j < 10; j++) {
                System.out.println(tableauPersonnages[j]);
            }

            //comptage du nombre de Monstres tues
            for (int l = 5; l < 10; l++) {
                if (tableauPersonnages[l].mort()) {
                    nombreMonstrestues++;
                }
            }
            //comptage du nombre de rescapés
            for (int k = 0; k < 10; k++) {
                if (!tableauPersonnages[k].mort()) {
                    nombreDeRescapes++;
                }

            }





        }
        //affichage de statistiques finales
        if (nombreDeRescapes > 1) {
            System.out.println("Il reste " + nombreDeRescapes + " personnages vivants!");
        } else {
            System.out.println("Il reste " + nombreDeRescapes + " seul personnage vivant!");
        }
        System.out.println("Il y a eu en tout" + nombreAttaque + " attaques.");
        if (nombreDeRescapes > 1) {
            for (int m = 0; m < 10; m++) {
                if (!tableauPersonnages[m].mort()) {
                    System.out.print(tableauPersonnages[m].getNom() + ", ");


                }

            }

            System.out.println("ont gagné.");
        } else {
            for (int m = 0; m < 10; m++) {
                if (!tableauPersonnages[m].mort()) {
                    System.out.print(tableauPersonnages[m].getNom() + " ");


                }

            }

            System.out.println("a gagné.");
            
            
        }


    }
}
