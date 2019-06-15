import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.Queue;
	public class QueueExample {
	public static void main(String[] args) {
	Queue qe=new LinkedList<String>();
	qe.add("b");
	qe.add("a");
	qe.add("c");
	qe.add("e");
	qe.add("d");
	Iterator it=qe.iterator();
	System.out.println("Initial Size of Queue :"+qe.size());
	while(it.hasNext()){
	String iteratorValue=(String)it.next();
	System.out.println("Queue Next Value :"+iteratorValue);
	}
	System.out.println("Queue peek :"+qe.peek());
	System.out.println("Queue poll :"+qe.poll());
	System.out.println("Final Size of Queue :"+qe.size());
	}
}