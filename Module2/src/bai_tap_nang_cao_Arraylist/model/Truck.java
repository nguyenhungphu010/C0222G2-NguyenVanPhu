package bai_tap_nang_cao_Arraylist.model;

public class Truck extends Vehicle {
    int weigh;

    public Truck( ) {
        //
    }

    public Truck(int weigh) {
        this.weigh = weigh;
    }

    public Truck(String plates, String makerName, int yearOfMaking, String owner, int weigh) {
        super(plates, makerName, yearOfMaking, owner);
        this.weigh = weigh;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public String toString() {
        return super.toString()+ "," +
                "The weigh of the Truck is: " + weigh;
    }
}
