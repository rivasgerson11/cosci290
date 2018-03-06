
import java.util.Scanner;
public class lab6{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
    
    System.out.println(" Guess a Random number between 0 and 100 ");
    
    int guess = input.nextInt();
    
   
    System.out.println(" Your guess is: "+ guess);
    
     int randomNum = 1 + (int)(Math.random() * 100);
    System.out.println(randomNum);
    
    if(guess > randomNum){
    System.out.println("Your guess is too high ");
    }
    else if(guess < randomNum){
    System.out.println("Your guess is too low");
    }
    else{
    System.out.println("Yesss! Your guess is correct");
    }
    System.out.println(" Computer generated number "+ randomNum);
    
    
    
    
    
  }
}