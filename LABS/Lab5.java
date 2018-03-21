/*
Gerson Rivas
Co Sci 290
Lab 5
- fix the logic and make this code check if each character is a letter
*/


import java.util.Scanner;
public class Lab5{

public static void main(String[] args){  
//instantiate the Scanner object
     Scanner input = new Scanner(System.in);
     
     int nameLength = 0;
     String answer = "";
     boolean flag = false; //flag is optional
 
 //example of while loop
 while(nameLength < 2){
 System.out.println("What is your name?");
 
 //get answer from console
 answer = input.next();
 
 //check if name is less than 2 characters
 if(answer.length() < 2 ){
 System.out.println("Please enter in a name that is atleast "
                                + "two letters long and no numbers");
 flag = false;                               
                                
 }
 
 else{
 for(int index = 0; index < answer.length(); index++ ){
 
 System.out.println(answer.charAt(index));
 
 //check if the character is a letter or a number
 if(!Character.isLetter(answer.charAt(index))){ //if its not a letter
 System.out.println("Please enter in a name that is atleast "
                   + "two letters long and no numbers");
 break; //gets out of loop
 }
 }
 }
 
 nameLength = answer.length();
 System.out.println("Name length = "  + nameLength );
     } //end while loop
   } //end of main method
 } //end of class 