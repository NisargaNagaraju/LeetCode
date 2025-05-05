public class exceptionTest {
    
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int nums[]=new int[5];
        try{
            j=18/i;
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in you array limit");
        }
        catch(Exception e){

            System.out.println("Something wents wrong"+e);
        }

        System.out.println(j);
        System.out.println("Bye");

        
    }
}
