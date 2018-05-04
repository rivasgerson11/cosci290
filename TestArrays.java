import java.util.Scanner;
public class TestArrays{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //declare array
    String[] names = new String[5];
    
    names[0] = "Steven";
    names[1] = "Chris";
    names[2] = "Gerson";
    names[3] = "Adam";
    names[4] = "Hai";
    
    //update
    names[3] = "Lynn";
    
    for(int i = 0; i < names.length; i++){
      i = input.nextInt();
       System.out.println("element: " + i + ": " + names[i]);
    }
   
   }
}