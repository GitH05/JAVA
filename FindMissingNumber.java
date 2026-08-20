/* 
    Time complexity: O(n) [ loop runs n times ]
    Space complexity: O(1)  constant variable used
*/

public class FindMissingNumber {
    public static void main(String args[]) {
        int[] arr = { 0, 3, 1 };
        int n = arr.length;
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result = result ^ i;    // 0 ^ 1 ^ 2 ^ 3
        }

        for (int i : arr) {
            result = result ^ i;    // 0 ^ 1 ^ 2 ^ 3 ^ 0 ^ 3 ^ 1 -> 2 remains via XOR property
        }

        System.out.println("The missing number is: " + result);
    }
}