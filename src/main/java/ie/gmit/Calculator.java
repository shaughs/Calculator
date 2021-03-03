package ie.gmit;

public class Calculator {
//These methods will add,subtract,divide and multiply two numbers

    public int add(int number1, int number2){
        if(number1 > 0 && number2 > 0) {
            int addResult = number1 + number2;
            return addResult;
        }else{
            throw new IllegalArgumentException("Not a valid Entry");
        }
    }

    public int subtract(int number1, int number2){
        if(number1 > 0 && number2 > 0) {
            int subtractResult = number1 - number2;
            return subtractResult;
        }else{
            throw new IllegalArgumentException("Not a valid Entry");
        }
    }

    public int divide(int number1, int number2){
        if(number1 > 0 && number2 > 0) {
            int divideResult = number1 / number2;
            return divideResult;
        }else{
            throw new IllegalArgumentException("Not a valid Entry");
        }
    }

    public int multiply(int number1, int number2){
            if(number1 > 0 && number2 > 0) {
                int multiplyResult = number1 * number2;
                return multiplyResult;
            }else{
                throw new IllegalArgumentException("Not a valid Entry");
            }
    }

}
