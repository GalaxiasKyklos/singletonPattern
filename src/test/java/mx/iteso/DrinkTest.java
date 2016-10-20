package mx.iteso;

import mx.iteso.singleton.Drink;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 20/10/2016.
 */
public class DrinkTest {
    Drink dish;
    @Before
    public void seUp() {
        dish = new Drink();
        dish.setDescription("I am a drink");
        dish.setName("drink");
        dish.setPrice((float) 8.0);
        dish.setWaiter("Waiter");
    }
    @Test
    public void getPriceTest() {
        Assert.assertEquals(dish.getPrice(), 8.0, 0);
    }
    @Test
    public void getName() {
        Assert.assertEquals(dish.getName(), "drink");
    }
    @Test
    public void getDescriptionTest() {
        Assert.assertEquals(dish.getDescription(), "I am a drink");
    }
    @Test
    public void getWaiterTest() {
        Assert.assertEquals(dish.getWaiter(), "Waiter");
    }
}
