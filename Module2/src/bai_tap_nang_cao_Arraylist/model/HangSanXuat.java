package bai_tap_nang_cao_Arraylist.model;
import java.util.ArrayList;
public class HangSanXuat {
    int id;
    String name ;
    String nation ;

    public HangSanXuat() {
        // no parameter;
    }
    public HangSanXuat(int id, String name, String nation) {
        this.id = id;
        this.name = name;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public static void main(String[] args) {
        HangSanXuat maker1 = new HangSanXuat(1,"Honda","Japan" );
        HangSanXuat maker2 = new HangSanXuat(2,"Ducati","Italy" );
        HangSanXuat maker3 = new HangSanXuat(3,"Toyota","Japan" );
        HangSanXuat maker4 = new HangSanXuat(4,"BMW","German" );
        HangSanXuat maker5 = new HangSanXuat(5,"Tesla","USA" );
        HangSanXuat maker6 = new HangSanXuat(6,"Yamaha","Japan" );

        ArrayList<HangSanXuat> MakerList = new ArrayList<>();
        MakerList.add(maker1);
        MakerList.add(maker2);
        MakerList.add(maker3);
        MakerList.add(maker4);
        MakerList.add(maker5);
        MakerList.add(maker6);
        for (int i =0; i <MakerList.size(); i++) {
            System.out.println(MakerList.get(i).getName());
        }

    }


}
