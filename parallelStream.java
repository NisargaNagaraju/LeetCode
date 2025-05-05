import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class parallelStream {
    public static void main(String[] args) {
        int size=10000;
        List<Integer> nums=new ArrayList<>(size);

        Random ran=new Random();
        for(int i=1;i<=size;i++){
        nums.add(ran.nextInt(100));
        }

      long startSeq=System.currentTimeMillis();

        int sum2=nums.stream()
                    .map(i->
                    
                    i*2)
                    .mapToInt(i->i)
                    .sum();

        long endSeq=System.currentTimeMillis();

        long startSeq2=System.currentTimeMillis();
        int sum3=nums.parallelStream()
                    .map(i->i*2)
                    .mapToInt(i->i)
                    .sum();
        long endSeq2=System.currentTimeMillis();

        System.out.println(sum3+" "+sum2);
        System.err.println(endSeq-startSeq);
        System.err.println(endSeq2-startSeq2);
    }
    
}
