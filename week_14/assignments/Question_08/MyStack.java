package week_14.assignments.Question_08;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<E> {

    private Queue<E> queue1;
    private Queue<E> queue2;
    private E topElement;

    public MyStack() {
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(E o){
        queue1.offer(o);
        topElement = o;
    }
    public E pop(){
        if(!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            E obj = queue1.poll();
            while(!queue2.isEmpty()){
                this.push(queue2.poll());
            }
            return obj;
        }
            throw new RuntimeException("The stack is empty");

    }
    public E top(){
        if(!queue1.isEmpty()){
            return topElement;
        }
        throw new RuntimeException("Stack is empty");
    }
    public boolean empty(){
        return queue1.size() == 0;
    }

}
