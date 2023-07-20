package vehicles;

public final class Engine implements IMotorised {
    private int fuel;
    private int hp;
    private int fuelLevel;
//    private int setFuelLevel;
//    private int getSetFuelLevel;


    public Engine(int fuel, int hp, int fuelLevel) {
        this.fuel = fuel;
        this.hp = hp;
//        this.fuelLevel = fuelLevel;
    }

    public void startEngine() {
        System.out.println("engine started");
    }


    public void stopEngine() {
        System.out.println("engine stopped");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
