package deqo.fbm.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackTest {

    private SimpleStack simpleStack;

    @Before
    public void setUp() {
        simpleStack = new SimpleStack();
    }

    @Test
    public void testCreateEmptyStack() {
        assertTrue("La pile doit être vide lors de sa création", simpleStack.isEmpty());
        assertEquals("La pile ne doit pas avoir d'élément", 0, simpleStack.getSize());
    }

    @Test
    public void isEmpty() {
        assertTrue(simpleStack.isEmpty());
        simpleStack.push(new Item("test", 8));
        assertFalse(simpleStack.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(new Item("test", 8));
        assertEquals(1, simpleStack.getSize());

    }

    @Test
    public void push() {
        Item it = new Item("test", 8);
        simpleStack.push(it);
        assertFalse("La pile n'est pas vide", simpleStack.isEmpty());
        assertEquals("La pile doit contenir 1 elem", 1, simpleStack.getSize());
        assertSame(it, simpleStack.peek());
    }

    @Test (expected = EmptyStackException.class)
    public void peekEmpty() {
        simpleStack.peek();
    }

    @Test (expected = EmptyStackException.class)
    public void popEmpty() {
        simpleStack.pop();
    }

    @Test
    public void pop() {
        Item it = new Item("test", 8);
        simpleStack.push(it);
        assertSame(it, simpleStack.pop());
        assertEquals("La pile doit être vide", 0, simpleStack.getSize());
        assertTrue(simpleStack.isEmpty());
    }
}