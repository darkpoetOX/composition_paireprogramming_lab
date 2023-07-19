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

    @Override
    public void startEngine() {
        System.out.println("engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("engine stopped");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
