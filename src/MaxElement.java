public class MaxElement {
    public static void main(String[] args){
        int nums[]={4,7,1,9,3};
        int max=nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]> max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
