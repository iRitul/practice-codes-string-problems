import java.io.FileReader; 
public class count1{
	public static void main(String[] args)throws Exception {
			FileReader fr = new FileReader("C:/source.txt");
			int i;
			int count=0;
 
			while ((i = fr.read()) != -1) {
				if(i=='{' || i=='}' || i=='(' || i==')')
				count++;
			}
			System.out.println(count);
			fr.close();
                      
		}
}