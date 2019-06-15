interface Printable{
	void print();
	void show();
}
interface showable{
	void print();
}
class testinterface implements Printable , showable{
	public void print(){
		System.out.println("hello");
	}
	public void show(){
		System.out.println("Java");
	}
	public static void main(String args[]){
		Printable obj = new testinterface();
		obj.print();
		obj.show();
		showable obj2 = new testinterface();
		obj2.print();
		//obj2.show();
	}
}
