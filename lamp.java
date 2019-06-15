import java.*;
class lamp{
boolean isOn;
void turnon()
{
isOn = true;
}
void turnoff()
{
isOn = false;
}
void displaylightstatus(){
System.out.println("Light on?" +isOn);
}
}
class New{
public static void main(String args[])
{
lamp l1 =new lamp();
lamp l2 =new lamp();
l1.turnon();
l2.turnoff();
System.out.println("L1");
l1.displaylightstatus();
System.out.println("L2");
l2.displaylightstatus();
}
}