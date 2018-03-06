/*
Gerson Rivas
Co Sci 290
 Testing datatypes and input from user
 
 */
import java.util.Scanner; //is a Java object that allows you to take user input

public class TestInput{
 
  //main method - starting point of application
  public static void main(String[]args){
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _, or $
    //2. Identifiers with multiple words are camelCased
    //e.g. - numOfStudents, name, interestRate, 
    
    //primitive datatypes
    //int - integer - whole number
    //double - decimal number => 3.33, 0.2, -33, etc
    //char - single character inside single quotations => '3', '!', ''
    //boolean - true or false
    
    //object/reference datatypes
    //String - characters surrounded with double quotations => "ndslfnledsf", "bark", "4"
    /*There are other objects in java that comes with Java and that are custom
      => Objects/class that comes with Java: scanner, System, etc.Objects
      => Customer classes: Zombie, SpaceInvader, Person, etc
     */
    final double PI_VALUE = 3.1415; //constants are all capital, multiples words seperated by underscores
    String name = "";
    name = "Pnut";
    int numberOfStudents = 29;
    double avgGPA = 3.78;
    boolean gameOver = false; //or true
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hello" + name);
    
    name = input.next(); //. next() is for String Types
    
    System.out.println("Hello" + name);
    
    System.out.println("How old are you?");
    
    int age = input.nextInt(); //. nextInt() is for int types
    
    System.out.println("You are" + age + "years old!");
    
    /*
    Arithmetic Operators
    + add
    - minus
    * multiply
    / divide
    = equals, assign
    % modulus, remainder, e.g. 10 % 2 ==> 10 / 2 and then finding remainder, which is 0
    
    Programming math operations follow the same order of operations as in Math (), exponents, mutltiplication OR division, addition OR subtraction from left to right
    
    */
    
    int month = age * 12;
    int days = age * 365;
    int hours = days * 24; 
    
    System.out.println("You are " + month + " months old OR " + days + " days ols OR " + hours + "hours old!");
    
    
  }
  
}