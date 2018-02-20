/*

Gerson Rivas
Co Sci 290

Demo topics:
- increment/decrement operators
- augmented assignment operators
-
*/

public class DemoBoolean{
  
  //start of application
  public static void main(String[] args){
    
  //line 17 and line 18 are equivalent 
  int num = 1;
  num = num + 1; //increment num by 1
  num++; //post-increment
  ++num; //pre-increment
    
  num = 1;
  int count = ++num; //pre-increment, count 2, num 2
  System.out.println("count" + count + " num " + num );
  num = 1;
  count = num++; //post-increment, count 1, num 2
  System.out.println("count " + count + " num " + num );
  
  count = num--; //post-decrement
  count = --num; //pre-decrement
    
  //examples of augmented assignment operators
  num += 2;// num = num + 2
  num *= 2;// num = num * 2
  num /= 2;// num = num / 2
  num -= 2;// num = num - 2
    
  num = 2;
  double num2 = 3.0 * count;
 
  System.out.println("Double wins: " + num * num2);
  System.out.println("Casting a double to int: " + (int) num2);//lose the decimal part
  System.out.println("Casting a int to a double: " + (double) num );//turns the 2 to 2.0
  System.out.println("Casting a char to an int: " + (int) 'c');//turns the c into 99 because os AS
  
  int numberOfZombies = 3;
  int actualNumOfZombies = 100;
    
  
  if(numberOfZombies == actualNumOfZombies){ 
    System.out.println("You might survive the apocalypse! ");
  
  }
  else{
    System.out.println("You might not survive this apocalypse. ");
  }
  
  //generating a random number of Zombies
  //Math.pow(3, 2); 3^2
  System.out.println(Math.random()); // random number between 0 and 1 
  
  // formula for any range use ==> Min + (Math.random()) * (Max - Min)
  System.out.println(1 + (int)(Math.random() * (10 - 5))); 
  
  int chanceOfSurviving = 1 + (int)(Math.random() * (10 - 1));
    
  if(chanceOfSurviving <= 3){
    System.out.println("You made it alive! ");
    
  }
  else{
    System.out.println("Game Over ");
  }
  }
  
}
  