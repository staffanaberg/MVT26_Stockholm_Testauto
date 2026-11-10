package assignment;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

public class ConverterTest {

    @Test
    public void testConvertEtoMorse() {
        Converter converter = new Converter();
        String text = "E";

        String actual = converter.convert(text);
        String expected = ".";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertHtoMorse() {
        Converter converter = new Converter();
        String text = "H";

        String actual = converter.convert(text);
        String expected = "....";

        assertEquals(expected, actual);
    }

    //EH -> . ....
    @Test
    public void testConvertEHtoMorse() {
        Converter converter = new Converter();
        String text = "EH";

        String actual = converter.convert(text);
        String expected = ". ....";

        assertEquals(expected, actual);
    }

    //Översätt . -> E
    @Test
    public void testConvertMorseToE() {
        Converter converter = new Converter();
        String text = ".";

        String actual = converter.convertMorse(text);
        String expected = "E";

        assertEquals(expected, actual);
    }

    @Test
    public void testConvertMorseToH() {
        Converter converter = new Converter();
        String text = "....";

        String actual = converter.convertMorse(text);
        String expected = "H";

        assertEquals(expected, actual);
    }


    //Översätt . .... -> EH
    @Test
    public void testConvertMorseToEH() {
        Converter converter = new Converter();
        String text = ". ....";

        String actual = converter.convertMorse(text);
        String expected = "EH";

        assertEquals(expected, actual);
    }

    //Ogiltliga tecken

    //Gemener istället för versaler

    //Extra whitespace

    //Meningar? Ord?

    //Morse istället för Engelska och tvärt om

    //Felhantering i själva mainmetoden

    //Hantera morse och engelska i samma metod

    //Hantera morse och engelska i samma mening



}
