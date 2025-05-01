import java.util.*;
import java.util.stream.Collectors;

public class lambdaonCollections {
    public static void main(String[] args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(1);
        l.add(10);
        System.out.println(l);

        Comparator<Integer> c=(I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);
        l.stream().forEach(System.out::println);

        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);

    }
}
