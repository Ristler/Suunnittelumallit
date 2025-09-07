package Strategy;


public class BubbleSort implements SortingStrategy {

    @Override
    public void sortIntegers(int arr[]) {
        long start = System.nanoTime();
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
        long end = System.nanoTime();
        long elapsed = end - start;
        System.out.println("Elapsed time sorting with bubblesort: " + (elapsed / 1_000_000) + " ms");
    }
}
