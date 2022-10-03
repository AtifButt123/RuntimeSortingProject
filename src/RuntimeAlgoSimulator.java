
public class Main {
    public static void main(String[] args) {
        RuntimeAlgoInjection algo = new RuntimeAlgoInjection();
        algo.setSortingStrategy(new BubbleSort());
        algo.performSorting();
        algo.setSortingStrategy(new MergeSort());
        algo.performSorting();
        algo.setSortingStrategy(new InsertionSort());
        algo.performSorting();
        algo.setSortingStrategy(new QuickSort());
        algo.performSorting();
        algo.setSortingStrategy(new HeapSort());
        algo.performSorting();

        algo.setSearchingStrategy(new DepthFirstSearch());
        algo.performSearching();
        algo.setSearchingStrategy(new BreadthFirstSearch());
        algo.performSearching();
    }
}