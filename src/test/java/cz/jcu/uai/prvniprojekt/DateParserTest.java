/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.jcu.uai.prvniprojekt;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class DateParserTest {

    /**
     * Test of parse method, of class DateParser.
     */
    @Test
    public void testParse() {
        DateParser dp = new DateParser();

        Date parsedDate = dp.parse("21. 6. 2018");
        System.out.println(parsedDate);

        assertNotNull(parsedDate);

        Calendar c = Calendar.getInstance();
        c.setTime(parsedDate);

        assertEquals(21, c.get(Calendar.DAY_OF_MONTH));
        assertEquals(5, c.get(Calendar.MONTH)); //month je cislovany od 0 (Leden = 0)
        assertEquals(2018, c.get(Calendar.YEAR));

        try {
            dp.parse("XXX");
            fail("Failture");
        } catch (DateFormatException e) {
            // Expected
        }

    }
}
