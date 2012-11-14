/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.sep;

/**
 *
 * @author Seraphin
 */
public class GnomeJardin extends NainDeJardin {

    public GnomeJardin() {

        super();
    }
  
     public String toString(){        
         if (!this.detruit()) {
            return "gnome "+solidite;
        } else {
            return "X";
        }
    }
     public int subitCharme(int coup) {
         
        int sort;
        sort=(int)(Math.random()*this.solidite);
        if(sort>coup){
            return -coup;
        
        
        
        }else{return -1;
        
        
        }
        
    }
}
