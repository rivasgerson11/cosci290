

/* Gerson Rivas 
Co sci 290

Lab 18
*/


import java.util.Scanner;
public class lab18{
  public static void main(String[] args){
    //new array
    int numbers[] = new int[10];
      
    Scanner input = new Scanner(System.in);
    //loop to ask for user input
    for(int i = 0;i < numbers.length; i++ ){
      System.out.println("Enter a number greater than 1.5");
      int nums = input.nextInt();
    numbers[i] = nums;
    //call method
    System.out.println("minimum number: " + min(numbers));
    
   
    }
 
  }
  
   

    //method
   public static int min(int[] numbers){
    
  //loop to find minimum number
    int minimum = numbers[0];
    for(int i = 1;i < numbers.length; i++ ){
      if (numbers[i] < minimum){
        minimum = numbers[i];
        
      }
      
    }
     
      return minimum;
     
  }
}
