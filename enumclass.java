enum Laptop{
    Macbook(2000),ThinkPad(1680),Surface;

    private int price;
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    private Laptop(int price){
        this.price=price;

    }

    private Laptop(){
        price=500;

    }
}

public class enumclass {
    public static void main(String[] args) {

        Laptop lap=Laptop.Macbook;
        System.out.println(lap+" : "+ lap.getPrice());
        
        for (Laptop lap1:Laptop.values()){
            System.out.println(lap1+" : "+ lap.getPrice());

        }
    }
    
}
