public class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
    @Override
    public void roam() {
        System.out.println("Dog roams in the room");
    }
}
