// count operations
package Basics;

class _01 {

    public static void main(String args[]) {
        int[] arr = {1,2,3,4,5};
        int sum = 0; 
        int operations = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            operations++;
        }
        System.out.println(sum);
        System.out.println(operations);
    }
}