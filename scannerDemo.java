import java.io.IOException;
import java.util.Scanner;

public class scannerDemo {
    public static void main(String a[]) throws IOException{
        System.out.println("Enter a number");

      /*   InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        int num=Integer.parseInt(bf.readLine());
         */

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
       
    }
    
}
