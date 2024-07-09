import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class FindLargestPushesWithMap {

    static String solution(String[] logs) {
        List<String> logsList = Arrays.asList(logs);
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        AtomicInteger countSwitch = new AtomicInteger();
        AtomicReference<String> switchStr = new AtomicReference<>("");
        AtomicInteger countPushforSwitch = new AtomicInteger();
        logsList.forEach(l -> {
        if(l.contains("switch")){
            switchStr.set(l);
            countPushforSwitch.getAndSet(0);
            if(countSwitch.intValue()==0) {
                countSwitch.getAndIncrement();
            }
        }
        if(l.contains("push")){
            countPushforSwitch.getAndIncrement();
            map.put(switchStr.toString(),countPushforSwitch.intValue());
        }
        });
      /*  Iterator<Map.Entry<String,Integer>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> map2 = it.next();
            System.out.println(map2.getKey()+":"+map2.getValue());
        }*/

        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    public static void main(String[] args){
        String[] logs =  new String[]{"switch one","push one","push two","switch issue", "push one", "push two","push 3","switch two", "push one", "push two"};
        System.out.print(solution(logs));

    }
}
