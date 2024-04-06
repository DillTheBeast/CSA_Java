public class Transportation {
    public static void main(String[] args) {
        //Car c1 = new Vehicle();
        Car c2 = new Car();
        Car c3 = new SportsCar();
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new SportsCar();
        //SportsCar s1 = new Vehicle();
        //SportsCar s2 = new Car();
        SportsCar s3 = new SportsCar();
        c3.test(c3, s3);
    }
}

class Vehicle {

}

class Car extends Vehicle {
    public void test(Car c, SportsCar s) {

    }
}

class SportsCar extends Car {

}