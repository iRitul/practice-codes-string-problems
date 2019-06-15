import java.util.*;
public class SetDemo {
public static void main(String args[]) {
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> unsortedSet = new HashSet<Integer>();
      try {
         for(int i = 0; i < count.length; i++) {
            unsortedSet.add(count[i]);
         }
         System.out.println("The unsorted set is: " + unsortedSet);
         TreeSet sortedSet = new TreeSet<Integer>(unsortedSet);
         System.out.println("The sorted set is:   " + sortedSet);
         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
      }
      catch(Exception e) {}
   }

}