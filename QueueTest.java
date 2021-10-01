package ass01;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
    
	@Test
	void test1() 
	{
		//using simple testing of enqueue function 
		Queue queue = new Queue();
		queue.enqueue(0);
		queue.enqueue(2);
		queue.enqueue(3);
		
		System.out.println("Test1: Displaying Queue ");
		queue.display();
		
	}
	
	@Test
	void test2() 
	{
		//using simple testing of dequeue function 
		Queue queue = new Queue();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();

		
	}
	
	@Test
	void test3() 
	{
		//Testing for exception error
		Queue queue = new Queue();
		queue.enqueue(0);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		
		
		System.out.println("Test3: Displaying Queue ");
		queue.display();
		
	}
	
	@Test
	void test4() 
	{
		//checking for nul exception
		Queue queue = new Queue();
		
		try {
			queue.enqueue(0);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.display();
			assertNull(Queue.head.next.next.next.key);
		}
		catch (Exception st)
		{
			System.out.println("Null pointer exception ");
		}
		
		
	}
	
	@Test
	void test5() 
	{
		
		//checking size
		Queue queue = new Queue();
		queue.enqueue(0);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		
		queue.dequeue();
		assertEquals(2,Queue.size);

	}
	
	@Test
	void test6() 
	{
		//passing negative values 
		Queue queue = new Queue();
		queue.enqueue(-1);
		queue.enqueue(-2);
		queue.enqueue(-3);
		
		
	}
	
	@Test
	void test7() 
	{
		//chceking if it throws exception
		Queue queue = new Queue();
		queue.dequeue();
		
	}
	
	@Test
	void test8() 
	{
		//comparing values
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		
		assertEquals(1,queue.dequeue());
	}
	
	@Test
	void test9() 
	{
		//comparing values
		Queue queue = new Queue();

       for(int i = 0; i < 100; i++)
       {
    	   queue.enqueue(i);
       }
       
       Queue.Node in = queue.head;
       for(int i = 0; i < 100; i++)
       {
    	   assertEquals(i,in.key);
    	   in = in.next;
       }
		
	}
	
	@Test
	void test10() 
	{
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		int count = 0;
		for(int i = 0; i <= queue.size; i++)
		{
			queue.dequeue();
			count++;
			
		}
		assertEquals(3,count);
	}
	
	@Test
	void test11() 
	{
		Queue queue = new Queue();
		assertEquals(0,queue.size);
	}
	
	@Test
	void test12() 
	{
		Queue queue = new Queue();
		boolean temp = false;
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		for(int i = 0; i < queue.size; i++)
		{
			if(queue.head.next.key == 2)
			{
				temp = true;
			}
			queue.dequeue();
		}
		assertTrue(temp);
	}
	
	@Test
	void test13() 
	{
		Queue queue = new Queue();
		assertEquals(-1,queue.dequeue());
		queue.enqueue(2);
		assertEquals(2,queue.dequeue());
	}
	
	@Test
	void test14() 
	{
		//Testing bigger values
		Queue queue = new Queue();
		queue.enqueue(10000);
		queue.enqueue(10003);
		queue.enqueue(10003);
		
	}
	
	

}
