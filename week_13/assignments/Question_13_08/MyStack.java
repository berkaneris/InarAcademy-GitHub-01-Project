package week_13.assignments.Question_13_08;

import java.util.ArrayList;

public class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy
        MyStack myStack = (MyStack)super.clone();
        // Deep copy on whenBuilt
        myStack.list = (ArrayList<Object>)(list.clone());
        return myStack;
    }
}

