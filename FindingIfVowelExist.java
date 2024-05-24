public class FindingIfVowelExist {

    public static void main(String args[]){
        String str = "jykrypt";
        System.out.println(String.valueOf(findVowel(str)));
    }

    private static boolean findVowel(String str) {
        if(str == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if(str.toLowerCase().matches(".*[aeiou].*")){
         return true;}
        return false;
    }
}
