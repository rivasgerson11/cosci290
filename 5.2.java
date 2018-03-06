
import java.util.Scanner
public class 5.2{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
    
    System.out.println(" Guess a Random number between 0 and 100 ");
    
    int guess = input.next();
    
    int randomNum = 1 + (int)(Math.random() * 100);
    
    if(guess > randomNum){
    System.out.println("Your guess is too high ");
    }
    else if(guess < randomNum){
    System.out.println("Your guess is too low");
    }
    else{
    System.out.println("Yesss! Your guess is correct");
    }
    
    
    
    
    
  }
}