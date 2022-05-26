package logic;

import exception.ArgsCount;
import exception.IsNumeric;

public class PrimeNumber {
    public void PrimeNumberOf(String[] args){
        int Factors = 0;
        try {
            argsCount(args);
            isNumeric(args[0]);
            isPositive(args[0]);

            for(int index=1 ; index <= Integer.parseInt(args[0])/2 ; index++){
                if(Integer.parseInt(args[0]) % index == 0){
                    Factors += 1;
                }
            }
            if(Factors == 1){
                System.out.println("Prime Number");
            }else{
                System.out.println("Not a Prime Number");
            }

        }catch (Exception e){
            System.out.println(e);
        }
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

    public void isPositive(String input) throws IsNumeric{
        if(Integer.parseInt(input) <0 ){
            throw new IsNumeric("please enter positive number only");
        }
    }
}
