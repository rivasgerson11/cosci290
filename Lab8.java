import java.util.Scanner;

public class Lab8{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
 


  
//Ask for user input
System.out.println(" Compiler: enter a number of digits that I can sum up - ");
  
long digit = input.nextLong();

//add all the numbers
System.out.println("The sum of all the numbers is: " + sumDigits(digit));  
  
  
}
//Header  
public static long sumDigits(long n){
  

  int sum = 0;
  while (n > 0){
    sum += n % 10;
    n /= 10;
  }
  return sum;
}
  
  
  
}
