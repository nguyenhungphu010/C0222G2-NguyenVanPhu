package ss7_abstract_class_interface.thuc_hanh.animal;
import ss7_abstract_class_interface.thuc_hanh.edible.Edible;
public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: Quak_quack ";
    }

    @Override
    public String howtoEat() {
        return "can be fried";
    }
}
