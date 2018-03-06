/*
Gerson Rivas
Co Sci 290

Demo on the string class

*/


import java.util.Scanner;

public class TestStrings{
//main

public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  /*
  Impose rules on user input
  
  
  */
  
  int nameLength = 0;
  boolean flag = false;
  String answer = "";
  
  while(answer.length() < 2){
    System.out.println("What is your name? ");
     answer = input.next();  
    //name.length() - gives a int of how many chacters the string is long
  if(answer.length() < 2 || flag){
    System.out.println("Please enter in a name thats atleast 2 chacters long and no numbers");
  }
    
    else{ //name is atleast 2 characters
      //check if name contains letters
      // for example, go through each letters in the name Logan
      //name.CHarAt(0) to look at the character in index 0
      //Use a for-loop because we know how many letters it has
      
      
      for(int index = 0; index < name.Length(); index++ ){
        System.out.println(answer.charAt(index));
        //check if the character is a letter
        if(!Character.isLetter(name.charAt(index))){ // if it's not a letter
          flag = true;
          break; //gets out of the loop
          
        }
      }
      
    }
    
    nameLength = answer.length();
  }
  /*
  When you want code to run a code atleast once, use a do-while loop
  
  do{
  
  
  
  }
  
  
  
  
  
  
  
  */
  
  
  System.out.println("Are you rich? Yes or No? ");
  
  //get answer from console  
  String answer = input.next();  
  //answer = answer.toLowerCase();
  //answer.toLowerCase() - makes all letters lowercase
  //answer.toUpperCase() - makes all letters Uppercase
  //answer.equals("some other string") - checks if two strings are exactly the same
  
  //name.length() - gives a int of how many chacters the string is long
  if(answer.length() < 2){
    System.out.println("Please enter in a namw thats atleast 2 chacters long");
  }
  
  if(answer.equalsIgnoreCase("no")){ //no != No
    System.out.println("That sucks");
  }  
  
  else{
    System.out.println("Cool");
  }
  
  
}


  
}