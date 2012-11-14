/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.sep;

/**
 *
 * @author Seraphin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void creerTableauVictime(Victime[] tabVic) {

        for (int j = 0; j < tabVic.length; j++) {
            int i;
            i = (int) (Math.random() * 5);
            switch (i) {
                case 0:
                    tabVic[j] = new Monstre("Monstre" + j, (int) (Math.random() * 200));
                    break;
                case 1:
                    tabVic[j] = new Sorcier("Sorcier" + j, (int) (Math.random() * 100));
                    break;
                case 2:
                    tabVic[j] = new Magicien("Magicien" + j, (int) (Math.random() * 100));
                    break;
                case 3:
                    tabVic[j] = new NainDeJardin();
                    break;
                case 4:
                    tabVic[j] = new GnomeJardin();
                    break;

            }

        }



    }

    public static void combattreTableau(Victime[] tabV) {
        int var1;
        int var2;
        int compt=0;
        int nombreDeRescapes = tabV.length;
        for (int i = 0; i < 10000 && nombreDeRescapes > 1; i++) {


            var1 = 0;
            var2 = 0;

            while ((var1 == var2) || tabV[var1].detruit() || tabV[var2].detruit()) {

                var1 = (int) (Math.random() * tabV.length);//tirage de le variable 1
                var2 = (int) (Math.random() * tabV.length);//tirage de le variable 2
            }

            //Attaque!
            if (tabV[var1] instanceof Personnage) {
                ((Personnage) tabV[var1]).attaque(tabV[var2]);
                if(tabV[var1] instanceof SuperPouvoir&&tabV[var2] instanceof SuperPouvoir){
                for(int k=0;k<tabV.length;k++){
                tabV[k].cataclisme();
                }
                
                }
            }
            nombreDeRescapes = 0;
            for (int k = 0; k < tabV.length; k++) {
                if (!tabV[k].detruit() && (tabV[k] instanceof Personnage)) {
                    nombreDeRescapes++;
                }
            }
            compt++;
        }
        System.out.print(compt+" attaques");
    }

    public static void afficheTableau(Victime[] tabVic) {
        System.out.println();
        for (int j = 0; j < tabVic.length; j++) {

            System.out.println(tabVic[j]);


        }



    }

    public static void main(String[] args) {
        Victime[] t1 = new Victime[50];
        creerTableauVictime(t1);

        combattreTableau(t1);
        afficheTableau(t1);







    }
}
