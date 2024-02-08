package org.example;
/**
 * Time: O(n)
 * Space: O(n)
 */
public class RecursionSolution {

    public int getFibonacci(int n){
        return n<=1 ? n:getFibonacci(n-1)+getFibonacci(n-2);
    }
}
