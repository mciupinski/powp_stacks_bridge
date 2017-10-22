package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

public static final int _0 = 0;
int totalRejected = _0;

	public int reportRejected() {
	return totalRejected;
	}

	public void push(int in) {
	if (!isEmpty() && in > top())
		totalRejected++;
		else
			super.push(in);
	}
}
