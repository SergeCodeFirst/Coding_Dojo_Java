public class FizzBuzz{
    public String FizzBuzzM(int num){
        if (num % 3 == 0 & num % 5 == 0){
            return "FizzBuzz";
        }
        
        if (num % 3 == 0){
            return "Fizz";
        }

        if (num % 5 == 0){
            return "Buzz";
        }

        String res = "Number " + num + " is not divisible by 5 or 3";
        return res;
    }

    public String FizzBuzzM(int num, String multOf3Word, String multOf5Word, String multOf15Word){
        if (num % 3 == 0 & num % 5 == 0){
            return multOf15Word;
        }
        
        if (num % 3 == 0){
            return multOf3Word;
        }

        if (num % 5 == 0){
            return multOf5Word;
        }

        String res = "Number " + num + " is not divisible by 5 or 3";
        return res;
    }
}