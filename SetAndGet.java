public class SetAndGet{
private String name;
public void setName(String n)
{
name =n;
}
public String getName() {
 return name;
}

public static void main(String args[])
{
SetAndGet l = new SetAndGet();
l.setName("Richard");
System.out.println(l.getName());
}
}