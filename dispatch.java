class A{
	void show()
	{
		System.out.println("1st one");
	}
}
class B extends A{
	void show()
	{
		System.out.println("2nd one");
	}
}
class C extends A{
	void show()
	{
		System.out.println("3rd one");
	}
}
class Test {
	public static void main(String[] arg){
		A a= new A();
		B b= new B();
		C c= new C();
		A ref ;
        ref = a;
        ref.show();
        ref = b;
        ref.show();
        ref = c;
        ref.show();
    }
}