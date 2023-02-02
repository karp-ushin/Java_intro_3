import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        System.out.println("Minimum value is: " + Collections.min(arr));
        System.out.println("Maximum value is: " + Collections.max(arr));

        System.out.println("Average is: " + arr.stream()
                                                .mapToDouble(d -> d)
                                                .average()
                                                .orElse(0.0));
    }
}