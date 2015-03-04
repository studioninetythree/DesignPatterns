package me.sitey.ninetythree.designpatterns.factory;

import junit.framework.TestCase;

/**
 * Created by Dillan on 3/3/2015.
 */

// Implements Factory Pattern Methodology
public class Kitchen extends TestCase
{
    TestMeal meal = null;
    private String request = null;

    public TestMeal getMealInstanceOf(String mealType) throws Exception
    {
        if (mealType.equals("1"))
        {
            return new TestTwister();
        }
        else if (mealType.equals("2"))
        {
            return new TestPizza();
        }
        else
        {
            return new TestBurger();
        }
    }
}
