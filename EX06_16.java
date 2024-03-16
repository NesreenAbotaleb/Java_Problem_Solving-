package CH06;

public class EX06_16 {

    public static void main(String[] args) {
        int [] nums = new int [100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = (int)(Math.random() * 1000 + 1);
        }
        int key = (int)(Math.random() * 1000 + 1);
        
        nums = sort(nums);
        long startTime = System.currentTimeMillis();
        int binary = binarySearch(nums , key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        if (binary < 0) {
            System.out.println("the number " + key + " is not in the array and "
                    + "the execution time is " + executionTime);
        }else
            System.out.println("The index of " + key + " is " + binary + "and "
                    + "the execution time is " + executionTime);
    }
    
    public static int[] sort(int... nums){      
        int temp ;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
               temp = nums[i];
               nums[i] = nums[i + 1];
               nums[i + 1] = temp;
            }
        }
        return nums;
    }
    
    public static int binarySearch(int[] nums , int key){
        int low = 0;
        int high = nums.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if(key == nums[mid])return mid;
            else if(key < nums[mid]){
                high = mid -1;
            }else
                low = mid + 1;
        }
        return -1;
    }
    
}
