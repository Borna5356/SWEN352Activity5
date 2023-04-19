package test;

import static org.junit.jupiter.api.Assertions.*;

import coffeemaker.Inventory;
import coffeemaker.Recipe;
import coffeemaker.RecipeBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecipeBookTest {

	RecipeBook testRecipeBook;
	
	@BeforeEach
	void setUp() throws Exception {
		testRecipeBook = new RecipeBook(); 
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	// Make sure that initially all recipes are empty
	void testGetRecipes_empty() {
		Recipe[] r = testRecipeBook.getRecipes();
		
		for (int i = 0; i < r.length; ++i) 
		{
			assertNull(r[i]);
		}
	}

	@Test
	/// Add a recipe to the book and check that it was added
	void testAddRecipe() {
		Recipe r = new Recipe();
		r.setName("TestRecipe");
		assertTrue(testRecipeBook.addRecipe(r));
	}
	
	@Test
	void testAddTooManyRecipes()
	{
		boolean added; // Whether a recipe was added successfully
		
		for (int i = 0; i < testRecipeBook.getRecipes().length+1; ++i)
		{
			Recipe testRecipe = new Recipe();
			testRecipe.setName("Test Recipe 0" + i);
			
			added = testRecipeBook.addRecipe(testRecipe);
			if (i > testRecipeBook.getRecipes().length)
			{
				assertFalse(added);
			}
		}
	}

	@Test
	/// Tries to delete a single recipe when there aren't any recipes in the book
	void testDeleteRecipe() {
		String testRecipeName = "Test Recipe 01";
		Recipe testRecipe = new Recipe();
		testRecipe.setName(testRecipeName);
		testRecipeBook.addRecipe(testRecipe);
		assertEquals(testRecipeBook.deleteRecipe(0), testRecipeName);
		
		Recipe[] recipeList = testRecipeBook.getRecipes();
		
		for (int i = 0; i < recipeList.length; ++i)
		{
			if (recipeList[i] != null)
			assertNotEquals(recipeList[i].getName(), testRecipeName);
		}
	}
	
	@Test
	/// Attempts to delete a recipe that doesn't exist
	void testDeleteEmptyRecipe()
	{
		for (int i = 0; i < testRecipeBook.getRecipes().length; ++i)
		{
			assertNull(testRecipeBook.deleteRecipe(i));
		}
	}
	
	@Test
	/// Fills the RecipeBook with recipes, then deletes all of them.
	void testDeleteAllRecipes()
	{
		int numRecipes = testRecipeBook.getRecipes().length;
		Recipe[] recipeList = new Recipe[4];
		
		// Fills up the RecipeBook
		for (int i = 0; i < numRecipes; ++i)
		{
			recipeList[i] = new Recipe();
			recipeList[i].setName("Recipe 0" + i);
			testRecipeBook.addRecipe(recipeList[i]);
		}
		
		// Empties the recipe book
		for (int i = 0; i < numRecipes; ++i)
		{
			testRecipeBook.deleteRecipe(i);
			assertNotEquals(recipeList[i], testRecipeBook.getRecipes()[i]);
		}
	}
	
	@Test
	// Attempts to delete a recipe outside of the allowed range
	void testDeleteOutsideRange()
	{
		try {
		testRecipeBook.deleteRecipe(-1);
		testRecipeBook.deleteRecipe(testRecipeBook.getRecipes().length);
		} catch (IndexOutOfBoundsException ex)
		{
			fail("Threw an index out of bounds exception");
		}
	}
	
	@Test
	// Attempts to edit a recipe outside of the allowed range
	void testEditOutsideRange()
	{
		try {
			testRecipeBook.editRecipe(-1, new Recipe());
			testRecipeBook.editRecipe(testRecipeBook.getRecipes().length, new Recipe());
		} catch (IndexOutOfBoundsException ex)
		{
			fail("Threw an index out of bounds exception");
		}
	}
	
	@Test
	/// Fills the recipe book with recipes, deletes all of them, then tries to add a new one.
	void testRefillRecipeBook()
	{
		// Fill the book with recipes
		for (int i = 0; i < testRecipeBook.getRecipes().length; ++i)
		{ 
			Recipe testRecipe = new Recipe();
			testRecipe.setName("Test Recipe 0" + i);
			
			testRecipeBook.addRecipe(testRecipe);
		}
		
		// Delete all recipes
		for (int i = 0; i < testRecipeBook.getRecipes().length; ++i)
		{
			testRecipeBook.deleteRecipe(i);
		}
		
		// Attempt to add a new recipe
		Recipe testRecipe = new Recipe();
		testRecipe.setName("TestRecipe");
		assertTrue(testRecipeBook.addRecipe(testRecipe));
	}

	@Test
	/// Tries to edit a recipe that doesn't exist
	void testEditEmptyRecipe() {
		assertNull(testRecipeBook.editRecipe(0, new Recipe()));
	}
	
	@Test
	void testEditRecipe() {
		String secondRecipeName = "Second Recipe";
		Recipe firstRecipe = new Recipe(); 
		Recipe secondRecipe = new Recipe();
		Recipe secondRecipeClone = new Recipe();
		firstRecipe.setName("First recipe");
		secondRecipe.setName(secondRecipeName);
		secondRecipeClone.setName(secondRecipeName);
		
		testRecipeBook.addRecipe(firstRecipe);
		testRecipeBook.editRecipe(0, secondRecipe);
		
		assertEquals(testRecipeBook.getRecipes()[0], secondRecipeClone);
	}


	@Test
	void testAddExistingRecipe() {
		Recipe firstRecipe = new Recipe();
		
		testRecipeBook.addRecipe(firstRecipe);
		assertFalse(testRecipeBook.addRecipe(firstRecipe));
	}
}
