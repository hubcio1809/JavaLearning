import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();

//        Mammal catMammal = new Cat();
//        Animal birdAnimal = new Bird();

        System.out.println(Animal.test);

        System.out.println("Cat");
        cat.talk();
        System.out.println(cat.getNumberOfLegs());
        cat.sleep();
        cat.wakeUp();
        System.out.println("-------------------------");


//        System.out.println("CatMammal");
//        // catMammal.talk(); - not able to use this method - not implemeted in mammal
//        catMammal.sleep();
//        catMammal.wakeUp();
//        System.out.println("-------------------------");


        System.out.println("Bird");
        bird.talk();
        System.out.println(bird.getNumberOfLegs());
        bird.sleep();
        bird.wakeUp();
        System.out.println("-------------------------");

//        System.out.println("BirdAnimal");
//        birdAnimal.talk();
//        System.out.println(birdAnimal.getNumberOfLegs());
//        birdAnimal.sleep();
//        birdAnimal.wakeUp();
//        System.out.println("-------------------------");

        showAnimalInfo(cat);
        showAnimalInfo(bird);
        showAnimalInfo(dog);

        Animal[] animals = {cat, dog, bird};

        for (Animal animal : animals){
            showAnimalInfo(animal);
        }
    }

    private static void showAnimalInfo( Animal animal) {
        System.out.println(animal.getType());
        animal.talk();
        System.out.println(animal.getNumberOfLegs());
        animal.sleep();
        animal.wakeUp();
        System.out.println(animal.getSize().getTranslation());
        System.out.println(animal.getSize().getTestValue());
        // System.out.println(animal.getSize().equals(SizeType.BIG)); - possible nullpointer need to compare 100% existing value to possible size
        System.out.println(SizeType.BIG.equals(animal.getSize())); // Correct assertion
        System.out.println("-------------------------");
    }

}

 