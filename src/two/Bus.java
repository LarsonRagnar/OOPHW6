package two;

public class Bus extends Vehicle  {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.calculateAllowedSpeed() *0.6;
    }
    

    
}
