package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList <E>elements;

    public Stack()
    {
        elements = new ArrayList();
    }

    public void push(E e)
    {
        elements.add(e);
    }


    public E pop()
    {
        E e = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return e;
    }

    public boolean isEmpty()
    {
        return elements.isEmpty();
    }

}
