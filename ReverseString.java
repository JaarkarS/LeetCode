public class ReverseString {

    public static void main(String args[]){
        String str = "jaykorrapati";
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        if(str == null) {
            throw new IllegalArgumentException("Input is null");
        }
        StringBuilder strb =  new StringBuilder();
        char[] chararray = str.toCharArray();
        for(int i = chararray.length-1; i>=0; i--){
            strb.append(chararray[i]);
        }

     return strb.toString();
    }
}
