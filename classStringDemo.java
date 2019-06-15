public class classStringDemo 
{
public static void main(String[] args)
  {
char[]helloArray={'H','E','L','L','O'};
String s=new String(helloArray);
System.out.println(s);
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s);
s="Sachin";
System.out.println(s);
System.out.println(s.trim());
s="Sachin";
System.out.println(s.startsWith("Sa"));
System.out.println(s.endsWith("n"));
System.out.println(s.charAt(0));
System.out.println(s.length());
int a=10;
s=String.valueOf(a);
System.out.println(s+10);
   }
}