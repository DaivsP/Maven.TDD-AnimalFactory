package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    public Cat(String name, Date birthDate, int id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "meow!";
    }
}
