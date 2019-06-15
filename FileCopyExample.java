import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class FileCopyExample {
 
	public static void main(String[] args) {
 
		try {
			FileReader fr = new FileReader("C:/source.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("Z:/destin.txt", true);
			String s;
 
			while ((s = br.readLine()) != null) {
				fw.write(s);
				fw.flush();
			}
			br.close();
			fw.close();
                        System.out.println("file copied");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}