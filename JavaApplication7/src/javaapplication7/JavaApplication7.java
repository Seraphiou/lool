/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Seraphin
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int[][] jeu=new int[4][8];
  jeu[0][0]=1;
  jeu[1][0]=1;
  jeu[2][0]=3;
  jeu[3][0]=1;
  jeu[0][1]=3;
  jeu[1][1]=4;
  jeu[2][1]=3;
  jeu[3][1]=1;
  jeu[0][2]=9;
  jeu[1][2]=5;
  jeu[2][2]=6;
  jeu[3][2]=4;
  jeu[0][3]=5;
  jeu[1][3]=4;
  jeu[2][3]=2;
  jeu[3][3]=3;
  jeu[0][4]=1;
  jeu[1][4]=2;
  jeu[2][4]=3;
  jeu[3][4]=5;
  jeu[0][5]=1;
  jeu[1][5]=2;
  jeu[2][5]=1;
  jeu[3][5]=1;
  jeu[0][6]=2;
  jeu[1][6]=3;
  jeu[2][6]=2;
  jeu[3][6]=4;
  jeu[0][7]=3;  
  jeu[1][7]=2;
  jeu[2][7]=1;
  jeu[3][7]=5;
  
  for(int i=0;i<4;i++){
  for(int j=0;j<8;j++){
  System.out.print(jeu[i][j]+" ");
  }
  System.out.println("\n");
  }
  
  
}
}
