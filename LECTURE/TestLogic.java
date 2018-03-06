/*

Gerson Rivas
Co Sci 290

Topics:

-multi-way if-else
-logical operators
-symbolic logic

*/


import java.util.Scanner;
public class TestLogic{
 //entry point of app
public static void main(String[] args){
  
  //scanner for user input
  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter in a grade: ");
  int grade = input.nextInt();
  
  
  /*//simple if
  if(grade >= 90){
    System.out.println("A");
  }
  if(grade < 90){
    System.out.println("grade is not an A");
  }
  else{
    System.out.println("grade is an A");
  }
  //multi if-else-if-elseif
  if(grade >= 90){
    System.out.println("A");
  }
  else if(grade >= 80){
    System.out.println("B");
  }
  else if(grade >= 70){
    System.out.println("C");
  }
  else{
    System.out.println("F");
  }
  
  /*
  
  Logical operators
  
  ! - NOT
  != - NOT equal to
  == - is equal to
  && - And 
  || - OR
  */
  
  //using if-else, write code that checks wether
  //a stdent grade is good, average or bad
  
  
  
  
  if(grade >= 80){
  System.out.println("This is a good grade.");
  }
  //nested if
  if(grade >= 90){
    System.out.println("Wow you got an A!");
  }
  
  else if(grade < 80 && grade >= 70){
  System.out.println("This grade is average");
  
  }
  
  else{
  System.out.println("This is a bad grade ");
  
  }
}

}