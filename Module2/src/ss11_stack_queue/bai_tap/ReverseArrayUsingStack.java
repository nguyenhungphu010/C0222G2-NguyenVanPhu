package ss11_stack_queue.bai_tap;
import java.util.Stack;
import java.util.Arrays;
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Stack<Integer> stack = new Stack<>();
        for (int i = array.length -1; i >=0; i--) {
            stack.push(array[i]);
        }
        System.out.println("the reverse array using Stack is: " + stack);

        String myString = "I Love you";
        Stack <String> wStack = new Stack<>();
        String[] myStringList = myString.split(" ");
        System.out.println(Arrays.toString(myStringList));
        for (int i = myStringList.length-1; i >=0 ; i--) {
            wStack.push(myStringList[i]);
        }
        System.out.println("my reverse String: " + wStack);
    }
}
