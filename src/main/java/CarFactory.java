public class CarFactory{
    String brand = "Ford";
    String model = "Mustang";
    String [] colors = {"Czerwony","Czarny","Biały"};
    public Car buildCar(){
        int index = (int) Math.floor(colors.length*Math.random());
        return new Car (brand, model, colors[index]);

    }
}