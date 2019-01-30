package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	public void testFound() {
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));


		assertTrue(new App().search(array1,array2,3,3));
	}

	public void testNotFound() {
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));


		assertFalse(new App().search(array1,array2,2,3));
	}

	public void testEmptyArray() {
		ArrayList<Integer> array1 = new ArrayList<>();
		ArrayList<Integer> array2 = new ArrayList<>();
		assertFalse(new App().search(array1,array2,3,3));
	}
	
	public void testOutOfBounds() {
		ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		assertFalse(new App().search(array1,array2,100,100));
	}
	
	public void testNull() {
		assertFalse(new App().search(null,null,3,3));
	}

}
