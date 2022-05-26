package logic;

import exception.ArgsCount;
import exception.IsNumeric;

public class ReverseNumber {
    public void reverseNumberOf(String[] args){

        int number = Integer.parseInt(args[0]);
        int reverseNumber = 0;

        try{
            isNumeric(args[0]);
            argsCount(args);
            isPositive(args[0]);

            while(number !=0 ){
                int digit = number%10;
                reverseNumber = reverseNumber *10 + digit;

                number = number/10;
            }
            System.out.println(args[0]);
            System.out.println(reverseNumber);
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
