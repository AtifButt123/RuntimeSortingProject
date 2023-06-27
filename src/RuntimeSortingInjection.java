public class RuntimeSortingInjection {
    private ISortingStrategy sortingStrategy;
    public RuntimeSortingInjection(ISortingStrategy strategy){
        this.sortingStrategy = strategy;
    }
    public int[] sort(int[]nums){
        return sortingStrategy.sort(nums);
    }
}
