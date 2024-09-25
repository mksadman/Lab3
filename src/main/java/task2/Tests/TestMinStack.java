package task2.Tests;

import task2.main.MinStack;
import org.junit.*;
import static org.junit.Assert.*;

public class TestMinStack {
    public void testMinStack(){
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);
        assertEquals(1, minStack.getMin());
        minStack.pop();
        assertEquals(2, minStack.getMin());
        minStack.pop();
        assertEquals(3, minStack.getMin());
    }
}
