public class MissingNumber {
    public static void main(String[] args) {
        int num[] = { 1, 3, 4, 5 };
        int sum = 0;
        // sum of all available numbers
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        // sum of all number from 1-5
        int newSum = 0;
        for (int j = 1; j <= 5; j++) {
            newSum += j;
        }
        // sum of number from 0 to n - sum of available number
        System.out.println("Missing number is: " + (newSum - sum));
    }
}