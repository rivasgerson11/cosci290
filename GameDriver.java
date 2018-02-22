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
                                                                     
    
  //story setup
  System.out.println(" Soldier: Hey there survivor! ");
  
  System.out.println(" Survivor: Hey there! "); 
    
  System.out.println(" Soldier: What is your name? ");
  
  name = input.next();  
    
  System.out.println(" Soldier: Wow " + name + " I can't believe you're still alive! ");
    
  System.out.println( name +": It has been a struggle trying to staying alive, but I've been holding them zombies back "); 
    
  System.out.println(" Soldier:  How many days have you been stranded by yourself on this island? ");
    
  int days = input.nextInt();
    
  System.out.println( name +": I've kept myself alive for " + days + " days. ");  
    
  System.out.println(" Soldier: Great!  ");
    
  System.out.println(" Soldier: Well you're the last survivor, so we must now get back to the chopper! ");
    
  System.out.println( name +": But, we must fight our way through! ");  
    
  System.out.println(" Soldier: Yes, take this weapon and we might have a chance to make it through. ");
    
  System.out.println( name +": Lets get to the chopper! ");
    
  
  System.out.println("========================================== zombies loading ==========================================");  
    
    
    
    
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