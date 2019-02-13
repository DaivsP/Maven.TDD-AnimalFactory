package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        //Given
        String givenName = "Davis";
        Date givenDate = new Date();
        Integer givenId = 45;

        //When
        Dog dog = new Dog(givenName, givenDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenDate, retrievedDate);
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void creatCatTest(){
        //Given
        String givenName = "Davis";
        Date givenDate = new Date();
        Integer givenId = 45;

        //When
        Cat cat = new Cat(givenName, givenDate, givenId);
        String retrievedName = cat.getName();
        Date retrievedDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenDate, retrievedDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
