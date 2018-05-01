import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputDrive{

  
  
	public void writeFile(String filename);
 
  

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
 Scanner input = new Scanner(System.in);
			String content = input.next();

			bw.write(content);


		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}