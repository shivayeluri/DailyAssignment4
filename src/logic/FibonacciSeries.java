package logic;

import exception.ArgsCount;
import exception.IsNumeric;

public class FibonacciSeries {

    public void FibonacciSeriesOf(String[] args){
        try {
            argsCount(args);
            isNumeric(args[0]);
            int maxNumber = Integer.parseInt(args[0]);
            System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");
            for (int i = 0; i < maxNumber; i++) {
                System.out.print(fibonacciRecursion(i) + " ");
            }
            System.out.println(" ");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }

    public void isNumeric(String input) throws IsNumeric {
        try{
            Integer.parseInt(input);
        }catch (Exception ignored){
            throw new IsNumeric("Please enter Number");
        }
    }

    public void argsCount(String[] args) throws ArgsCount {
        if(args.length == 0){
            throw new ArgsCount("Please enter any number.");
        }
    }

}