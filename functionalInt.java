@FunctionalInterface
interface A{
    int add(int i,int j);

}

/* class B implements A{
    public void show(){
        System.out.println("in show");
    }
}
 */

public class functionalInt {
    public static void main(String[] args) {
        A obj = (i,j)->i+j;

        int result = obj.add(5,4);
        System.out.println(result);
            
        
    }
    
}
