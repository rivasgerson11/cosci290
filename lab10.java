
/* Gerson Rivas 
Co Sci 290
Lab 10*/


//scanner
import java.util.Scanner;
public class lab10{
//main method
  public static void main(String[] args){
    //scanner
    Scanner input = new Scanner(System.in);
      
    double celsius = 1;
    double fahrenheit = 1;
    
    //ask for the celsius to fahrenheit
    System.out.println(" Enter a Celsius number to convert to fahrenheit ");
    celsius = input.nextDouble();
    //call celsius to fahrenheit in main method
    System.out.println(celsiusToFahrenheit(celsius));
    
    //ask for the farenheit to celsius
    System.out.println(" Enter a fahrenheit number to convert to celsius");
    fahrenheit = input.nextDouble();
    //call farenheit to celsius in main method
    System.out.println(fahrenheitToCelsius(fahrenheit));
    }

  //celsius to fahrenheit method
  public static double celsiusToFahrenheit(double celsius){
    //variable call
    double f = 0;

    //celcius to fahrenheit equation
     f = (9.0 / 5) * celsius + 32;
       //return statement
    System.out.println("Farenheit = " + f);
    return f;
  }
   
  //farenheit to celsius method
  public static double fahrenheitToCelsius(double fahrenheit){
    //variable call
    double c = 0;
    //celsius to farenheit equation
    c = (5.0 / 9) * (fahrenheit - 32);
    //return statement
    System.out.println("Celsius = " + c);
    return c;
    
  }
   
  }