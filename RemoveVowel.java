import java.util.Scanner;
public class RemoveVowel {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any phrase: ");
    String phrase = scanner.nextLine();
    StringBuilder result = new StringBuilder();

    // Iterating to each letter of the phrase:
    for(int i =0;i<phrase.length();i++) {
        char eL = phrase.charAt(i);
        
        // check each letter is vowel or not:
        if(eL=='a'||eL=='A' || eL=='e'||eL=='E' ||
        eL=='i'||eL=='I' || eL=='o'||eL=='O' || eL=='u'||eL=='U') {
            continue;   //skip this block
        }
        // append the remaining letter:
        else {
            result = result.append(eL);
        }
        
    }
    // display the constant only:
    System.out.println(result);
    }
}
