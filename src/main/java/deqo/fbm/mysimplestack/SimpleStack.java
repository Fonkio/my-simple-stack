package deqo.fbm.mysimplestack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class SimpleStack implements ISimpleStack {

    private List<Item> stack = new LinkedList<Item>();
    //TEST
    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public int getSize() {
        return this.stack.size();
    }

    @Override
    public void push(Item item) {
        this.stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        if (getSize() == 0) {
            throw new EmptyStackException();
        }
        return stack.get(getSize()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (getSize() == 0) {
            throw new EmptyStackException();
        }
        Item i = this.stack.get(getSize()-1);
        this.stack.remove(getSize()-1);
        return i;
    }
}
