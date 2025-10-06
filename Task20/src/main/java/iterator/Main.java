package iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        FibonacciSequence fib = new FibonacciSequence();
        Iterator<Integer> iterator = fib.iterator();

        for(int i = 0; i <= 10; i++) {
            System.out.println(iterator.next());
        }
    }
}
