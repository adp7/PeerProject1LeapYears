package test;
import com.company.Main;
import com.company.LeapClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {

    @Test
    public void checkYearIsLeapYearWhenDivisibleByFour() {
        LeapClass obj = new LeapClass();
        assertTrue(obj.isLeapYear(1920));
    }

    @Test
    public void checkYearIsLeapYearWhenDivisibleByHundred() {
        LeapClass obj = new LeapClass();
        assertFalse(obj.isLeapYear(1700));
    }

    @Test
    public void checkYearIsLeapYearWhenDivisibleByFourHundred() {
        LeapClass obj = new LeapClass();
        assertTrue(obj.isLeapYear(2000));
    }

    @Test
    public void checkYearIsLeapYearWhenNotDivisibleByFour() {
        LeapClass obj = new LeapClass();
        assertFalse(obj.isLeapYear(2017));
    }
}
