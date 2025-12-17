import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter character");
        String str = s.nextLine();
        char[] reverse = str.toCharArray();
        // reverse using for loop
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
        // reverse using StringBuffer
        StringBuffer rev = new StringBuffer(str);
        System.out.println("\nReverse: " + rev.reverse());
    }
}