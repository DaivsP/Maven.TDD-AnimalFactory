package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    @Test
    public void setNameTest() {
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        String expectedName = "Daivs";

        //When
        cat.setName(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSpeak() {
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        String expected = "meow!";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthdate() {
        Date bday = new Date();
        Date bday1 = new Date(1);

        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        Date expected = bday;

        //When
        cat.setBirthDate(bday);

        //Then
        Assert.assertEquals(expected, cat.getBirthDate());
    }
    @Test
    public void testEat(){
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        Food food = new Food();
        Integer numberOfMeals = 1;

        //When
        cat.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals, cat.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId(){
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        Integer expected = 45;

        //When
        cat.getId();

        //Then
        Assert.assertEquals(expected, cat.getId());
    }

    @Test
    public void testInstanceOf(){
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        Boolean expected = true;

        //When
        Boolean actual = cat instanceof Animal;

        //Then
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testInstanceofM(){
        //Given
        Cat cat = new Cat("Davis", new Date(25), 45);
        Boolean expected = true;

        //When
        Boolean actual = cat instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }
}

