public class PrimeNumberCheck {
    public static void main(String args[]){
       System.out.println(isPrimeNumber(1));
    }

    private static boolean isPrimeNumber(int num) {
        if (num != 0 && num % 2 == 0) {
            return false;
        }
        return true;
    }
}
