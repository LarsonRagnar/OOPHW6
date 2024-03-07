package two;

public class Car extends Vehicle {

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
        
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() * 0.8;
    }
    
}
