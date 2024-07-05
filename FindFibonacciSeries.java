import java.util.stream.Stream;

public class FindFibonacciSeries {

    public static void main(String[] args) {
        findFibonacciSeriesByJava8();
    }

    private static void findFibonacciSeriesByJava8() {
        Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] }).limit(10).map(f -> f[0])
                .forEach(System.out::println);
    }
}
