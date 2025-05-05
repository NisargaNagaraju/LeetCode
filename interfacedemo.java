
interface A{

   int age = 0;
   String area = "Kansas";
    void show();
    void config();
}

interface X
{
    void run();
}

class B implements A,X{

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("show");
    }

    @Override
    public void config() {
        // TODO Auto-generated method stub
        System.out.println("config");
    }
    
    public void run(){
        System.out.println("run");
    }
}
public class interfacedemo
 {
    public static void main(String[] a){
        A obj;
        obj= new B();
        obj.show();
        obj.config();

        System.out.println(A.area);

        X obj1;
        obj1= new B();
        obj1.run();
    }
}
