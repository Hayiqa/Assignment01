package ass01;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void test1()
	{
		//Logical error that we can insert at any position but it only shows half array
		Array array = new Array();
		Array.insert(11,2);
		Array.insert(5,3);
		Array.insert(1,4);
		Array.insert(2,5);
		
		System.out.println("TEST1: Displaying Array for test case 1");
		Array.display();
	}
	
	@Test
	void test2()
	{
		//Simple test function for inserting values in array
		Array array = new Array();
		Array.insert(0,0);
		Array.insert(1,1);
		Array.insert(2,2);
		Array.insert(3,3);
		
		System.out.println("TEST2: Displaying simple array by testing insert function");
		Array.display();
	}
	
	@Test 
	void test3()
	{
		//Simple test function to check if index is smaller than zero
		Array array = new Array();
		
			Array.insert(0,0);
			Array.insert(1,1);
			Array.insert(2,2);
			Array.insert(3,3);
			Array.insert(3,-1);
			
           System.out.println("NullPointerException");
	
	}
	
	@Test
	void test4()
	{
		//Test function to check if index is greater than the size defined
		Array array = new Array();
		Array.insert(0,0);
		Array.insert(1,1);
		Array.insert(2,2);
		Array.insert(3,3);
		Array.insert(3,101);
     	System.out.println("NullPointerException");
		
	}
	
	@Test
	void test5()
	{
		//Test function to delete a value from array
		Array array = new Array();
		Array.insert(23,0);
		Array.insert(33,1);
		Array.insert(10,2);
		Array.insert(15,3);
		
		Array.delete(2);
        assertFalse(Array.linearSearch(2));
	}
    
	@Test
	void test6()
	{
		//Test function to delete a value from array
		Array array = new Array();
		Array.insert(23,0);
		Array.insert(33,1);
		Array.insert(10,2);
		Array.insert(15,3);
		
		Array.delete(5); //index 5 not present but still deleting value of index 2
		System.out.println("Test5: Displaying array and checking if nothing is deleted when index 5 is entered");
		Array.display();
	}
	
	@Test
	void test7()
	{
		
		//When one indexed is skiped and then searched the value is not searched and results in false
		Array array = new Array(); //create an array.
		assertNotNull(array);
		Array.insert(10,0);
		Array.insert(17,2);
		
		assertTrue(Array.linearSearch(17));
	}
	
	@Test
	void test8()
	{
		//Without skipping the index the value is searched so now it returns true.
		Array array = new Array(); //create an array.
		Array.insert(10,0);
		Array.insert(17,1);
		assertTrue(Array.linearSearch(17));
	
	}
	
	@Test
	void test9()
	{
		//Length of Array.array does not match the length of declared array
		Array array = new Array();
		Array.insert(23,0);
		Array.insert(33,1);
		Array.insert(10,2);
		Array.insert(15,3);
		Array.bubbleSort();
		
		int[] arr = {10,15,23,33};
		assertArrayEquals(Array.array,arr);
	}
	
	@Test
	void test10()
	{
		Array array = new Array();
		Array.insert(23,0);
		Array.insert(33,1);
		Array.insert(10,2);
		Array.insert(15,3);
		assertTrue(Array.binarySearch(10, 0, array.size));
	}	
	
	@Test
	void test11()
	{
		//Duplicates are present in array and binary search is done
		Array array = new Array();
		Array.insert(1,0);
		Array.insert(2,1);
		Array.insert(3,2);
		Array.insert(2,3);
		Array.insert(7,4);
		assertTrue(Array.binarySearch(2, 0, 5));
	}
	
	@Test
	void test12()
	{
		Array array = new Array();
		Array.insert(1,0);
		Array.insert(2,1);
		Array.insert(3,2);
		Array.insert(2,3);
		Array.insert(7,4);
		assertFalse(Array.binarySearch(2, 5, 0));
	}
	
	@Test
	void test13()
	{
		Array array = new Array();
		Array.insert(-1,0);
		Array.insert(2,1);
		Array.insert(3,2);
		Array.insert(2,3);
		Array.insert(6,4);
		assertTrue(Array.binarySearch(-1, 0, 5));
	}
	
	@Test
	void test14()
	{
		Array array = new Array();
		Array.insert(1,0);
		Array.insert(2,1);
		Array.insert(3,2);
		
		for(int i = 0; i < 3; i++)
		{
		    if(Array.array[i] == 2)
		    {
		       assertEquals(2,Array.array[i]);
		    }
		    else 
		    {
		    	assertNotEquals(2,Array.array[i]);
		    }
		}
	
	}
	
	@Test
	void test15()
	{
			Array array = new Array();
			Array.insert(-2,0);
			
			Array.insert(-3,1);
			Array.insert(0,2);
			Array.insert(-3,3);
			Array.bubbleSort();
			
			int[] arr = {-3,-3,-2,0};
			Array.bubbleSort();
			
			boolean temp = false;
			for(int i = 0; i < array.size; i++)
			{
				if(arr[i] == Array.array[i])
				{
					temp = true;
				}
			}
			assertTrue(temp);
	}
	
	@Test
	void test16()
	{
			Array array = new Array();
			Array.display();
	}
	
	@Test
	void test17()
	{
			Array array = new Array();
			array.bubbleSort();
	}
	@Test
	void test18()
	{
			Array array = new Array();
			array.delete(2);
	}
	
	
	
}
