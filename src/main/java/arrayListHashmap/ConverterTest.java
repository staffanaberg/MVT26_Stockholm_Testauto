package arrayListHashmap;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConverterTest {

    @Test
    public void testToAge() {
        //Till en ny klass Converter ska vi
        //skicka in ett namn i en metod och få tillbaka åldern

        //Arrange
        Converter converter = new Converter();

        //Act
        //"Staffan" - 44

        String name = "Staffan";

        int actual = converter.toAge(name);

        int expected = 44;

        //Assert
        assertEquals(expected, actual);
    }

}
