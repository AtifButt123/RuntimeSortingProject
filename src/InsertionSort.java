public class InsertionSort implements ISortingStrategy{
    @Override
    public int[] sort(int[]nums) {
        System.out.println("This is insertion sort");
        int n = nums.length;

        for(int i = 1; i<n; i++){
            int j = i-1;
            int temp = nums[i];
            while(j>=0 && nums[j]>temp){
                nums[j+1] = nums[j];
                j--;
            }
            if(j!=i-1)
                nums[j+1] = temp;
        }
        return nums;
    }
}
