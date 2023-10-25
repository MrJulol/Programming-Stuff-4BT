package A5;

public class Vehicle {
    private double pos;
    private int speed;

    private int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void move(double travelTime){
        travelTime/=60;
        pos+=this.speed * travelTime;
    }
}
