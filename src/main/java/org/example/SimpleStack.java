package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {

    private int taille;

    private int Item;
    private ArrayList<Item> listeItem;

    public SimpleStack() {
        taille = 0;
        listeItem = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        if (taille == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return taille;
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        listeItem.add(item);
        taille++;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return listeItem.get(taille-1);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (taille == 0) {
            throw new EmptyStackException();
        }
        taille--;
        return listeItem.get(taille);
    }
}
