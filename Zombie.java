import java.util.Scanner; // allows you to take user input

public class Zombie{
  
  
  public static void main(String[] args){
    
    String name = "";
    
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hey survivor, what is your name?");
    
    name = input.next();
    
    System.out.println("Hello, " + name + " How many days have you been on this island?");
    
    int days = input.nextInt();
    
    System.out.println("Wow!" + days );
  
  }          
}