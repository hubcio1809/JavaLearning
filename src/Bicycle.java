public class Bicycle extends Vehicle {
    public void ringBell(){
        System.out.println("Dyrń!Dryń");
    }

    @Override
    void run() {
        System.out.println("Bike run slow becouse it's powered by legs");
    }

}

