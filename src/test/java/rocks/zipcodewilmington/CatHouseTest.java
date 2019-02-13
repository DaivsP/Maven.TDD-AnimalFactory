package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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

    private CatHouse catHouse;
    private Cat cat;
    private Cat cat2;

    @Before
    public void setup(){
        this.catHouse = new CatHouse();
        this.cat = new Cat("Davis", new Date(25), 45);
        this.cat2 = new Cat("Brandon", new Date(30), 50);
    }

    @After
    public void tearDown(){
        this.catHouse.clear();
    }

    @Test
    public void addTest(){
        //Given
        catHouse.add(cat);
        Integer expected = 1;

        //When

        //Then
        Assert.assertEquals(expected, catHouse.getNumberOfCats());
    }

    @Test
    public void removeIdTest(){
        //Given
        catHouse.add(cat);
        catHouse.remove(45);
        Integer expected = 0;

        //Then
        Assert.assertEquals(expected, catHouse.getNumberOfCats());
    }

    @Test
    public  void removeTest(){
        //Given
        catHouse.add(cat);
        catHouse.remove(cat);
        Integer expected = 0;

        //Then
        Assert.assertEquals(expected, catHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest(){
        //Given
        catHouse.add(cat);

        //Then
        Assert.assertEquals(catHouse.getCatById(45), cat);
    }

    @Test
    public void getNumberOfCatsTest(){
        //Given
        catHouse.add(cat);
        catHouse.add(cat2);
        Integer expected = 2;

        //Then
        Assert.assertEquals(expected, catHouse.getNumberOfCats());
    }
}
