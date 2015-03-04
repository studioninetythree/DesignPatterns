package me.sitey.ninetythree.designpatterns.factory;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

/**
 * Created by Dillan on 3/3/2015.
 */
public class TestTwister extends TestCase implements TestMeal
{
    private String name = "Sweet Chilli Tister";
    private double price = 23.69;

    public static junit.framework.Test suite() throws Exception
    {
        return new TestSuite(TestTwister.class);
    }

    public void testTestTwister()
    {
        assertTrue(true);
    }

    public void setUp() throws Exception
    {
        assertNotNull(name);
        assertEquals(23.69, price);
    }

    @Test
    @Override
    public String testGetName() throws Exception
    {
        return name;
    }

    @Test
    @Override
    public double testGetPrice() throws Exception
    {
        return 23.69;
    }

    @Test
    @Override
    public String testToString() throws Exception
    {
        return "Here's your order:\n" + "Meal: " + name + "\n" + "Price: R" + price;
    }
}
