class Calculator {
    int aa;
    int bb;
    
    public int add(int a1, int b1) {
        int r = a1 + b1;
        return r;
    }
}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        Calculator cal = new Calculator();
        int res = cal.add(num1, num2);
        
        System.out.println(res);
    }
}
