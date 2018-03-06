/*
lab 6- wite a prograam that takes user inputs in the format of [number between 0-9] [item]

input 
2 guns or 5 zobies

output you have 2 guns and 5 zobies
*/

import java.util.Scanner;
  

public class Lab6{

public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  int str = input.next();
  
  System.out.println(str.substring(0,9));
  int zombies = input.next();
  System.out.println("You have" + substring + zombies );

}

}