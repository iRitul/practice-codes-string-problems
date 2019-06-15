public class JavaExceptionExample{
public static void main(String args[])
{
try{
int t=100/0;
}
catch(ArithmeticException e){
System.out.println(e);
}
System.out.println("rest of the code..");
}
 }