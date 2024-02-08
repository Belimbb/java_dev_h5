package org.example;

import java.util.HashMap;
import java.util.Map;
/**
 * Time: O(log n)
 * Space: O(n)
 */
public class DynamicProgrammingSolution {
    private Map<Integer, Integer> results = new HashMap<>();
    public int getFibonacci(int n){
        if (results.containsKey(n)){
            return results.get(n);
        }else {
            if (n<=1){
                results.put(n, n);
                return n;
            }else {
                int result = getFibonacci(n - 1) + getFibonacci(n - 2);
                results.put(n, result);
                return result;
            }
        }
    }
}
