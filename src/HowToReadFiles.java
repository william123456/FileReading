import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HowToReadFiles {
public static void main(String[] args) {
	File f = new File("Champions");
	try (BufferedReader bR = new BufferedReader(new FileReader(f))){
		String x;
		while((x = bR.readLine())!=null){
			System.out.println(x);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
