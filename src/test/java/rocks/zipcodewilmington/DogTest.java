package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Before
    public void setup(){
        this.dog = new Dog("Davis", new Date(25), 45);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest(){
        //Given
        //Dog already exists
        String expected = "bark!";

        //When
        dog.speak();

        //Then
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void setBirthdateTest(){
        Date bday = new Date();
        Date bday1 = new Date(1);

        //Given
        //Dog already exists
        Date expected = bday;

        //When
        dog.setBirthDate(bday);

        //Then
        Assert.assertEquals(expected, dog.getBirthDate());
    }

    @Test
    public void eatTest(){
        //Given
        //Dog already exists
        Food food = new Food();
        Integer numberOfMeals = 1;

        //When
        dog.eat(food);

        //Then
        Assert.assertEquals(numberOfMeals, dog.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        //Given
        //Dog already exists
        Integer expected = 45;

        //When
        dog.getId();

        //Then
        Assert.assertEquals(expected, dog.getId());
    }

    @Test
    public void animalInheritanceTest(){
        //Given
        //Dog alreay exists
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        //Given
        //Dog already exists
        Boolean expected = true;

        //When
        Boolean actual = dog instanceof Mammal;

        //Then
        Assert.assertEquals(expected, actual);
    }

}
