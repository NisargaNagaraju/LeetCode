
abstract class A{
    public abstract void show();
    public abstract void config();
}


public class AbstractAndAnonymous {

    public static void main(String[] args){
        A obj=new A(){
            public void show(){
                System.out.println("in B show");
            }

            public void config(){
                System.out.println("in Config Class");
            }
        };
        obj.show();
    }
    


}
