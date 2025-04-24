public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.start();
        System.out.println("Number of seats:" + car.getNumberOfSeats());
        car.stop();
        System.out.println(" ");
        Animal[] animals = { new Cat(), new Dog(), new Lion(), new Wolf() };
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            System.out.println(" ");
        }
    }
}
