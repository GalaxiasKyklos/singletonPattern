package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table4;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 20/10/2016.
 */
public class Table4Test {
    TableOrder table;
    @Before
    public void setUp() {
        table = Table4.getInstance();
    }
    @After
    public void release() {
        Table4.clearOrder();
    }
    @Test
    public void addDrinkTest() {
        table.addDrink(new Drink());
        Assert.assertEquals(1, table.drinks.size(), 0);
    }
    @Test
    public void addDishTest() {
        table.addDish(new Dish());
        Assert.assertEquals(1, table.dishes.size(), 0);
    }
    @Test
    public void clearDrinkTest() {
        table.addDrink(new Drink());
        Assert.assertEquals(1, table.drinks.size(), 0);
        table.clearDrinks();
        Assert.assertEquals(0, table.drinks.size(), 0);
    }
    @Test
    public void clearDishesTest() {
        table.addDish(new Dish());
        Assert.assertEquals(1, table.dishes.size(), 0);
        table.clearDishes();
        Assert.assertEquals(0, table.dishes.size(), 0);
    }
    @Test
    public void printCheckTest() {
        Dish dish = new Dish();
        dish.setPrice((float)  2.0);
        Drink drink =  new Drink();
        drink.setPrice((float) 3.0);
        table.addDrink(drink);
        table.addDish(dish);
        Assert.assertEquals(5.0, table.printCheck(), 0);
    }
}
