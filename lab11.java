/* Gerson Rivas
Co Sci 290
Lab 11 */

import java.util.Scanner;
public class lab11{
  //main
public static void main(String[] args){
  
Scanner input = new Scanner(System.in);
 
  //ask for a number
  System.out.println(" Enter a number ");
  int num = input.nextInt();
  // print matrix
  printMatrix(num);
}
  //method to display n by n matrix
  public static void printMatrix(int num){ 
  for (int rows = 0; rows < num; rows++){
    for (int cols = 0; cols < num; cols++){
      //generate 0 and 1
      System.out.print((int)(Math.random() * 2));
    }
    //print another line
    System.out.println();
  }
  }

}