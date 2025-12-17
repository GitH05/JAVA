// How to reverse a integer
public class ReverseInteger {
    public static void main(String[] args) {
        int number = 1234;
        int reverse = 0;
        // solution 1
        while(number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse number via algo: "+ reverse);
        // solution 2
        System.out.println("Reverse number via string nuffer: "+(new StringBuffer(String.valueOf(reverse))));
    }
}
