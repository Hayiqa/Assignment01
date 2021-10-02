

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {

	private static final Integer NULL = null;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1()
	{
		//Simple implementation testing of push function
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Test1: Displaying Stack");
		stack.display();
	}
	
	@Test
	void test2()
	{
		//Simple implementation testing of pop function
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.pop();
		stack.pop();
	}
	
	@Test
	void test3()
	{
		//Using pop function even when the stacks gets empty
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
	
	@Test
	void test4()
	{
		//testing top function
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.top();
	}
	
	@Test
	void test5()
	{
		//Testing if the top functions returns null when stack is empty.
		Stack stack = new Stack(); //create new stack.
		
		stack.top();
	}
	
	@Test
	void test6()
	{
		////Testing if the pop functions returns null when stack is empty.
		Stack stack = new Stack(); //create new stack.
		
		stack.pop();
	}
	
	@Test
	void test7()
	{
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.pop();
		
		stack.push(6);
		stack.push(7);
		
		stack.top();
		stack.pop();
		stack.pop();
		
		
	}
	
	@Test
	void test8()
	{
		//Searching for the next value.
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		assertEquals(2,Stack.head.next.next.key);
		
	}
	
	@Test
	void test9()
	{
		//Searching for the next value.
		Stack stack = new Stack(); //create new stack.
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		assertEquals(2,Stack.head.next.next.key);
		assertNotEquals(3,Stack.head.next.next.next.key);
		
	}
	
	@Test
	void test10()
	{
		//Accessing the next of node 3.
		Stack stack = new Stack(); //create new stack.
		try {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(NULL,Stack.head.next.next.next.key);
		}
		catch (Exception st)
		{
			System.out.println("Null pointer Exception");
		}
			
	}
	
	@Test
	void test11()
	{
		//Comparing values
		Stack stack = new Stack(); //create new stack.
		
		stack.push(1);
		stack.push(2);
		
		assertEquals(2,stack.top());
		
	}
	
	@Test
	void test12()
	{
		//Checking Size
		Stack stack = new Stack(); //create new stack.
		
		stack.push(1);
		
		assertEquals(1,stack.getSize());	
	}
	
	@Test
	void test13()
	{
		Stack stack = new Stack(); //create new stack.
		
		stack.push(1);
		stack.push(2);
		stack.push(2);
		
		stack.size = 3;
		assertEquals(3,stack.getSize());
		
	}
	
	@Test
	void test14() 
	{
		Stack stack = new Stack();
		boolean temp = false;
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		for(int i = 0; i < stack.size; i++)
		{
			if(stack.head.next.key == 2)
			{
				temp = true;
			}
			stack.pop();
		}
		assertTrue(temp);
	}


	
	
	

}
