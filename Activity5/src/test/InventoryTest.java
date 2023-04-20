package test;

import static org.junit.jupiter.api.Assertions.*;

import coffeemaker.Inventory;
import coffeemaker.Recipe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coffeemaker.exceptions.InventoryException;
import coffeemaker.exceptions.RecipeException;

class InventoryTest {
	Inventory inv;
	Recipe r;
	int exp, amt;
	String testNum;

	@BeforeEach
	void setUp() throws Exception {
		inv = new Inventory();
		exp = 15;
		amt = 0;
		testNum = "5";
	}

	@AfterEach
	void tearDown() throws Exception {
		inv = null;
		r = null;
		testNum = null;
	}

	@Test
	void testInventory() {
		assertTrue(inv instanceof Inventory);
	}
	
	@Test
	void testNotInventory() {
		Inventory test = null;
		assertFalse(test instanceof Inventory);
	}

	@Test
	void testGetChocolate() {
		amt = inv.getChocolate();
		assertEquals(amt,exp);
	}

	@Test
	void testSetChocolateSuccess1() {
		exp = 6;
		inv.setChocolate(exp);
		amt = inv.getChocolate();
		assertEquals(amt,exp);
	}
	
	@Test
	void testSetChocolateSuccess2() {
		exp = 0;
		inv.setChocolate(exp);
		amt = inv.getChocolate();
		assertEquals(amt,exp);
	}

	@Test
	void testSetChocolateFail() {
		inv.setChocolate(-1);
		amt = inv.getChocolate();
		assertEquals(amt,exp);
	}

	@Test
	void testAddChocolateSuccess() {
		try {
			inv.addChocolate(testNum);
		} catch (InventoryException e) {
			assertFalse(true);
		}
		amt = inv.getChocolate();
		assertEquals(amt,exp+(Integer.parseInt(testNum)));
	}
	
	@Test
	void testAddChocolateFail1() {
		testNum = "-1";
		try {
			inv.addChocolate(testNum);
		} catch (InventoryException e) {
			;
		}
		amt = inv.getChocolate();
		assertEquals(amt,exp);
	}
	
