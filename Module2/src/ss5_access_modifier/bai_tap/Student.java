package ss5_access_modifier.bai_tap;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
        // no properties for this constructer;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass(String classes) {
        this.classes = classes;
    }
}
