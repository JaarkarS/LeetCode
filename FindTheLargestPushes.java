import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class FindTheLargestPushes {

      static String solution(String[] logs) {
        List<String> logsList = Arrays.asList(logs);
        int largestbranch = 0;
        String largestPush = "";
        int i=0;
        while(i<logsList.size()){
            String switchesi = logsList.get(i);
            if(switchesi.contains("switch")){
                int countPushes = 0;
                int j=i+1;
                String switchesj = logsList.get(j);
                while(j<logsList.size() && switchesj.contains("push"))
                {
                    countPushes++;
                    j++;
                    if(j<logsList.size())
                      switchesj = logsList.get(j);
                }
                i=j;
                if(countPushes > largestbranch){
                    largestbranch = countPushes;
                    largestPush = switchesi;
                }
            }
        }
      return largestPush;
    }

    public static void main(String[] args){
          String[] logs =  new String[]{"switch one","push one","push two","switch issue", "push one", "push two","push 3","switch two", "push one", "push two"};
          System.out.print(solution(logs));

    }

}
