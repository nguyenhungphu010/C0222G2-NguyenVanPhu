package ss7_abstract_class_interface.thuc_hanh;

import ss7_abstract_class_interface.thuc_hanh.animal.Animal;
import ss7_abstract_class_interface.thuc_hanh.animal.Chicken;
import ss7_abstract_class_interface.thuc_hanh.animal.Tiger;
import ss7_abstract_class_interface.thuc_hanh.fruit.Fruit;
import ss7_abstract_class_interface.thuc_hanh.fruit.Orage;
import ss7_abstract_class_interface.thuc_hanh.fruit.Apple;
import ss7_abstract_class_interface.thuc_hanh.edible.Edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal x : animals
        ) {
            System.out.println(x.makeSound());
            if (x instanceof Chicken) {
                System.out.println(((Chicken) x).howtoEat());
            }
        }
        Fruit[] fruit = new Fruit[2];
        fruit [0] = new Apple();
        fruit [1] = new Orage();
        for (Fruit x: fruit
             ) {
            System.out.println(x.howtoEat());
        }

    }
}
