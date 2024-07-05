import java.util.*;

public class LongestSubstring {

    public static void main(String args[]) {
        char[] a = "anviaj".toCharArray();
        int reallength = 0;
        if (a.length == 1) {
            reallength = 1;
        }else{
        int maxlength = 0;
        int counter = 0;

        Set set = new HashSet();
        while (counter < a.length) {
            if (!set.contains(a[counter])) {
                
                set.add(a[counter]);
                maxlength++;
            }
            int jcounter = counter + 1;
            if (jcounter != a.length && !set.contains(a[jcounter])) {
                set.add(a[jcounter]);
                maxlength++;
            } else {
                if (reallength < maxlength)
                    reallength = maxlength;
                set = new HashSet();
                set.add(a[counter]);
                maxlength = 1;

            }
            counter++;
        }
    }
        System.out.println("-reallength--" + reallength);
    }
}
