package File.Demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {

		File file = new File("myTestFile");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

			bw.write("My name is nayan buha ");
			bw.newLine();
			bw.write("I am working at QDEV Technolab ");
			System.out.println("Writing on to the file compleat");

		} catch (IOException e) {
			System.out.println("Error occured");
		}
	}
}
