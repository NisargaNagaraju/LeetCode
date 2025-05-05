class Student{

    int rollnumber;
    String name;
    int marks;
}

public class Array2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollnumber =1;
        s1.name="name";
        s1.marks=54;

        Student s2=new Student();
        s2.rollnumber =2;
        s2.name="name";
        s2.marks=54;

        Student s3=new Student();
        s3.rollnumber =3;
        s3.name="name";
        s3.marks=54;

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for (int i=0;i<students.length;i++){
            System.out.println(students[i].name+ " : "+students[i].rollnumber);
        }
        
    }
}
