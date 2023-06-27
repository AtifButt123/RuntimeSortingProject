import java.sql.SQLOutput;

public class BubbleSort implements ISortingStrategy{

    private static void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    @Override
    public int[] sort(int[]nums) {
        System.out.println("This is bubble sort");
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            boolean isSwapped = false;
            for(int j = 0; j < n-1-i; j++){
                if(nums[j+1] < nums[j]){
                    swap(nums, j, j+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return nums;
    }
}
