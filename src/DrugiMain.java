public class DrugiMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.sleep();
            animal.roam();
            System.out.println();
        }
    }
}
