abstract class Bank
{
abstract int getROI();
}
class SBI extends Bank
{ 
int getROI()
{
return 4;
}
}
class Testbank{
public static void main(String args[]){
	Bank b = new SBI();
	int interest =b.getROI();
	System.out.println("rate of interest is "+interest+"%");
}	
}