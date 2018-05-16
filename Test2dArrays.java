public class Test2dArrays{
  public static void main(String[] args){
    
    //declare 2d array
    String[][] words = new String[3][2];
    /*
    {null, null}
    {null, null}
    {null, null}
    
    */
    //first element in first array 
      words[0][0] = "cat";
      //get element
      System.out.println(words[0][0]);
      //iterate through array and assign values using loops
    for(int i = 0; i < words.length; i++){
      for(int j = 0; j < words[i].length; j++){
        words[i][j] = i * j + " cats "; //assign
        System.out.println(words[i][j]); //print
      }
    }
    //pass function
    System.out.println(printArray(words));
  }
    //this method concatenates all elements in a 2d array
    public static String printArray(String[][] array){
      
      String concat = "";
      
      for(int i = 0; i < array.length; i++){
        for(int j = 0; j < array[i].length; j++){
          concat = concat + array[i][j] + " "; //concatenates each String element
        }
        
      }
    return concat;
    }
  
  
    
    
  
}