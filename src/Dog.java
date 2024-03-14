public class Dog implements Animal,Mammal{

    @Override
    public SizeType getSize() {
        return SizeType.BIG;
    }

//    @Override
//    public SizeType getSize() {
//        return SizeType.valueOf("BIG");
//    }
    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public void talk() {
        System.out.println("Szczek!");

    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");;
    }

    @Override
    public void wakeUp() {
        System.out.println("Dog woke up!");
    }
}
