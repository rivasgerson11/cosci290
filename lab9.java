
import java.util.Scanner;


public class lab9{
 
 //main method
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  //ask for user input
  System.out.println( " Enter a number greater than 0 ");
  int number = input.nextInt();
  
  //palindrome method
  if (isPalindrome(number)){
    System.out.println(" Number is a palindrome ");
  }
  else{
    System.out.println(" Number is not a palindrome ");
  }
 }
  // Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number){  
  //variable calling
  int reverse = 0;
  int digit; 
  //reverse method
  while(number != 0){
    digit = number % 10;
    reverse = reverse * 10 + digit;
    number = number / 10;  
  }
  //print reverse
  System.out.println("reverse: " + reverse);
  return reverse;
}
  // Return true if number is a palindrome
public static boolean isPalindrome(int number){
  return (number == reverse(number));
  }
  
}


