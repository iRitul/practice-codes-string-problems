class OuterClass {
  int num;
  class InnerClass {
  public void print(){
  System.out.println("This is inner class");
  }
 }
 void display_inner(){
 InnerClass inner= new InnerClass();
 inner.print();
 }
}
public class My_Class {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
	myOuter.display_inner();
	OuterClass.InnerClass inner =myOuter.new InnerClass();
	inner.print();
  }
}