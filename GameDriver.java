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
  System.out.println( "  _|_|_|                                                    \n"
                    + " _|          _|_|    _|  _|_|    _|_|_|    _|_|    _|_|_|  \n"  
                    + " _|  _|_|  _|_|_|_|  _|_|      _|_|      _|    _|  _|    _| \n"  
                    + " _|    _|  _|        _|            _|_|  _|    _|  _|    _| \n"  
                    + "   _|_|_|    _|_|_|  _|        _|_|_|      _|_|    _|    _|  ");
    
  //story setup
  System.out.println(" Soldier: Hey there survivor! ");
  
  System.out.println(" Survivor: Hey there! ") 
    
  System.out.println(" Soldier: What is your name? ");
  
  name = input.next();  
    
  System.out.println(" Soldier: Wow " + name + " I can't believe you're still alive! ");
    
  Sysyem.out.println(" Survivor: It has been a struggle trying to staying alive, but I've been holding them zombies back "); 
    
  System.out.println(" Soldier:  How many days have you been stranded by yourself on this island? ");
    
  int days = input.nextInt();
    
  System.out.println(" Survivor: I've kept myself alive for " + days + " days. ")  
    
  System.out.println(" Soldier: Great!  ");
    
  System.out.println(" Soldier: Well you're the last survivor, so we must now get back to the chopper! ")
    
  System.out.println(" Survivor: But, we must fight our way through! ")  
    
  System.out.println(" Soldier: Yes, take this weapon and we might have a chance to make it through. ")
    
  int numberOfZombies = 20;
  int actNumberOfZombies = 100;
  
  chanceOfSurviving = 8 + (int)(Math.random() * 100 )  
    
  if(chanceOfSurviving <= 25 )  
  }
  
  
}