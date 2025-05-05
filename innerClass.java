 class A {

    public void show(){
        System.out.println("show method");
    }
    
    static class B{
        public void config(){
            System.out.println("in config");
        }
    }

}

public class innerClass{

    public static void main(String a[]){
        A obj=new A();
        obj.show();

        A.B obj1= new A.B();
        obj1.config();
    }

}
