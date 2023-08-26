import java.util.ArrayList;

public class Basic{
    // print from 1 - 255
    public void Print1To225(){
        for (int i = 1; i<226; i++){
            System.out.println(i);
        }
    }

    // Print odd number beetween 1 - 255
    public void PrintOdd1To225(){
        for (int i=0; i<226; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // Return sum  1 - 225
    public int Sum1To225(){
        int res = 0;
        
        for (int i=0; i<226; i++){
            res += i;
        }

        return res;
    }

    // Print Item of an array
    public void ItemsInArray(Object[] nums){
        for (Object num : nums){
            System.out.println(num);
        }
    }

    // Find Max
    public int FindMax(int[] nums){
        int max =nums[0];

        for(int num : nums){
            if (num > max){
                max = num;
            }
        }
        return max;
    }

    // Retuen arr with odd number
    public ArrayList<Integer> OddNumArray(){
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i=1; i<226; i++){
            if (i % 2 != 0){
                res.add(i);
            }
        }

        return res;
    }

    // Find the average number
    public int AverageNum(int[] nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }

        return sum/nums.length;
    }

    // Greater than y
    public int GreaterThanY(int[] nums, int y){
        int counter = 0;

        for (int num : nums){
            if (num > y){
                counter++;
            }
        }

        return counter;
    }

    // square value
    public void ItemsInArrayToarray(int[] nums){
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public int[] SquareValue(int[] nums){
        for (int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        ItemsInArrayToarray(nums);
        return nums;
    }

    // Reaplace negative number
    public int[] ReaplaceNegNum(int[] nums){
        ItemsInArrayToarray(nums);
        for(int i=0; i<nums.length; i++){
            if (nums[i] < 0){
                nums[i] = 0;
            }
        }
        ItemsInArrayToarray(nums);
        return nums;
    }
    
    // returm max, min an average
    public ArrayList<Integer> MaxMinAvg(int[] nums){
        int sum = 0;
        int max = nums[0];
        int min = nums[0];
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for (int num : nums){
            if (num < min){
                min = num;
            }
            
            if (num > max){
                max = num;
            }
            
            sum += num;
            
        }
        
        res.add(min);
        res.add(max);
        res.add(sum/nums.length);
        
        return res;
    }
    
    // Shiffting value 
    public int[] ShifValues(int[] nums){
        ItemsInArrayToarray(nums);
        for (int i=0; i<nums.length; i++){
            if (i == nums.length -1){
                nums[i] = 0;
            } else{
                nums[i] = nums[i+1];
            }
        }
        
        ItemsInArrayToarray(nums);
        return nums;
    }

    //Repalce negative num with "Dojo"
    public void ItemsInObjectArray(Object[] nums){
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public Object[] ReplaceNegNumByDojo(int[] nums){
        Object[] res = new Object[nums.length];
        
        for (int i=0; i<nums.length; i++){
            
            if (nums[i]< 0){
                res[i] = "Dojo";
            }
            else{
                res[i] = nums[i];
            }
        }
        
        ItemsInObjectArray(res);
        return res;
    }
}