import java.util.*;

public class StreamFindFirstElement {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(10, 12, 13);
        System.out.println(list.stream().findFirst().get());
    }
}
