import java.util.HashMap;
import java.util.Map;

public class demomap {
    public static void main(String[] args) {
        Map<String, Integer> students=new HashMap<>();

        students.put("aa", 12);
        students.put("rr", 56);
        students.put("tt", 11);
        students.put("aa", 10);
        System.out.println(students);
        System.out.println(students.keySet());

        for(String name : students.keySet()){
            System.err.println(name+" : "+students.get(name));
        }
  
    }
}
