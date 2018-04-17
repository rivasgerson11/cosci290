/* 
Gerson Rivas
Co Sci 290
Homework 1
*/

import java.util.Scanner;

public class GameDriver{
  
  public static void main(String[] args){
    
  
  // Initialize Scanner  input
  Scanner input = new Scanner(System.in);
  Utility tool = new Utility(); // instantiate Utility for use
    
  String name = ""; 
    
    
  //splash screen  
  System.out.println( "   @@@@@@@@   @@@@@@   @@@@@@@@@@   @@@@@@@   @@@  @@@@@@@@   @@@@@@  \n" 
                  +  "    @@@@@@@@  @@@@@@@@  @@@@@@@@@@@  @@@@@@@@  @@@  @@@@@@@@  @@@@@@@  \n"  
                  +  "         @@!  @@!  @@@  @@! @@! @@!  @@!  @@@  @@!  @@!       !@@   \n"     
                  +  "        !@!   !@!  @!@  !@! !@! !@!  !@   @!@  !@!  !@!       !@!   \n"     
                  +  "       @!!    @!@  !@!  @!! !!@ @!@  @!@!@!@   !!@  @!!!:!    !!@@!!  \n"   
                  +  "      !!!     !@!  !!!  !@!   ! !@!  !!!@!!!!  !!!  !!!!!:     !!@!!!   \n" 
                  +  "     !!:      !!:  !!!  !!:     !!:  !!:  !!!  !!:  !!:            !:!  \n" 
                  +  "    :!:       :!:  !:!  :!:     :!:  :!:  !:!  :!:  :!:           !:!   \n" 
                  +  "     :: ::::  ::::: ::  :::     ::    :: ::::   ::   :: ::::  :::: ::   \n" 
                  +  "    : :: : :   : :  :    :      :    :: : ::   :    : :: ::   :: : :  \n"  ); 
                                                                     
  tool.readFile("Story.txt");
  //story setup
 
  name = input.next();  
    
  
  int days = input.nextInt();
    
 
    
    
    
  int numberOfZombies = 20;
  int actNumberOfZombies = 100;
  
  int chanceOfSurviving = 8 + (int)(Math.random() * 100 );  
    
  if(chanceOfSurviving <= 25 ){
    System.out.println("You made it through the " + chanceOfSurviving + " zombies alive and safely got to the chopper! ");
  }  
  else{
    System.out.println(" The " + chanceOfSurviving + " zombies ate your brains, you died ");
    
  System.out.println(  "   _|_|_|  \n"                                    
                   +  "   _|          _|_|_|  _|_|_|  _|_|      _|_|  \n"  
                   +  "   _|  _|_|  _|    _|  _|    _|    _|  _|_|_|_|  \n"
                   +  "   _|    _|  _|    _|  _|    _|    _|  _|        \n"
                   +  "     _|_|_|    _|_|_|  _|    _|    _|    _|_|_|  \n"



                    + "     _|_|   \n"                                 
                    +  "  _|    _|  _|      _|    _|_|    _|  _|_| \n" 
                    + "   _|    _|  _|      _|  _|_|_|_|  _|_|  \n"    
                    + "   _|    _|    _|  _|    _|        _|  \n"      
                    + "     _|_|        _|        _|_|_|  _|   \n" );     
                                           
    
    
    
    
  }   
    
    
  }
  
  
}