import java.util.Scanner;
public class TextAdventure{
 public static void main(String[] args){
    
  
  // Initialize Scanner  input
  Scanner input = new Scanner(System.in);
  Utility tool = new Utility(); // instantiate Utility for use
  SplashScreen splash = new SplashScreen();  
  InputDrive write = new InputDrive();
  
  
  String name = ""; 
   
  
  tool.readFile("Doc.txt");
   
  write.writeFile("UserInput.txt");
        
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