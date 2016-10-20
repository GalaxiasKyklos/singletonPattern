package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 20/10/2016.
 */
public class DishTest {
    Dish dish;
    @Before
    public void seUp() {
        dish = new Dish();
        dish.setDescription("I am a dish");
        dish.setName("Dish");
        dish.setPrice((float) 8.0);
        dish.setWaiter("Waiter");
    }
    @Test
    public void getPriceTest() {
        Assert.assertEquals(dish.getPrice(), 8.0, 0);
    }
    @Test
    public void getName() {
        Assert.assertEquals(dish.getName(), "Dish");
    }
    @Test
    public void getDescriptionTest() {
        Assert.assertEquals(dish.getDescription(), "I am a dish");
    }
    @Test
    public void getWaiterTest() {
        Assert.assertEquals(dish.getWaiter(), "Waiter");
    }
}
