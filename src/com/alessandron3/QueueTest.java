package com.alessandron3;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    Queue queue = new Queue();

    @Test
    public void enqueueTest() {
        queue.enqueue("Python");
        queue.enqueue("php");
        queue.enqueue("Java");

        Assert.assertFalse(queue.isEmpty());
    }

    @Test
    public void dequeueTest() {
        queue.enqueue("Python");
        queue.enqueue("php");
        queue.enqueue("Java");

        Assert.assertFalse(queue.isEmpty());

        Assert.assertEquals("Python", queue.dequeue());
        Assert.assertEquals("php", queue.dequeue());
        Assert.assertEquals("Java", queue.dequeue());
    }

    @Test
    public void dequeueEmptyQueue(){

        Assert.assertNull(queue.dequeue());
    }
}
