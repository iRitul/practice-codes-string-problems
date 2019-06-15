import java.io.*;
class Test
{
public static void main(String args[])
{
try(BufferedReader br=new BufferedReader(new FileReader("c:/source.txt")))
{String str;
while((str=br.readLine())!=null)
{
System.out.println(str);
}}
catch(IOException ie){
System.out.println("exception");}
}
}