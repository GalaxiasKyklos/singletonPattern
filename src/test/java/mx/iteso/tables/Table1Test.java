package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Saúl on 20/10/2016.
 */
public class Table1Test {
    TableOrder table1;
    @Before
    public void setUp() {
        table1 = Table1.getInstance();
    }
    @After
    public void release() {
        Table1.clearOrder();
    }
    @Test
    public void addDrinkTest() {
        table1.addDrink(new Drink());
        Assert.assertEquals(1, table1.drinks.size(), 0);
    }
    @Test
    public void addDishTest() {
        table1.addDish(new Dish());
        Assert.assertEquals(1, table1.dishes.size(), 0);
    }
    @Test
    public void clearDrinkTest() {
        table1.addDrink(new Drink());
        Assert.assertEquals(1, table1.drinks.size(), 0);
        table1.clearDrinks();
        Assert.assertEquals(0, table1.drinks.size(), 0);
    }
    @Test
    public void clearDishesTest() {
        table1.addDish(new Dish());
        Assert.assertEquals(1, table1.dishes.size(), 0);
        table1.clearDishes();
        Assert.assertEquals(0, table1.dishes.size(), 0);
    }
    @Test
    public void printCheckTest() {
        Dish dish = new Dish();
        dish.setPrice((float)  2.0);
        Drink drink =  new Drink();
        drink.setPrice((float) 3.0);
        table1.addDrink(drink);
        table1.addDish(dish);
        Assert.assertEquals(5.0, table1.printCheck(), 0);
    }
}
