import java.lang.reflect.Array;
import java.util.Random;

public class Puzzle{
    public void randomTest(){
        Random rand = new Random();
        System.out.println(rand.nextInt(10));
    }

    public void ItemInIntArray(Integer[] nums){
        for (int num : nums){
            System.out.println(num);
        }
    }

    public void ItemInStringArray(String[] strs){
        for (String str : strs){
            System.out.println(str);
        }
    }

    // Generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public Integer[] getTenRolls(){
        Integer[] res = new Integer[10];
        Random rand = new Random();
        
        for (int i =0; i < 10; i++){
            res[i] =rand.nextInt(20) + 1;
        }
        ItemInIntArray(res);
        return res; 
    }

    // Return a Random Letter
    public char getRandomLetter(){
        Character [] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Random rand = new Random();

        return alphabet[rand.nextInt(26)];
    }

    // Create a random string of eight characters, and return that string.
    public String generatePassword(){
        String res = "";
        for (int i =0; i<8; i++){
            res += getRandomLetter();
        }

        return res;
    }

    // A method that takes an int length as an argument and creates an array of random eight character words.
    public String[] getNewPasswordSet(int length){
        String[] res = new String[length]; 
        
        for (int i =0; i<length; i++){
            res[i] = generatePassword();
        }

        ItemInStringArray(res);
        return res;
    }

    // Amethod that takes an array of string and and mixes up all the values in a pseudo-random way. 

    public String[] shuffleArray(String[] strs){
        Random rand = new Random();
        for (int i=0; i< strs.length; i++){
            int index = rand.nextInt(strs.length);
            
            String temp = strs[0];
            strs[0] = strs[index];
            strs[index] = temp;
        }

        ItemInStringArray(strs);
        return strs;
    }
}