package Strategy;

import java.util.Random;

public class SortingContext {
    private SortingStrategy sortingStrategy;
    private Random rand = new Random();
    private int[] smallList;
    private int[] largeList;


    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
        this.smallList = new int[30];
        this.largeList = new int[100000];

        for (int i = 0; i < smallList.length; i++) {
            int n = rand.nextInt(smallList.length) + 1;
            smallList[i] = n;
        }
        for (int i = 0; i < largeList.length; i++) {
            int n = rand.nextInt(largeList.length) + 1;
            largeList[i] = n;
        }
    }
    public void setStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sortIntegers(int[] arr) {
        sortingStrategy.sortIntegers(arr);
    }

    public void printArray(int[] arr) {

                for(int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
        }

    public int[] getList(String size) {
        switch(size) {
            case "small":
                return smallList;
            case "large":
                return largeList;
            default:
                System.out.println("Invalid size entered. Choose small or large");
                return null;
        }
    }
}
