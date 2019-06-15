import java.util.Vector; 
public class BasicVectorOperations {
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        System.out.println(vct);
        vct.add(2,"Random");
        System.out.println(vct);
        System.out.println("Element at index 3 is: "+vct.get(3));
        System.out.println("The first element of this vector is: "+vct.firstElement());
        System.out.println("The last element of this vector is: "+vct.lastElement());
        System.out.println("Is this vector empty? "+vct.isEmpty());
    }
}