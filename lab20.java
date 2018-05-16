/*
Gerson Rivas
co sci 290
Lab 20
*/
public class lab20{
  public static void main(String[] args){
    //declare 2D array
    int[][] nums = new int[5][6];
    int[] rows = new int[6];
    //assign random ints 0 - 100
    for(int i = 0; i < nums.length; i++){
      System.out.println("This is row " + i +": ");
      for(int j = 0; j <  nums[i].length; j++){
       //random num formula
       nums[i][j] = (int)(Math.random() * 100); 
       //print 2d array
       System.out.print(nums[i][j] + " ");
   
      }
      
      System.out.println();
    }
    // call the function 
    rows = printArray(nums);
    
    //iterate through each element to print new array
    for(int i = 0; i < rows.length; i++){
      System.out.println("The sum of row "+ i + " is: ");
      System.out.print(rows[i]);
      System.out.println();
    }
  }
    //function that adds rows in 2d array
    public static int[] printArray( int[][] values){
      int[] sum = new int[5];
      for(int i = 0; i < values.length; i++){
      int sums = 0;
      for(int j = 0; j <  values[0].length; j++){
        sums += values[i][j];
        sum[i] = sums;
      } 
    }
      System.out.println("====== now the sum of rows ======");
     return sum;
    }
 
    
    
  
    
    
    
    
  
}
