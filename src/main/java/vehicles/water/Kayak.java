package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, ){

    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
