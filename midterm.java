/*Gerson Rivas
Co Sci 290
MidTerm
*/
//Scanner input
import java.util.Scanner;
public class midterm{
//main method
  public static void main(String[] args){
  
    //input scanner
    Scanner input = new Scanner(System.in); 
    // Ask for a number
    System.out.println("Enter a number greater than 0");
    int number = input.nextInt();
//
    //print matrixes
    printMatrix(number);
    System.out.println();
    printMatrix(number);
  }
  

  //method to display n by n matrix
  public static void printMatrix(int number){ 
  for (int rows = 0; rows < number; rows++){
    for (int cols = 0; cols < number; cols++){
      //generate 0 and 10
      System.out.print((int)(Math.random() * 10) + " ");
     
    }
    //print another line
    System.out.println();
    }
   }
//
  }
