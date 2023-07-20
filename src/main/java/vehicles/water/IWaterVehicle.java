package vehicles.water;

import products.IProduct;
import vehicles.IVehicle;

public interface IWaterVehicle extends IVehicle {

    String getHullType();
    void setHullType(String hullType);



}
