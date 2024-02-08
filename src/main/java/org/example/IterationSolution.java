package org.example;

/**
 * Time: O(n)
 * Space: O(n)
 */
public class IterationSolution {
    public int getFibonacci(int n){
        if (n <= 1) return n;

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++){
            int next = current + previous;
            previous = current;
            current = next;
        }
        return current;
    }
}