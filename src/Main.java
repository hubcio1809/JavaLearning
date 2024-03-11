public class Main {

    public static void main(String[] args) {

        Car VW = new Car("VW");
        VW.getVehicleInfo();

        System.out.println("--------------------------------------");

        Car audiCar = new Car();
        audiCar.model = "Audi";
        audiCar.colour = "Red";
        audiCar.price = 23000.00;
        audiCar.km = 1200;
        audiCar.getVehicleInfo();
        audiCar.isItVehicle();
        Integer topSpeedAudi = audiCar.getTopSpeed();
        System.out.println("Top speed is: " + topSpeedAudi);
        audiCar.run();

        System.out.println("--------------------------------------");

        Car bmwCar = new Car();
        bmwCar.model = "BWM";
        bmwCar.colour = "Yellow";
        bmwCar.price = 28000.00;
        bmwCar.getVehicleInfo();
        bmwCar.isItVehicle();
        bmwCar.setTopSpeed(233);
        Integer topSpeedBMW = bmwCar.getTopSpeed();
        System.out.println("Top speed is: " + topSpeedBMW);
        bmwCar.run();

        System.out.println("--------------------------------------");

        Bicycle bicycle = new Bicycle();
        bicycle.model="RowerDwukołowy";
        bicycle.colour="black";
        bicycle.price= 1000.00;
        bicycle.getVehicleInfo();
        bicycle.ringBell();
        bicycle.isItVehicle();
        bicycle.run();







    }

}

 