
/* Gerson Rivas 
Co sci 290

Lab 18 pt 2
*/
public class lab18pt2{
  public static void main(String[] args){
    
    //new array 
    int[] array = new int[5];
    //random array generator loop
    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random() + 5 );
      System.out.println(array[i]);
    }
  }

}