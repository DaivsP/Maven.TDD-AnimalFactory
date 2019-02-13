package rocks.zipcodewilmington;

import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    private Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat("Davis", new Date(25), 45);
    }

    @Test
    public void addTest(){
        //Given
        //Cat already exists

        //When

    }
}
