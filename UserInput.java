import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public void writeFile(String filename) {
    Scanner input = new Scanner(System.in);
    
   
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

			String content = input.next();

			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}