/* abstract class computer{
    public abstract void code();
}

class Laptop extends computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class deskTop extends computer{
    public void code(){
        System.out.println("code,compile,run, faster");
    }
}

class Developer{
    public void devApp(computer lap){
        lap.code();
        System.out.println("coding");
    }
}

public class interfaceDev {
    public static void main(String[] a){
        computer lap=new Laptop();
        computer desk=new deskTop();
        Developer nis=new Developer();
        nis.devApp(desk);
    }
} */

interface computer{
     void code();
}

class Laptop implements computer{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class deskTop implements computer{
    public void code(){
        System.out.println("code,compile,run, faster");
    }
}

class Developer{
    public void devApp(computer lap){
        lap.code();
        System.out.println("coding");
    }
}

public class interfaceDev {
    public static void main(String[] a){
        computer laptop=new Laptop();
        computer desk=new deskTop();
        Developer nis=new Developer();
        nis.devApp(desk);
        nis.devApp(laptop);
    }
}
