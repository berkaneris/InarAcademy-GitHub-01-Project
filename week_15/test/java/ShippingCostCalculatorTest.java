package test.java;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCostCalculatorTest {
    private static ShippingCostCalculator calculator;
    @BeforeAll
    static void setup(){
        calculator = new ShippingCostCalculator();
    }

    /**
     * Test Cases for calculateCost Method with different parameters combinations
     */
    @Test
    public void TC001LocalDestWithStandardDeliveryCost(){
        double weight = 10;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Standard");
        assertEquals(10 , ActualCost);
    }
    @Test
    public void TC002LocalDestWithExpressDeliveryCost(){
        double weight = 10;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Express");
        assertEquals(25 , ActualCost);
    }
    @Test
    public void TC003InternationalDestWithStandardDeliveryCost(){
        double weight = 10;
        double ActualCost = calculator.calculateCost(weight, "International" , "Standard");
        assertEquals(50 , ActualCost);
    }
    @Test
    public void TC004InternationalDestWithExpressDeliveryCost(){
        double weight = 10;
        double ActualCost = calculator.calculateCost(weight, "International" , "Express");
        assertEquals(125 , ActualCost);
    }
    @Test
    public void TC005ZeroWeightLocalStandardDelivery(){
        double weight = 0;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Standard");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC006ZeroWeightLocalExpressDelivery(){
        double weight = 0;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Express");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC007ZeroWeightInternationalStandardDelivery(){
        double weight = 0;
        double ActualCost = calculator.calculateCost(weight, "International" , "Standard");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC008ZeroWeightInternationalExpressDelivery(){
        double weight = 0;
        double ActualCost = calculator.calculateCost(weight, "International" , "Express");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC009NegativeWeightLocalStandardDelivery(){
        double weight = -10;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Standard");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC010NegativeWeightLocalExpressDelivery(){
        double weight = -10;
        double ActualCost = calculator.calculateCost(weight, "Local" , "Express");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC011NegativeWeightInternationalStandardDelivery(){
        double weight = -10;
        double ActualCost = calculator.calculateCost(weight, "International" , "Standard");
        assertEquals(0 , ActualCost);
    }
    @Test
    public void TC012NegativeWeightInternationalExpressDelivery(){
        double weight = -10;
        double ActualCost = calculator.calculateCost(weight, "International" , "Express");
        assertEquals(0 , ActualCost);
    }
}