import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestWriteFile {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      String FILENAME = "UserInput.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String content = input.next();

			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}