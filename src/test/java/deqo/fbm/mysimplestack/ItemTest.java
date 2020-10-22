package deqo.fbm.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    private Item item;

    @Before
    public void setUp() {
        this.item = new Item("test", 0);
    }

    @Test
    public void setAmount() {
        item.setAmount(5);
        assertEquals(5, item.getAmount());
    }

    @Test
    public void setValue() {
        item.setValue("coucou");
        assertEquals("coucou", item.getValue());
    }

    @Test
    public void getValue() {
        assertEquals("test", item.getValue());
    }

    @Test
    public void getAmount() {
        assertEquals(0, item.getAmount());
    }
}