package bai_tap_nang_cao_Arraylist.model;

public class Moto extends Vehicle {
    private Integer horsePower;
    public Moto(){
     //
    }



    public Moto(String plates, String makerName, int yearOfMaking, String owner, Integer horsePower) {
        super(plates, makerName, yearOfMaking, owner);
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return super.toString()+ "," +
                "The Horse Power of Motor is: " + horsePower;
    }
}
