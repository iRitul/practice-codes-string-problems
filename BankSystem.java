import java.util.*;

abstract class bank
{
  abstract void showBal();
  abstract void withdraw();
  abstract void deposit();
  abstract void interest();
 }

class SBI extends bank {
float bal=50000, roi=5 , amt=20000;
void showBal()
    {
	System.out.println("Balance in account is " +bal);
	}
	

void withdraw()
    {
	System.out.println("Balance in account is " +amt);
	 bal=bal-amt;
	System.out.println("Updated balance is " +bal); 
	}

void deposit()
    {
	System.out.println("Balance in account is " +amt);
	 bal=bal+amt;
	System.out.println("Updated balance is " +bal); 
	
	}
	
void interest()
    {
	System.out.println("Balance in account is " +amt);
	float interest=(roi/100)*bal;
	System.out.println("interest amount is "+interest+" in one year"); 
	}
}	
	
	
	
class PNB extends bank {
float bal=60000, roi=7 , amt=30000;
void showBal()
    {
	System.out.println("Balance in account is " +bal);
	}
	

void withdraw()
    {
	System.out.println("Balance in account is " +amt);
	 bal=bal-amt;
	System.out.println("Updated balance is " +bal); 
	}

void deposit()
    {
	System.out.println("Balance in account is " +amt);
	 bal=bal+amt;
	System.out.println("Updated balance is " +bal); 
	
	}
	
void interest()
    {
	System.out.println("Balance in account is " +amt);
	float interest=(roi/100)*bal;
	System.out.println("interest amount is "+interest+" in one year"); 
	}
}	
	
class BankSystem
{
  public static void main(String args[])
 {
    bank a = new SBI();
	bank b = new PNB();
	a.showBal();
	a.withdraw();
	a.deposit();
	a.interest();
	b.showBal();
	b.withdraw();
	b.showBal();
	b.interest();
	}
}	