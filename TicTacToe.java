/*
  Author: Gerson Rivas
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class TicTacToe{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static char xo = 'x'; //holds which player is currently playing
  static char ox = 'o';
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
       if(board[row][col] != ' '){
      System.out.println("That space is taken, try again");
      continue;
    }
      move(row, col);
      changeXO();
      
      if(checkWinner()){
        gameOver = true;
        printBoard();
      }
      
    }
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
    
    
    System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
    System.out.println("-----------");
    System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
    System.out.println("-----------");
    System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    /*for (int i = 0; i < board.length; i++){
    for (int j = 0; j < board[i].length; j++){
        System.out.print(board[i][j]);
    }
    
    */
 
  }//end of printBoard
  
  public static void changeXO(){
    
    if ( xo == 'x'){
      xo = 'o';
    }
    else{
      xo = 'x';
    }
    

    
  }//end of changeXO
   
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
 
   
    
    if( xo == 'x'){
      if(row == 0 && col == 0 ){
        board[0][0] = 'x';
      }
      if(row == 1 && col == 0){
        board[1][0] = 'x';
      }
       if(row == 0 && col == 1){
        board[0][1] = 'x';
      }
      if(row == 1 && col == 1){
        board[1][1] = 'x';
      }
      if(row == 1 && col == 2){
        board[1][2] = 'x';
      }
      if(row == 2 && col == 1){
        board[2][1] = 'x';
      }
      if(row == 2 && col == 2){
        board[2][2] = 'x';
      }
      if(row == 2 && col == 0){
        board[2][0] = 'x';
      }
      if(row == 0 && col == 2){
        board[0][2] = 'x';
      }
     
    }
    if( xo == 'o'){
      if(row == 0 && col == 0 ){
        board[0][0] = 'o';
      }
      if(row == 1 && col == 0){
        board[1][0] = 'o';
      }
       if(row == 0 && col == 1){
        board[0][1] = 'o';
      }
      if(row == 1 && col == 1){
        board[1][1] = 'o';
      }
      if(row == 1 && col == 2){
        board[1][2] = 'o';
      }
      if(row == 2 && col == 1){
        board[2][1] = 'o';
      }
      if(row == 2 && col == 2){
        board[2][2] = 'o';
      }
      if(row == 2 && col == 0){
        board[2][0] = 'o';
      }
      if(row == 0 && col == 2){
        board[0][2] = 'o';
      }
     
    }
        
   
  }//end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
   boolean temp = false;
    if (board[0][0] == board[0][1] &&  board[0][0] == board[0][2] && board[0][0] != ' '){
      temp = true;
    }
     if (board[1][0] == board[1][1] &&  board[1][0] == board[1][2] && board[1][0] != ' '){
      temp = true;
    }
     if (board[2][0] == board[2][1] &&  board[2][0] == board[2][2] && board[2][0] != ' '){
      temp = true;
    }
    if (board[0][0] == board[1][0] &&  board[0][0] == board[2][0] && board[0][0] != ' '){
      temp = true;
    }
    if (board[0][1] == board[1][1] &&  board[0][1] == board[2][1] && board[0][1] != ' '){
      temp = true;
    }
    if (board[0][2] == board[1][2] &&  board[0][2] == board[2][2] && board[0][2] != ' '){
      temp = true;
    }
    if (board[0][0] == board[1][1] &&  board[0][0] == board[2][2] && board[0][0] != ' '){
      temp = true;
    }
    if (board[0][2] == board[1][1] &&  board[0][2] == board[2][0] && board[0][2] != ' '){
      temp = true;
    }
     
    
  return temp;
    
   
    
  }//end of checkWinner
  
  
}//end class