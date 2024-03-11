public class Car extends Vehicle {
    Car(){
        this.topSpeed = 120;
    }

    Car(String model){
        super(model);
        this.topSpeed = 120;
    }
    public Integer km;
    private Integer topSpeed;
    public Integer getTopSpeed(){
        return this.topSpeed;
    }
    public void setTopSpeed(Integer topSpeed){
        this.topSpeed = topSpeed;
    }
    @Override
    public void getVehicleInfo(){
        super.getVehicleInfo();
        System.out.println("KM:" + km);
    }
    @Override
    void run() {
        System.out.println("Car run fast becouse it's powered by engine");
    }



}

