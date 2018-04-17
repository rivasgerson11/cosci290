/* 
Gerson Rivas
Co Sci 290
Homework 1
*/

import java.util.Scanner;

public class GameDriver2{
  
  public static void main(String[] args){
    
  
  // Initialize Scanner  input
  Scanner input = new Scanner(System.in);
  Utility tool = new Utility(); // instantiate Utility for use
  SplashScreen splash = new SplashScreen();  
  String name = ""; 
    
        
  splash.intro();
  
  tool.readFile("Story.txt");
  
  //story setup
 
 // name = input.next();  
    
  
 // int days = input.nextInt();

    
    
    
  int numberOfZombies = 20;
  int actNumberOfZombies = 100;
  
  int chanceOfSurviving = 8 + (int)(Math.random() * 100 );  
    
  if(chanceOfSurviving <= 25 ){
    System.out.println("You made it through the " + chanceOfSurviving + " zombies alive and safely got to the chopper! ");
  }  
  else{
    System.out.println(" The " + chanceOfSurviving + " zombies ate your brains, you died ");
    
  splash.gameOver(); 
                                           
    
    
    
    
  }   
    
    
  }
  
  
}