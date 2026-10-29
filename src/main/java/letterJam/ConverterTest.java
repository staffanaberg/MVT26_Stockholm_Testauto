package letterJam;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ConverterTest {

    @Test
    public void testConvert1toA() {
        Converter converter = new Converter();
        int number = 1;
        String actual = converter.getLetter(number);
        String expected = "A";
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert3toC() {
        Converter converter = new Converter();
        int number = 3;
        String actual = converter.getLetter(number);
        String expected = "C";
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert7toG() {
        Converter converter = new Converter();
        int number = 7;
        String actual = converter.getLetter(number);
        String expected = "G";
        assertEquals(expected, actual);
    }
}
