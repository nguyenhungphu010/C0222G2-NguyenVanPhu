package ss11_stack_queue.bai_tap;
import java.util.Stack;
public class demoStack {
    public static void main(String[] args) {
        int[] arrNumber = {5,3,2,1,6,8,9,4};
        Stack<Integer> stack = new Stack<>();

        System.out.println("Original array");
        for (int e: arrNumber) {
            System.out.println(e);
        }

        for (int i = 0; i < arrNumber.length; i++) {
            stack.push(arrNumber[i]);
        }

        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = stack.pop();
        }

        System.out.println("Array after reverse");

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.println(arrNumber[i]);
        }
        System.out.println(stack);
    }
}
