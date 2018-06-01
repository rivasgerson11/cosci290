/*
Gerson Rivas
Co Sci 290
TextAdventure
*/
import java.util.Scanner;
public class TextAdventure{
 public static void main(String[] args){
    
  
  // Initialize Scanner  input
  Scanner input = new Scanner(System.in);
  Utility tool = new Utility(); // instantiate Utility for use
  SplashScreen splash = new SplashScreen();  
  UserInput write = new UserInput();
  
  
  String name = ""; 
   
  
  tool.readFile("Doc.txt");
  System.out.println();
  tool.readFile("profile.txt");
  write.writeFile("userName.txt");
  System.out.println();
  tool.readFile("age.txt");
  write.writeFile("userAge.txt");
  System.out.println();
  tool.readFile("gender.txt");
  write.writeFile("userGender.txt");
  System.out.println();
  tool.readFile("shirt.txt");
  write.writeFile("userShirt.txt");
  System.out.println();
  System.out.println("--------------- Profile: ---------------");
  System.out.println("Username: "); 
  tool.readFile("userName.txt");
  System.out.println();
  System.out.println("Age: ");
  tool.readFile("userAge.txt");
   System.out.println();
  System.out.println("Gender: ");
  tool.readFile("userGender.txt");
   System.out.println();
  System.out.println("Shirt: ");
  tool.readFile("userShirt.txt");
   System.out.println();
   
   System.out.println("--------------- Story: ---------------");
    splash.intro();
    System.out.println();
    tool.readFile("Story.txt");
    int choice = input.nextInt();
   
    int randomSpawn = 20;
   if(choice == 1){
   int chance =  16 + (int)(Math.random() * 50);
      
   if(chance < 20){
     splash.gameOver();
   }
   }
   
   else if(choice == 2){
   int chance =  14 + (int)(Math.random() * 47);
      
   if(chance < 20){
     splash.gameOver();
   }
   }
   
  tool.readFile("gunfire.txt");
   
   
   tool.readFile("story1.txt");  
   int choice2 = input.nextInt();
   
   if(choice2 == 1){
     tool.readFile("above.txt");
     int choice3 = input.nextInt();
       if (choice3 == 1){
         int chance2 = 17 + (int)(Math.random() * 55);
         if(chance2 < 30){
            tool.readFile("gunfire.txt");
           splash.gameOver();
         }
       }
     else if(choice3 == 2){
       int chance2 = 26 + (int)(Math.random() * 47);
        if(chance2 < 30){
           tool.readFile("gunfire.txt");
           splash.gameOver();
         }
     }
     
   }
   else if(choice2 == 2){
     tool.readFile("under.txt");
     int choice3 = input.nextInt();
       if (choice3 == 1){
         int chance2 = 26 + (int)(Math.random() * 47);
         if(chance2 < 30){
            tool.readFile("gunfire.txt");
           splash.gameOver();
       }
   }
       if (choice3 == 2){
         int chance2 = 17 + (int)(Math.random() * 55);
         if(chance2 < 30){
            tool.readFile("gunfire.txt");
           splash.gameOver();
         }
       }
   }
  tool.readFile("gunfire.txt");
tool.readFile("story2.txt");
int choice4 = input.nextInt();

if(choice4 == 1){
  int deathChoice = 1 + (int)(Math.random() * 130);
  if(deathChoice < 100){
     tool.readFile("gunfire.txt");
    splash.gameOver();
  }
  else{
     tool.readFile("gunfire.txt");
    tool.readFile("splash2.txt");
  }
}
   
if(choice4 == 2){
  int deathChoice = 75 + (int)(Math.random() * 155);
  if(deathChoice < 100){
    splash.gameOver();
  }
  else{
     tool.readFile("gunfire.txt");
    tool.readFile("splash2.txt");
  }
}

  
 }
}
