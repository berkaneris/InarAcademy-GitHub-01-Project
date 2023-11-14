package week_11.assigments;

import java.util.ArrayList;
import java.util.Collection;

public class MyStack extends ArrayList<Object> {

    public MyStack(int initialCapacity) {
        super(initialCapacity);
    }

    public MyStack() {
    }

    public MyStack(Collection<?> c) {
        super(c);
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        return this.get(getSize() - 1);
    }

    public Object pop() {
        Object o = this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {

        this.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
