public class MergeTwoWordsAlt {
    public static String mergeAlternately(String word1, String word2) {
        if(word1 != null && word1.length()==0 || word2 != null && word2.length() == 0){
            return "cannot merge as either word1/2 is blank or null";
        }
        StringBuilder mergedword = new StringBuilder();
        int maxLentgth= Math.max(word1.length(),word2.length());

        for(int i=0;i<maxLentgth;i++){
            if(i < word1.length()) {
                mergedword = mergedword.append
                        (word1.charAt(i));
            }
            if(i < word2.length()){
                mergedword = mergedword.append(word2.charAt(i));
            }
        }

        return mergedword.toString();

    }
    public static void main(String[] args){
        System.out.println(mergeAlternately("ab","pqr"));
    }

}
