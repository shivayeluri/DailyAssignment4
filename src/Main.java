import logic.FibonacciSeries;
import logic.PerfectNumber;
import logic.PrimeNumber;
import logic.ReverseNumber;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();

        new FibonacciSeries().FibonacciSeriesOf(args);
//        new PerfectNumber().perfectNumberOf(args);
//        new PrimeNumber().PrimeNumberOf(args);
//        new ReverseNumber().reverseNumberOf(args);

        long stopTime = System.nanoTime();
        sb.append((stopTime - startTime)/1000000).append(" MS");
        System.out.println(sb);
    }
}