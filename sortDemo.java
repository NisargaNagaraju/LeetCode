import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class student {
    int age;
    String name;
    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "student [age=" + age + ", name=" + name + "]";
    }
  
    /* public int compareTo(student that) {
        if(this.age>that.age)
        return 1;
        else 
        return -1;
    } */
    

    
}
public class sortDemo {
    public static void main(String[] args) {

        Comparator<student> com=( i, j)->  (i.age>j.age)?1:-1;
      


        List<student> studs=new ArrayList<>();
        studs.add(new student(21, "nisa"));
        studs.add(new student(34, "ram"));
        studs.add(new student(45, "test"));
        studs.add(new student(56, "us"));
        studs.add(new student(67, "nags"));

        Collections.sort(studs,com);
        for(student s :studs)
        System.out.println(s);
    }
    
}
