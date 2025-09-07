package Strategy;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SortingContext sorter = new SortingContext(new InsertionSort());
        SortingStrategy mergeSort = new MergeSort();
        SortingStrategy bubbleSort = new BubbleSort();


        int[] largeList = sorter.getList("large");
        int[] smallList = sorter.getList("small");

        int[] arrForInsertionLarge = Arrays.copyOf(largeList, largeList.length);
        int[] arrForMergeLarge = Arrays.copyOf(largeList, largeList.length);
        int[] arrForBubbleLarge = Arrays.copyOf(largeList, largeList.length);

        int[] arrForInsertionSmall = Arrays.copyOf(smallList, smallList.length);
        int[] arrForMergeSmall = Arrays.copyOf(smallList, smallList.length);
        int[] arrForBubbleSmall = Arrays.copyOf(smallList, smallList.length);


        System.out.println("Sorting 100k Integers in a Array");
        sorter.sortIntegers(arrForInsertionLarge);
        sorter.setStrategy(mergeSort);
        sorter.sortIntegers(arrForMergeLarge);
        sorter.setStrategy(bubbleSort);
        sorter.sortIntegers(arrForBubbleLarge);
        System.out.println("---------------------------------");
        System.out.println("Sorting 30 Integers in a Array");
        sorter.sortIntegers(arrForInsertionSmall);
        sorter.setStrategy(mergeSort);
        sorter.sortIntegers(arrForMergeSmall);
        sorter.setStrategy(bubbleSort);
        sorter.sortIntegers(arrForBubbleSmall);

    }
}
