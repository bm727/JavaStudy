class Microwave {
    private String brand;
    private int power;
    private Double price;
    
    //construct
    public  Microwave(String brand, int power , double price){
        setMicrowave (brand, power, price);
    }
    
    //ต้องได้ค่าออกมาตามDatatype
    public String getbrand(){
        return brand;
    }
    public int getpower(){
        return power;
    }
    public double getprice(){
        return price;
    }
    
    
    
    //String []i = {'a','b','c','d','e','f','g'};
    public void setBrand(String brand){
        if (brand == "a" ){
            this.brand = brand;
        }
    }
    public void setPower(int power){
        if (power >= 10 && power <= 500 ){
            this.power = power;
        }
    }
    public void setPrice(Double price){
        if (price >= 0 && price <= 10000 ){
            this.price = price;
        }
    }
    
    public void setMicrowave(String brand, int power , double price){
        setBrand(brand);
        setPower(power);
        setPrice(price);
    }
    
}
public class MicrowaveTest {
    public static void main(String args[]) {
      Microwave micro1 = new Microwave("a", 150 , 1200 );

      System.out.println(micro1);
    }
}