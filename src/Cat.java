public class Cat implements Animal,Mammal{

    @Override
    public SizeType getSize() {
        return SizeType.MEDIUM;
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void talk() {
        System.out.println("Meow!Meow!");
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        Animal.super.sleep();
        Mammal.super.sleep();
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }
}
