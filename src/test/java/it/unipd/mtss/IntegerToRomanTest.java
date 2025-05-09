////////////////////////////////////////////////////////////////////
// [nome] [cognome] [matricola]
// [nome] [cognome] [matricola]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));

    }
}
