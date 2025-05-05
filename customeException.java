class testException extends Exception{
    public testException(String string){
        super(string);
    }
}

public class customeException {
    public static void main(String a[]){
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new testException("Success");
            }
        }
            catch(testException e){
                j=18/1;
                System.out.println("the default output"+ " " +e);
            }
            catch(Exception e){
                System.out.println("Something went wrong");
            }
      
    }
    
}
