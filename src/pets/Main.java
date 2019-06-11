package pets;

public class Main {
    public static void main(String[] args) {

        Pet[] pets = new Pet[3];

        pets[0] = new Cow();
        pets[1] = new Dog();
        pets[2] = new Cat();

        for (Pet pet : pets) {
            pet.voice();
        }
    }
}
