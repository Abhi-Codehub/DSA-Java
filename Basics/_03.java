// sum of natual numbers 
package Basics;

public class _03 {
    public static void main(String args[]) {
    int n = 20;
    int sum = 0;
    
    for(int i = 1; i <= n; i++) {
        sum = sum  + i ; 
    }
        System.out.println(sum);    

    }
}

// Time Complexity = O(n)
// Space Complexity = O(1)