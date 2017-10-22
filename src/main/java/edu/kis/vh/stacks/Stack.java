package edu.kis.vh.stacks;

public class Stack {

	private static final int full_stack = 11;

	private static final int empty_stack = -1;

	private static final int list_size = 12;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	private int[] ITEMS = new int[list_size];

	public int total = 1;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == empty_stack;
	}

	public boolean isFull() {
		return total == full_stack;
	}

	public int top() {
		if (isEmpty())
			return empty_stack;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return empty_stack;
		return ITEMS[total--];
	}
	// comment
}
