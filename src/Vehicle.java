public abstract class Vehicle {
    Vehicle(){

    }
    Vehicle(String model){
        this.model = model;
    }

    public String colour;
    public String model;
    public Double price;
    abstract void run();
    public void isItVehicle(){
        System.out.println("Yes it is");
    }
    public void getVehicleInfo(){
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Price: " + price);
    }
}