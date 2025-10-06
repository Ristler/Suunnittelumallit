package iterator;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {


    //This is the state of the fibonacci.
    //Each iterator has its own state.
    //thats why i added them here.
    private int current = 1;
    private int prev = 0;

    @Override
    public boolean hasNext() {
        return true;
    }


    //This is the logic that generates the next fibonacci number.
    @Override
    public Integer next() {
        int temp = current;
        current = prev + current;
        prev = temp;
        return temp;
    }
}
