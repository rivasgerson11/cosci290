//scanner input
import java.util.Scanner;
public class Lab12{
	//main method
	public static void main(String[] args){
		String odd = "";
		String even = "";
		//scanner input
		Scanner input = new Scanner(System.in);

		System.out.println("This program will check if a number"
    +  "is even or odd...");
		//ask the user for a number
		System.out.println("Please enter in a whole number...");

		int num = input.nextInt();

		checkNums(num);

	}

	public static  void checkNums(int num){
		
		if ( num % 2 == 0){
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		
		//oops...  still need to implement

		}
	}

