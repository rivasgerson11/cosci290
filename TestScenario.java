public class TestScenario{


  public static void main(String[] args){
  
  int minimum = 1;
  int maximum = 100;
  int randomNum = minimum + (int)(Math.random() * maximum);
  
  System.out.println( randomNum ); 
    
  if(randomNum >= 90){
    System.out.println("Awesome you got a rocket gun! ");
  }
  
  else if(randomNum >= 80){
    System.out.println("Great you got a Machine gun with multiple attachments");
  
  }
  
  else if(randomNum >= 70)  {
    System.out.println("not bad, you got a sub-machine gun ");
  }  
  else if(randomNum >= 60 ){
    System.out.println("okay, you got a semi-auto rifle ");
  }   
  else if(randomNum >= 50 ){
    System.out.println("it'll do, you got a handgun");
  }
  else if(randomNum >= 40) {
    System.out.println("Aww man, you just got a pocket knife ");
  }
  else if(randomNum <= 30 && randomNum >= 15){
    System.out.println(" You got a hand grenade ");
  }  
  else{
    System.out.println("Ohh no, you got a teddy bear");
  }  
 
}
  }
