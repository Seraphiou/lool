/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.sep;

/**
 *
 * @author Seraphin
 */
public class NainDeJardin implements Victime {

    protected int solidite;

    public NainDeJardin() {
        this.solidite = (int) (Math.random() * 50);



    }

    public String toString() {
        if (!this.detruit()) {
            return "Nain "+solidite;
        } else {
            return "X";
        }



    }

    public boolean detruit() {
        return this.solidite < 1;

    }

    public int subitFrappe(int coup) {
        int s;
        s = solidite;

        if (coup > solidite) {

            solidite = 0;

            return -s;

        } else {
            return -coup;

        }




    }

    public int subitCharme(int coup) {
        return -1;



    }
    public void cataclisme(){
    this.solidite=this.solidite-1;
    
    }
}
