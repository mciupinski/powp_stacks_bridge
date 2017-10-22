package edu.kis.vh.stacks;

public class Stack {

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static final int _1 = 1;

	private int[] ITEMS = new int[12];

	public int total = -_1;

	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}

	public boolean isEmpty() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	public int top() {
		if (isEmpty())
			return -1;
		return ITEMS[total];
	}

	public int pop() {
		if (isEmpty())
			return -1;
		return ITEMS[total--];
	}
	// comment
}
