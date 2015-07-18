package validator;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

public class Assignment1Part1Test {
    private ISBNValidate isbn;

    @Before
    public void setUp() throws Exception {
        isbn = new ISBNValidate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAppendCheckDigitPass(){
        assertEquals("1234567890128", isbn.appendCheckDigitToISBN12("123456789012"));
    };

    @Test(expected = IllegalArgumentException.class)
    public void testAppendShortString(){
        isbn.appendCheckDigitToISBN12("12345678901");
    };

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLongString(){
        isbn.appendCheckDigitToISBN12("1234567890123");
    };

//    This does not produces an error in the code however we believe that non-integers values should
    @Test(expected = IllegalArgumentException.class)
    public void testAppendCharacterInString(){
        isbn.appendCheckDigitToISBN12("12345678901a");
    };

}