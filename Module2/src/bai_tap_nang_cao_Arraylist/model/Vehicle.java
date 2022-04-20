package bai_tap_nang_cao_Arraylist.model;

public abstract class Vehicle {
    private String plates;
    private String makerName;
    protected int yearOfMaking;
    protected String owner;

    protected Vehicle(){
        // no parameter Constructor;
    }

    public Vehicle(String plates, String makerName, int yearOfMaking, String owner) {
        this.plates = plates;
        this.makerName = makerName;
        this.yearOfMaking = yearOfMaking;
        this.owner = owner;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }

    public int getYearOfMaking() {
        return yearOfMaking;
    }

    public void setYearOfMaking(int yearOfMaking) {
        this.yearOfMaking = yearOfMaking;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "License plates is: " + plates +
                ", Name of Maker is: " + makerName +
                ", Year of Manufacturing is: " + yearOfMaking +
                ", Owner is: " + owner;
    }
}