	@Test
	void testAddChocolateFail2() {
		testNum = "-1";
		boolean failed = false;
		try {
			inv.addChocolate(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}
	
	@Test
	void testAddChocolateFail3() {
		testNum = "two";
		boolean failed = false;
		try {
			inv.addChocolate(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}

	@Test
	void testGetCoffee() {
		amt = inv.getCoffee();
		assertEquals(amt,exp);
	}

	@Test
	void testSetCoffeeSuccess1() {
		exp = 6;
		inv.setCoffee(exp);
		amt = inv.getCoffee();
		assertEquals(amt,exp);
	}

	@Test
	void testSetCoffeeSuccess2() {
		exp = 0;
		inv.setCoffee(exp);
		amt = inv.getCoffee();
		assertEquals(amt,exp);
	}
	
	@Test
	void testSetCoffeeFail() {
		inv.setCoffee(-1);
		amt = inv.getCoffee();
		assertEquals(amt,exp);
	}

	@Test
	void testAddCoffeeSuccess() {
		try {
			inv.addCoffee(testNum);
		} catch (InventoryException e) {
			assertFalse(true);
		}
		amt = inv.getCoffee();
		assertEquals(amt,exp+(Integer.parseInt(testNum)));
	}
	
	@Test
	void testAddCoffeeFail1() {
		testNum = "-1";
		try {
			inv.addCoffee(testNum);
		} catch (InventoryException e) {
			;
		}
		amt = inv.getCoffee();
		assertEquals(amt,exp);
	}
	
	@Test
	void testAddCoffeeFail2() {
		testNum = "-1";
		boolean failed = false;
		try {
			inv.addCoffee(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}
	
	@Test
	void testAddCoffeeFail3() {
		testNum = "two";
		boolean failed = false;
		try {
			inv.addCoffee(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}

	@Test
	void testGetMilk() {
		amt = inv.getMilk();
		assertEquals(amt,exp);
	}

	@Test
	void testSetMilkSuccess1() {
		exp = 6;
		inv.setMilk(exp);
		amt = inv.getMilk();
		assertEquals(amt,exp);
	}

	@Test
	void testSetMilkSuccess2() {
		exp = 0;
		inv.setMilk(exp);
		amt = inv.getMilk();
		assertEquals(amt,exp);
	}
	
	@Test
	void testSetMilkFail() {
		inv.setMilk(-1);
		amt = inv.getMilk();
		assertEquals(amt,exp);
	}

	@Test
	void testAddMilkSuccess() {
		try {
			inv.addMilk(testNum);
		} catch (InventoryException e) {
			assertFalse(true);
		}
		amt = inv.getMilk();
		assertEquals(amt,exp+(Integer.parseInt(testNum)));
	}
	
	@Test
	void testAddMilkFail1() {
		testNum = "-1";
		try {
			inv.addMilk(testNum);
		} catch (InventoryException e) {
			;
		}
		amt = inv.getMilk();
		assertEquals(amt,exp);
	}
	
	@Test
	void testAddMilkFail2() {
		testNum = "-1";
		boolean failed = false;
		try {
			inv.addMilk(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}
	
	@Test
	void testAddMilkFail3() {
		testNum = "two";
		boolean failed = false;
		try {
			inv.addMilk(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}

	@Test
	void testGetSugar() {
		amt = inv.getSugar();
		assertEquals(amt,exp);
	}

	@Test
	void testSetSugarSuccess1() {
		exp = 6;
		inv.setSugar(exp);
		amt = inv.getSugar();
		assertEquals(amt,exp);
	}

	@Test
	void testSetSugarSuccess2() {
		exp = 0;
		inv.setSugar(exp);
		amt = inv.getSugar();
		assertEquals(amt,exp);
	}
	
	@Test
	void testSetSugarFail() {
		inv.setSugar(-1);
		amt = inv.getSugar();
		assertEquals(amt,exp);
	}

	@Test
	void testAddSugarSuccess() {
		try {
			inv.addSugar(testNum);
		} catch (InventoryException e) {
			assertFalse(true);
		}
		amt = inv.getSugar();
		assertEquals(amt,exp+(Integer.parseInt(testNum)));
	}
	
	@Test
	void testAddSugarFail1() {
		testNum = "-1";
		try {
			inv.addSugar(testNum);
		} catch (InventoryException e) {
			;
		}
		amt = inv.getSugar();
		assertEquals(amt,exp);
	}
	
	@Test
	void testAddSugarFail2() {
		testNum = "-1";
		boolean failed = false;
		try {
			inv.addSugar(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}
	
	@Test
	void testAddSugarFail3() {
		testNum = "two";
		boolean failed = false;
		try {
			inv.addSugar(testNum);
		} catch (InventoryException e) {
			failed = true;
		}
		assertTrue(failed);
	}
	
	void setRecipie(String[] myRecipe) {
		r = new Recipe();
		try {
			r.setAmtChocolate(myRecipe[0]);
			r.setAmtCoffee(myRecipe[1]);
			r.setAmtMilk(myRecipe[2]);
			r.setAmtSugar(myRecipe[3]);
		} catch (RecipeException e) {
			;
		}
	}

	@Test
	void testEnoughIngredients() {
		String[] amtGood = {"5", "5", "5", "5"};//we have enough of all the ingredients
		setRecipie(amtGood);
		assertTrue(inv.useIngredients(r));
	}
	
	@Test
	void testNotEnoughChocolate() {
		String[] amtGood = {"20", "5", "5", "5"};//Not Enough Chocolate
		setRecipie(amtGood);
		assertFalse(inv.useIngredients(r));
	}
	
	@Test
	void testNotEnoughCoffee() {
		String[] amtGood = {"5", "20", "5", "5"};//Not Enough Coffee
		setRecipie(amtGood);
		assertFalse(inv.useIngredients(r));
	}
	
	@Test
	void testNotEnoughMilk() {
		String[] amtGood = {testNum, "5", "20", "5"};//Not Enough Milk
		setRecipie(amtGood);
		assertFalse(inv.useIngredients(r));
	}
	
	@Test
	void testNotEnoughSugar() {
		String[] amtGood = {"5", "5", "5", "20"};//Not Enough Sugar
		setRecipie(amtGood);
		assertFalse(inv.useIngredients(r));
	}

	@Test
	void testUseIngredientsSuccess() {
		String[] amtGood = {"5", "5", "5", "5"};//we have enough of all the ingredients
		setRecipie(amtGood);
		assertTrue(inv.useIngredients(r));
	}
	
	@Test
	void testUseIngredientsFail() {
		String[] amtGood = {"20", "20", "20", "20"};//we don't have enough of all the ingredients
		setRecipie(amtGood);
		assertFalse(inv.useIngredients(r));
	}
	/********************************************
	 * Consider separate use ingredients fails, *
	 ********************************************/
	@Test
	void testUseChocolate() {
		String[] amtGood = {testNum, "0", "0", "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getChocolate(),exp-(Integer.parseInt(testNum)));
		}
	}
	
	@Test
	void testUseCoffee() {
		String[] amtGood = {"0", testNum, "0", "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getCoffee(),exp-(Integer.parseInt(testNum)));
		}
	}
	
	@Test
	void testUseMilk() {
		String[] amtGood = {"0", "0", testNum, "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getMilk(),exp-(Integer.parseInt(testNum)));
		}
	}
	
	@Test
	void testUseSugar() {
		String[] amtGood = {"0", "0", "0", testNum};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getSugar(),exp-(Integer.parseInt(testNum)));
		}
	}
	
	@Test
	void testUseOnlyChocolate() {
		String[] amtGood = {testNum, "0", "0", "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getCoffee(),exp);
			assertEquals(inv.getMilk(),exp);
			assertEquals(inv.getSugar(),exp);
		}
	}
	
	@Test
	void testUseOnlyCoffee() {
		String[] amtGood = {"0", testNum, "0", "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getChocolate(),exp);
			assertEquals(inv.getMilk(),exp);
			assertEquals(inv.getSugar(),exp);
		}
	}
	
	@Test
	void testUseOnlyMilk() {
		String[] amtGood = {"0", "0", testNum, "0"};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getChocolate(),exp);
			assertEquals(inv.getCoffee(),exp);
			assertEquals(inv.getSugar(),exp);
		}
	}
	
	@Test
	void testUseOnlySugar() {
		String[] amtGood = {"0", "0", "0", testNum};//set recipe
		setRecipie(amtGood);
		if (inv.useIngredients(r)) {
			assertEquals(inv.getChocolate(),exp);
			assertEquals(inv.getCoffee(),exp);
			assertEquals(inv.getMilk(),exp);
		}
	}

	@Test
	void testToString() {
		String check = inv.toString();
		String expected = String.format("Coffee: %d\nMilk: %d\nSugar: %d\nChocolate: %d\n",
				exp, exp, exp, exp);
		assertEquals(check, expected);
	}

}
