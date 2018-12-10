import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		System.out.println(file.toString());

		File f = new File("11.txt")	;
		BufferedWriter br1= new BufferedWriter(new FileWriter(f));
		br1.write("line 1");
		br1.newLine();
		br1.write("last");
		
	}

}
