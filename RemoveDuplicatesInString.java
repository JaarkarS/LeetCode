import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;


public class RemoveDuplicatesInString {
    public static void main(String args[]){
        String str = "jaykorrapati";
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        if(str == null) {
            throw new IllegalArgumentException("Input is null");
        }
        StringBuilder strb =  new StringBuilder();
        char[] chararray = str.toCharArray();
        Map charExists = new HashMap();
        for(int i = 0; i< chararray.length; i++){
            if(!charExists.containsKey(chararray[i])){
                strb.append(chararray[i]);
                charExists.put(chararray[i],1);
            }
            boolean a = !!false;
            System.out.println(a);


        }

        return strb.toString();
    }
}
