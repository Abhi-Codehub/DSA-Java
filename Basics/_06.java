// Code to Delete an element from the array
package Basics;

import java.util.*;

import java.util.Arrays;

public class _06 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,35,40,50};
        int n = arr.length;
        int index = 3;
        
        int newArr[] =  new int [n-1];
        for(int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for(int i = index; i < n - 1; i++){
            newArr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(newArr)); 
    }
}
// Time Complexity = O(N)
// Space Complexity = O(N)
