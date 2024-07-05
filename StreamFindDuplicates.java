import java.util.*;

public class StreamFindDuplicates {
public static void main(String args[]){
    List<Integer> list = Arrays.asList(10,10,20,30);
    //list.stream().filter(n -> n.>1).forEach(System.out::println);
    Set<Integer> set = new HashSet<Integer>();
    list.stream().filter(n -> !set.add(n)).forEach(System.out::println);

    }

}
