package ss11_stack_queue.thuc_hanh;

import java.util.EmptyStackException;
import java.util.LinkedList;
public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        this.stack = stack;
    }
    // install the push method
    public void push(T element){
        stack.addFirst(element);
    }

    // install pop method
    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    // install the size method (); '
    public int size(){
        return stack.size();
    }
    // install the isEmpty method;
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
        return false;
    }

}
