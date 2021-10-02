

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test1()
	{
		//Simple testing of push front function
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(-1);
		list.pushFront(4);
		
	}
	
	@Test
	void test2()
	{
		LinkedList list = new LinkedList();
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(1);
		list.pushFront(4);
		
		list.pushBack(-1);
		list.pushBack(-2);
		
	}
	
	@Test
	void test3()
	{
		//Simple testing of pushBack function
		LinkedList list = new LinkedList();
		
		list.pushBack(11);
		list.pushBack(16);
		list.pushBack(0);
		
		System.out.print("Test3: Displaying linked List");
		list.display();
		
	}
	
	@Test
	void test4()
	{
		LinkedList list = new LinkedList();
		
		list.pushBack(11);
		list.pushBack(16);
		list.pushBack(0);
		
		list.popFront();
		
		System.out.print("Test3: Displaying linked List");
		list.display();
		
	}
	
	@Test
	void test5()
	{
		//Checking if Null pointer exception occurs
		LinkedList list = new LinkedList();	
		list.popFront();
		
	}
	
	@Test
	void test6()
	{
		//checking size
		LinkedList list = new LinkedList();	
		
		list.pushBack(0);
		list.pushBack(5); 
		list.pushBack(6); 
		
		list.pushFront(1); 
		assertEquals(4, list.size); 	
	}
	
	@Test
	void test7()
	{
		LinkedList list = new LinkedList();	
		
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		list.popBack();
		list.popBack();
	}
	
	@Test
	void test8()
	{
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		list.pop(3);	
	}
	
	
	@Test
	void test9()
	{
		//checking if an exception occurs
		LinkedList list = new LinkedList();			
		list.pop(3);	
	}
	
	@Test
	void test10() 
	{
		//Exception test
		LinkedList list = new LinkedList();	
		 
		try {
			 LinkedList.pop(LinkedList.head.next.next.key);	
		}
		catch (Exception st)
		{
			System.out.print("Null pointer exception");
		}
	   
	}
	
	@Test
	void test11() 
	{
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		int count = 0;
		for(int i = 0; i <= list.size; i++)
		{
			LinkedList.pop(i);
			count++;
			
		}
		assertEquals(3,count);
	}
	
	@Test
	void test12() 
	{
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		list.pushFront(3);
		list.pushFront(4);
		
		assertEquals(4,list.size);
	}
	
	@Test
	void test13() 
	{
		LinkedList list = new LinkedList();	
		assertEquals(0,list.size);
	}
	
	@Test
	void test14() 
	{
		LinkedList list = new LinkedList();	
	    list.display();
	}
	
	@Test
	void test15() 
	{
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		list.pushFront(2);
		
	    list.pop(0);
	}
	
	@Test
	void test16() 
	{
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		
	    list.pop(1);
	}
	
	@Test
	void test17() 
	{
		LinkedList list = new LinkedList();			
	    list.popBack();
	}
	
	@Test
	void test18() 
	{
		//Exception Tes
		LinkedList list = new LinkedList();	
		list.pushFront(1);
		
		list.popBack();
		list.popBack();
	}
	
	@Test
	void test19() 
	{
		LinkedList list = new LinkedList();	
		boolean temp = false;
		list.pushFront(1);
		list.pushFront(23);
		list.pushFront(11);
		list.pushFront(14);
		
		for(int i = 0; i < list.size; i++)
		{
			if(list.head.next.key == 23)
			{
				temp = true;
			}
			LinkedList.popFront();
		}
		assertTrue(temp);
		
	
	}
	
	
	

}