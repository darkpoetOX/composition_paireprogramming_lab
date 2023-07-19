package vehicles.air;

import vehicles.IVehicle;

public class Radar implements IVehicle { //red squiggly line won't go away

    private double maxDistance;
     public Radar(double maxDistance){
         this.maxDistance = maxDistance;
     }

    public double getMaxDistance() {
        return this.maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public float getWeight() {
        return this.getWeight();
    }

    @Override
    public void setWeight(float weight) {
        this.setWeight(weight);
    }
}
