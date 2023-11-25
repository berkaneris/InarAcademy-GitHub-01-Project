package week_10.assigments;

public class Queue {
    private int [] elements;
    private int size;

    public Queue(){
        this.elements = new int[8];
    }
    public int [] getElements(){
        return elements;
    }
    public int getSize(){
        return size;
    }
    public void enqueue(int value){
        if(size >= elements.length){
            int [] newElements = new int[elements.length * 2];
            System.arraycopy(elements , 0 , newElements , 0 , elements.length);
            elements = newElements;
        }
        elements[size++] = value;
    }
    public int dequeue(){
        int number = elements[0];
        for(int i = 0; i < getSize() - 1; i++){
            elements[i] = elements[i + 1];
        }
        size--;
        return number;
    }
    public boolean empty(){
        return  (size == 0);
    }
}
