public interface Mammal {
    default void sleep(){
        System.out.println("Sleeping mammal");
    }

    default void wakeUp(){
        System.out.println("WokeUp mammal!");
    }
}
