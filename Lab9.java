import java.util.Scanner;
public class Lab9{
  public static void main(String[] args){
    
    Scanner input = new Scanner (System.in);
    
    
    
    //Ask for user input
    System.out.println(" Compiler: enter a number of digits that I can reverse - ");
      
    int number = input.nextInt();
    
    //check for palindrome
    System.out.println(number + (isPalindrome(number) ? " is a Palindrome " : " is not a Palindrome"));
      
    }
  
  
  //palindrome header
  public static boolean isPalindrome(int number){
    return number == reverse(number) ? true : false;
  }
    
  
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number){    
      //initiate reverse formula with while loop
      
       int reverseInt = 0;

        // method to reverse number

        while(number>0){
          //System.out.println("in while loop");
          reverseInt += number % 10;      
          number /= 10;

        }

        return reverseInt;
      
    }
     
}
    
  
