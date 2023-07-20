package vehicles;

public class Motor implements IMotorised{

    private int fuel;
    private int hp;


    public Motor(int fuel, int hp){
        this.fuel = fuel;
        this.hp = hp;
    }


    public int getFuel() {
        return this.fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void startEngine() {
        System.out.println("motor engine run");
    }

    public void stopEngine() {
        System.out.println("motor engine stop running");
    }






}
