public class Car {
    public static void main(String[] args) {
        // create a new car object
        Car myCar = new Car();
        // call the drive method
        myCar.drive();
    }

    // create a drive method
    public void drive() {
        System.out.println("Vroom!");
        drink(); // when you call another method in this method, you don't need to use the object name
    }

    public void drink() {
        System.out.println("Slurp!");
    }
}
