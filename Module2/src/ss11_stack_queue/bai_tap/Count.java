package ss11_stack_queue.bai_tap;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        String string = "this is a paragraph";
        String[] arrString = string.split("");


        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMap<String, Integer> keyMap = new TreeMap<>();

        for (int i = 0; i < arrString.length; i++) {
            keyMap.put(arrString[i], 1);
        }
        for (String x : keyMap.keySet()) {
            int value = 0;
            for (int i = 0; i < arrString.length; i++) {
                if (x.equals(arrString[i])) {
                    value++;
                }
            }
            map.put(x, value);
        }
        System.out.println(map);

    }
}
