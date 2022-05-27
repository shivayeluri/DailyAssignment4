import logic.*;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();

//        new FibonacciSeries().FibonacciSeriesOf(args);
//        new PerfectNumber().perfectNumberOf(args);
//        new PrimeNumber().PrimeNumberOf(args);
//        new ReverseNumber().reverseNumberOf(args);
        new DistinctCouponNumber().couponNumber(args);

        long stopTime = System.nanoTime();
        sb.append("Execution time : ").append((stopTime - startTime)/1000000).append(" MS");
        System.out.println(sb);
    }
}