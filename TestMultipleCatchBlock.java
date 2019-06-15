public class TestMultipleCatchBlock{
public static void main(String args[])
{
try{
int t[]= new int[5];
t[5]=100/0;
t[4]=10/0;
}
catch(ArithmeticException e){
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println(e);
}
catch(Exception e){
System.out.println(e);
}
finally{System.out.println("ye to chalega hi");  }
System.out.println("rest of the code..");
}
 }