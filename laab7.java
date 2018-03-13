  import java.util.Scanner;
public class laab7{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
  //declaring variables
  String integers = "";
  int positives = 0;
  int negatives = 0; 
  
  //ask for the input
  integers = input.next();
  System.out.println("Enter an integer, the input ends if it is 0");
  
  
  System.out.println(integers);
    
  //end code if 0 input
    if(integers.length = 0 ){
      System.out.println("Enter something else than 0");
     
    }
  //initiate for loop with this conditional
    else if(integers.length() < 0 || integers.length() > 0){
      
    

      for(int i = 0; i < integers.length(); i++){
        System.out.println(integers.charAt(i));
      }
    }
    
  /*for(int i = 0; i < integers.length(); i++){
    System.out.println(i);
  }
  
  if( i >= 1 ){
    return (positives + 1);
  }
  
  else{
    return (negatives + 1);
  }
  
  System.out.println(" Positives = " + positives);
  System.out.println(" Negatives = " + negatives); */
    
  
  
  
  
  
  
}
}