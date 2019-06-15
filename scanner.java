import java.util.Scanner;
class Getinputfromuser{
public static void main(String args[])
{
	String s;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a string");
	s = in.nextLine();
	System.out.println("You have entered string \t"+s);
}
}