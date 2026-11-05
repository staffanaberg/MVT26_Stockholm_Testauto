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


}
