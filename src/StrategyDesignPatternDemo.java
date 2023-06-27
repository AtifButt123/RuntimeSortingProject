public class StrategyDesignPatternDemo {
    public static void print(int[]nums){
        System.out.println();
        if(nums.length==0){
            System.out.println("Empty!");
            return;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        RuntimeSortingInjection sortingStrategy = new RuntimeSortingInjection(new BubbleSort());
        int[]nums = sortingStrategy.sort(new int[]{5,3,3,10,20,7});
        print(nums);
    }
}
