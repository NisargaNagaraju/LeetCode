
enum Status{
    Running,failed,Pending,Success;
}

public class enumSwitch {

    public static void main(String a[]){
        Status s =Status.Pending;

        System.out.println(s.getClass().getSuperclass());

       switch(s){
        case Running:
        System.out.println("All good");
        break;

        case failed:
        System.out.println("Try again");
        break;

        case Pending:
        System.out.println("please wait");
        break;
        
        default:
        System.out.println("Success");
        break;


       }
       
    }
    
}

