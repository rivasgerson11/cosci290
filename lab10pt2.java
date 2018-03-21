
/* Gerson Rivas 
Co sci 290

Lab 10 pt. 2
*/



public class lab10pt2{
  public static void main (String[] args){
    //loop for program
    for (int i = 100; i <= 1000; i++ ){
      if( i % 5 == 0 && i % 6 == 0 ){
        System.out.println(i + " ");
        
      if( i % 10 == 0 ){
        System.out.println();
      }
      }
    }
  }
}