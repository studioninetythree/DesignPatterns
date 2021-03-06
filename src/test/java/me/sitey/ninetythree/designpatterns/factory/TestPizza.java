package me.sitey.ninetythree.designpatterns.factory;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Dillan on 3/3/2015.
 */
public class TestPizza extends TestCase implements TestMeal
{
    private final String name = "Triple Decker Pizza";
    private final double price = 56.89;

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
