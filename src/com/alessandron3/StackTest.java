package com.alessandron3;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    Stack stack = new Stack();


    @Test
    public void pushTest() {
        stack.push("Java");
        stack.push("Kotlin");

        Assert.assertTrue(stack.size() > 0);
    }

    @Test
    public void popTest() {
        stack.push("Java");
        stack.push("Kotlin");
        stack.push("Python");
        stack.push("Php");

        Assert.assertEquals("Php", stack.pop());
        Assert.assertEquals("Python", stack.pop());
        Assert.assertEquals("Kotlin", stack.pop());
        Assert.assertEquals("Java", stack.pop());
    }

    @Test
    public void popEmptyTest() {

        Assert.assertNull(stack.pop());
    }
}
