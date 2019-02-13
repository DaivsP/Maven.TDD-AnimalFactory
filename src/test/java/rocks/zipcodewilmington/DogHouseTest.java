package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    private DogHouse dogHouse;
    private Dog dog;
    private Dog dog2;

    @Before
    public void setup(){
        this.dogHouse = new DogHouse();
        this.dog = new Dog("Davis", new Date(25), 45);
        this.dog2 = new Dog("Charlie", new Date(26), 50);
    }

    @After
    public void tearDown(){
        this.dogHouse.clear();
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest(){
        //Given
        dogHouse.add(dog);
        Integer expected = 1;

        //Then
        Assert.assertEquals(expected, dogHouse.getNumberOfDogs());
    }

    @Test
    public void removeIdTest(){
        //Given
        dogHouse.add(dog);
        dogHouse.remove(45);
        Integer expected = 0;

        //Then
        Assert.assertEquals(expected, dogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogTest(){
        //Given
        dogHouse.add(dog);
        dogHouse.add(dog2);
        dogHouse.remove(dog);
        Integer expected = 1;

        //Then
        Assert.assertEquals(expected, dogHouse.getNumberOfDogs());
    }

    @Test
    public void getDogByIdTest(){
        //Given
        dogHouse.add(dog);

        //Then
        Assert.assertEquals(dogHouse.getDogById(45), dog);
    }

    @Test
    public void getNumberOfDogsTest(){
        //Given
        dogHouse.add(dog);
        dogHouse.add(dog2);
        Integer expected = 2;

        //Then
        Assert.assertEquals(expected, dogHouse.getNumberOfDogs());
    }
}
