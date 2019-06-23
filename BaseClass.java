class BaseClass
{
	void MethodOveriding()
	{
		System.out.println("Base Class Method");
	} 
}
class DerivedClass extends BaseClass
{
	void MethodOverriding()
	{
		System.out.println("Derived Class Method");	
	}	
}
class Main
{
	public static void main(String args[])
	{
		DerivedClass obj = new DerivedClass();
		obj.MethodOverriding();	
	}
}