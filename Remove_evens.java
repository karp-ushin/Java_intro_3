import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_evens {
    public static void main(String[] args) {
        List<Integer> lst = new LinkedList<>();
        lst.add(1); lst.add(2); lst.add(3); lst.add(4); lst.add(5);
        List<Integer> filtered = lst.stream()
                            .filter(i -> i%2 == 1)
                            .collect(Collectors.toList());
        System.out.println(filtered);
    }
}