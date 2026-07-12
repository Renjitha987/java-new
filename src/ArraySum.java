public class ArraySum {
    public static void main(String[]args){
        int[] nums={10,20,30};
        int sum=0;
        for(int i=0;i<nums.length;i++) {
            sum = nums[i] + sum;
        }
        System.out.println(sum);
        }
    }

