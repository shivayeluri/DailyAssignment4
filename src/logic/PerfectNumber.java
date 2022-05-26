package logic;

import exception.ArgsCount;
import exception.IsNumeric;

public class PerfectNumber {

public void perfectNumberOf(String[] args){
    int sum = 0;
    try {
        argsCount(args);
        isNumeric(args[0]);
        isPositive(args[0]);
        
        for(int index=1 ; index <= Integer.parseInt(args[0])/2 ; index++){
            if(Integer.parseInt(args[0]) % index == 0){
                sum += index;
            }
        }
        if(sum == Integer.parseInt(args[0])){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
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