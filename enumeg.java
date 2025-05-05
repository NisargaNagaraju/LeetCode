enum Status{
    Running,failed,Pending,Success;
}

public class enumeg {

    public static void main(String a[]){
        int i=5;
        Status s=Status.failed;
        Status[] t=Status.values();
        System.out.println(s+""+i);
        System.out.println(s.ordinal());
        System.out.println(t[0]);

for(Status c:t){
    System.out.println(c + " : " +c.ordinal());

}
    }
    
}
