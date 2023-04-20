package test;

import static org.junit.jupiter.api.Assertions.*;

import coffeemaker.Recipe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeemaker.exceptions.InventoryException;
import coffeemaker.exceptions.RecipeException;

public class RecipeTest {
    Recipe recipe;

    @BeforeEach
    public void setUp() {
        recipe = new Recipe();
    }

    @Test
    public void testGetAmtChocolate() {
        //setup
        int expected = 0;

        //invoke
        int actual = recipe.getAmtChocolate();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmtChocolateSuccess() {
        //setup
        String chocolate = "5";
        int expected = 5;

        //invoke
        try {
            recipe.setAmtChocolate(chocolate);
        } catch(RecipeException e) {

        }
        int actual = recipe.getAmtChocolate();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmtChocolateNumberFormatException() {
        //setup
        String chocolate = "test";

        //invoke
        try {
            recipe.setAmtChocolate(chocolate);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetAmtChocolateLessThan0() {
        //setup
        String chocolate = "-1";

        //invoke
        try {
            recipe.setAmtChocolate(chocolate);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetAmtChocolate0() {
        //setup
        try {
            recipe.setAmtChocolate("4");
        } catch(RecipeException e) {

        }
        String chocolate = "0";
        int expected = 0;

        //invoke
        try {
            recipe.setAmtChocolate(chocolate);
        } catch(RecipeException e) {
        }
        // analyze
        int actual = recipe.getAmtChocolate();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAmtCoffee() {
        //setup
        int expected = 0;

        //invoke
        int actual = recipe.getAmtCoffee();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmtCoffeeSuccess() {
        //setup
        String coffee = "5";
        int expected = 5;

        //invoke
        try {
            recipe.setAmtCoffee(coffee);
        } catch(RecipeException e) {

        }
        //analyze
        int actual = recipe.getAmtCoffee();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAmtCoffeeNumberFormatException() {
        //setup
        String coffee = "test";

        //invoke
        try {
            recipe.setAmtCoffee(coffee);
            //analyze
            fail();
        } catch (RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetAmtCoffeeLessThan0() {
        //setup
        String coffee = "-1";

        //invoke
        try {
            recipe.setAmtCoffee(coffee);
            //analyze
            fail();
        } catch (RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetAmtCoffee0() {
        //setup
        try {
            recipe.setAmtCoffee("4");
        } catch(RecipeException e) {

        }
        String chocolate = "0";
        int expected = 0;

        //invoke
        try {
            recipe.setAmtCoffee(chocolate);
        } catch(RecipeException e) {
        }
        // analyze
        int actual = recipe.getAmtCoffee();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMilk() {
        //setup
        int expected = 0;

        //invoke
        int actual = recipe.getAmtMilk();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetMilkSuccess() {
        //setup
        String milk = "1";
        int expected = 1;

        //invoke
        try {
            recipe.setAmtMilk(milk);
        }catch(RecipeException e) {

        }
        int actual = recipe.getAmtMilk();
        //analyze
        assertEquals(expected, actual);

    }

    @Test
    public void testSetMilkNumberFormatException() {
        //setup
        String milk = "test";

        //invoke
        try {
            recipe.setAmtMilk(milk);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetMilkLessThan0() {
        //setup
        String milk = "-1";

        //invoke
        try {
            recipe.setAmtMilk(milk);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGetSugar() {
        //setup
        int expected = 0;

        //invoke
        int actual = recipe.getAmtSugar();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSugarSuccess() {
        //setup
        String sugar = "3";
        int expected = 3;

        //invoke
        try {
            recipe.setAmtSugar(sugar);
        } catch(RecipeException e) {

        }
        int actual = recipe.getAmtSugar();
        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetSugarNumberFormatException() {
        //setup
        String sugar = "test";

        //invoke
        try {
            recipe.setAmtSugar(sugar);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetSugarLessThan0() {
        //setup
        String sugar = "-1";

        //invoke
        try {
            recipe.setAmtSugar(sugar);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testGetName() {
        //setup
        String expected = "";

        //invoke
        String actual = recipe.getName();

        //analyze
        assertEquals(expected, actual);
    }
    @Test
    public void setNameSuccess() {
        //setup
        String name = "Test";

        //invoke
        recipe.setName(name);
        String actual = recipe.getName();

        //analyze
        assertEquals(name, actual);
    }

    @Test
    public void testGetPrice() {
        //setup
        int expected = 0;

        //invoke
        int actual = recipe.getPrice();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPriceSuccess() {
        //setup
        String price = "5";
        int expected = 5;

        //invoke
        try {
            recipe.setPrice(price);
        } catch(RecipeException e) {

        }
        int actual = recipe.getPrice();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testSetPriceNumberFormatException() {
        //setup
        String price = "test";

        //invoke
        try {
            recipe.setPrice(price);
            //analyze
            fail();
        } catch(RecipeException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testSetPriceLessThan0() {
        //setup
        String price = "-1";

        //invoke
        try {
            recipe.setPrice(price);
            //analyze
            fail();
        } catch(RecipeException e) {}
    }

    @Test
    public void testToString() {
        //setup
        String name = "test";
        recipe.setName(name);

        //invoke
        String actual = recipe.toString();

        //analyze
        assertEquals(name, actual);
    }

    @Test
    public void testHashCodeNotNull() {
        //setup
        String name = "test";
        recipe.setName(name);
        int expected = name.hashCode() + 31;

        //invoke
        int actual = recipe.hashCode();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeNull() {
        //setup
        recipe.setName(null);
        int expected = 31;

        //invoke
        int actual = recipe.hashCode();

        //analyze
        assertEquals(expected, actual);
    }

    @Test
    public void testEqualsSameObject() {
        //invoke
        boolean result = recipe.equals(recipe);

        //analyze
        assertTrue(result);
    }

    @Test
    public void testEqualsNull() {
        //invoke
        boolean result = recipe.equals(null);

        //analyze
        assertFalse(result);
    }

    @Test
    public void testEqualsObjectIsRecipe() {
        //setup
        Recipe recipe2 = new Recipe();
        //invoke
        boolean result = recipe.equals(recipe2);

        //analyze
        assertTrue(result);
    }

    @Test
    public void testEqualsObjNotRecipe() {
        //setup
        String str = "test";
        //invoke
        boolean result = recipe.equals(str);

        //analyze
        assertFalse(result);
    }

    @Test
    public void testEqualsNameIsNull() {
        //setup
        recipe.setName(null);
        Recipe recipe2 = new Recipe();
        recipe2.setName("test");
        //invoke
        boolean result = recipe.equals(recipe2);

        //analyze
        assertFalse(result);
    }

    @Test
    public void testEqualsOtherNameIsNotNull() {
        //setup
        recipe.setName("test");
        Recipe recipe2 = new Recipe();
        recipe2.setName(null);
        //invoke
        boolean result = recipe.equals(recipe2);

        //analyze
        assertFalse(result);
    }

    @Test
    public void testEqualsBothNameIsNull() {
        //setup
        Recipe recipe2 = new Recipe();
        recipe.setName(null);
        recipe2.setName(null);

        //invoke
        boolean result = recipe.equals(recipe2);

        //analyze
        assertTrue(result);
    }

    @Test
    public void testEqualsNamesEqual() {
        //setup
        recipe.setName("test");
        Recipe recipe2 = new Recipe();
        recipe2.setName("test");
        //invoke
        boolean result = recipe.equals(recipe2);

        //analyze
        assertTrue(result);
    }
}
