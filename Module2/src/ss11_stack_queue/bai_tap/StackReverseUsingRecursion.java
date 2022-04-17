package ss11_stack_queue.bai_tap;
import java.util.Stack;
import java.util.Iterator;
public class StackReverseUsingRecursion {
    static Stack<Integer> myStack = new Stack<>();

    // phuong thuc inser at buttom;
    static void insertAtButtom(int data){
        if(myStack.isEmpty()){
            myStack.push(data);
        }else {
            int prevData = myStack.peek();
            myStack.pop();
            insertAtButtom(data);
            myStack.push(prevData);
        }
    }

    static void reverse(){
        if(myStack.isEmpty()){
            return;
        }
        int data = myStack.peek();
        myStack.pop();
        reverse();
        insertAtButtom(data);
    }

    public static void main(String[] args) {
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        System.out.println(myStack);
        reverse();
        System.out.println(myStack);

    }


}
