public class Car {
    String model;
    String brand;
    String color;
    public Car (String m, String b,String c){
        this.brand = b;
        this.model = m;
        this.color = c;
    }
    public void printInfo(){
        System.out.println("Brand: " + this.brand +", Model: " + this.model + ", Color: " + this.color);
    }
    public String getColor(){
        return this.color;
    }

}
