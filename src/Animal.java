public interface Animal {

    SizeType getSize();
    String getType();
    public static final String test = "test"; // need to be declared cant change - always public,static,final
    void talk();
    int getNumberOfLegs();

    default void sleep(){
        System.out.println("Sleeping");
    }

    default void wakeUp(){
        System.out.println("WokeUp!");
    }
}
