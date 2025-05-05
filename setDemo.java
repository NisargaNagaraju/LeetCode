
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
    public static void main(String[] args) {
        
       // Set<Integer> nums=new HashSet<Integer>();
       Set<Integer> nums=new TreeSet<Integer>();
        nums.add(67);
        nums.add(62);
        nums.add(79);
        nums.add(11);

        Iterator<Integer> values=nums.iterator();

        while(values.hasNext())
        System.out.println(values.next());
        
    }
    
}
