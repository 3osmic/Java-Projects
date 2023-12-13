/**
 * Stack extends ArrayList
 *
 * @author Aliyah Lewis
 *
 */

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

	/**
     * Checks if the stack is empty
     *
     * @return super.isEmpty() | True (if the stack is empty), Else (false otherwise)
     */
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /**
     * Gets the size of the stack
     *
     * @return super.size() | The number of elements in the stack
     */
    public int getSize() {
        return super.size();
    }

    /**
     * gets the top element of the stack without removing it
     *
     * @return super.get(getSize() - 1) | The top element of the stack
     */
    public Object peek() {
        return super.get(getSize() - 1);
    }

    /**
     * Removes and returns the top element of the stack
     *
     * @return o | The top element of the stack
     */
    public Object pop() {
        Object o = super.get(getSize() - 1);
        super.remove(getSize() - 1);
        return o;
    }

    /**
     * Pushes an element onto the top of the stack
     *
     * @param o | The object to be pushed onto the stack
     */
    public void push(Object o) {
        super.add(o);
    }

    /**
     * Overrides the toString method in the Object class
     *
     * @return "stack: " + super.toString() | A string representation of the stack
     */
    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}