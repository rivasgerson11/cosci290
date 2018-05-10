public class quiz2{
  public static void main(String[] args){
  int[] array1 = new int [6];
  int[] array2 = new int[6];
  
  printArray1(array1);
  printArray2(array2);
  }
  public static void printArray1( int[] array1){ 
  int[] odd = new int[6];
  int[] even = new int[6];
  for ( int i = 0; i < array1.length; i ++){
    array1[i] =  (int)(Math.random() * 100);
    if (array1[i] % 2 == 0 ){
      even[i] = array1[i];
    }
      System.out.println(" In Array 1 The even numbers are: " + even[i]);
    
    if (array1[i] % 2 != 0 ){
     odd[i] = array1[i];
    }
    System.out.println("The odd numbers in Array1 : " + odd[i] );
    
  }
  System.out.println("Array 1 : [ " + array1[0] + " , " + array1[1] +  " , " + array1[2] + 
                       " , " + array1[3] +  " , " + array1[4] +  " , " + array1[5] + " ]" );
  
  }  
  
  public static void printArray2( int[] array2 ){ 
  int[] odd2 = new int[6];
  int[] even2 = new int[6];
  for ( int i = 0; i < array2.length; i ++){
    array2[i] =  (int)(Math.random() * 100);
  if (array2[i] % 2 == 0 ){
  even2[i] = array2[i]; 
  }
      System.out.println(" In Array 2 The even numbers are: " + even2[i]);
    
    if (array2[i] % 2 != 0 ){
      odd2[i] = array2[i];
    }
     System.out.println(" In Array 2 The odd numbers are: " + odd2[i]);
    
    
  }
  
  
  System.out.println("Array 2 : [ " + array2[0] + " , " + array2[1] +  " , " + array2[2] + 
                       " , " + array2[3] +  " , " + array2[4] +  " , " + array2[5] + " ]");
  
  }
}

  
  
  
  
