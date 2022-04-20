package bai_tap_nang_cao_Arraylist.model;

public class Car extends Vehicle {
    private Integer seats;
    private String type ;

    public Car(){
        //
    }

    public Car(Integer seats, String type) {
        this.seats = seats;
        this.type = type;
    }

    public Car(String plates, String makerName, int yearOfMaking, String owner, Integer seats, String type) {
        super(plates, makerName, yearOfMaking, owner);
        this.seats = seats;
        this.type = type;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+ "," +
                "Seats of Car is: " + seats +
                ", Type of Car is: '" + type;
    }
}
