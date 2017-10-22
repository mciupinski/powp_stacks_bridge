package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.Stack;

public class StackTest {
	
	private static final int test_value = 4;

	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		stackObj.push(test_value);
		
		int result = stackObj.top();
		Assert.assertEquals(test_value, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		Stack stackObj = new Stack();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.top();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int test_value = 4;
		stackObj.push(test_value);
		
		result = stackObj.top();
		Assert.assertEquals(test_value, result);
		result = stackObj.top();
		Assert.assertEquals(test_value, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		final int EMPTY_STACK_VALUE = -1;
		
		int result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
		
		int test_value = 4;
		stackObj.push(test_value);
		
		result = stackObj.pop();
		Assert.assertEquals(test_value, result);
		result = stackObj.pop();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

}
