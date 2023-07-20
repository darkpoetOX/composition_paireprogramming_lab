package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class SpeedBoat extends Vehicle implements IWaterVehicle, IMotorised {

    String hullType;
    IMotorised motor;

    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;

    }

    @Override
    public String getHullType() {
        return hullType;
    }


    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public IMotorised getMotor() {
        return this.motor;
    }

    public void setMotor(IMotorised motor) {
        this.motor = motor;
    }

    public void startEngine() {
        this.motor.startEngine();
    }

    public void stopEngine() {
        this.motor.stopEngine();

    }

    public int getHp() {
        return this.motor.getHp();
    }

    public void setHp(int hp) {

        this.motor.setHp(hp);

    }

    public int getFuel() {
        return this.motor.getFuel();
    }

    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);

    }
}
