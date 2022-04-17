package ss11_stack_queue.thuc_hanh;

public class GenericStackClient {
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Size of stack after push operations: "+ stack.size());
        System.out.println("Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%s",stack.pop());
        }
        System.out.println("Size of stack after the pop operation: "+ stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Size of stack after push operations: " + stack.size());
        System.out.println("Pop element from stack: ");
        while(!stack.isEmpty()){
            System.out.printf("%s",stack.pop());
        }
        System.out.println("Size of stack after the pop operation: "+ stack.size());
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of Integer");
        stackOfIntegers();
        System.out.println("2. Stack of Strings");
        stackOfIStrings();
    }
}
