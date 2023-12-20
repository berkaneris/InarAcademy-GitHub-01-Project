package test.java;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeRestrictionValidatorTest {
    private static AgeRestrictionValidator validator;

    @BeforeAll
    static void setup() {
        validator = new AgeRestrictionValidator();
    }

    /**
     *  Test Cases for isEligible Method
     */

    @Test
    public void TC001AgeJustBelowMinimum(){
        assertFalse(validator.isEligible(17));
    }
    @Test
    public void TC002AgeAtMinimumBoundary(){
        assertTrue(validator.isEligible(18));
    }
    @Test
    public void TC003AgeJustAboveMinimum(){
        assertTrue(validator.isEligible(19));
    }
    @Test
    public void TC004AgeJustBelowMaximum(){
        assertTrue(validator.isEligible(64));
    }
    @Test
    public void TC005AgeAtMaximumBoundary(){
        assertTrue(validator.isEligible(65));
    }
    @Test
    public void TC006AgeJustAboveMaximum(){
        assertFalse(validator.isEligible(66));
    }
    @Test
    public void TC007ExtremeLowAge(){
        assertFalse(validator.isEligible(0));
    }
    @Test
    public void TC008ExtremeHighAge(){
        assertFalse(validator.isEligible(100));
    }
}