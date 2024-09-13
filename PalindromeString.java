/*
check palindrome number:
*/
import java.util.Scanner;
public class PalindromeString
{
//check palindrome method:
public static void PalindromeLogic(String word)
{
String reverse="";

for(int i=word.length()-1;i>=0;i--)
{
reverse=reverse + word.charAt(i);
}
if(word.toLowerCase().equals(reverse.toLowerCase()))
{
System.out.print(word+" is palindrome.");
}
else
{
System.out.print(word+" is not a palindrome.");
}
}
public static void main(String[] args)
{
String word;
Scanner s=new Scanner(System.in);
System.out.print("Enter any word to check it is Palindrome or not:");
word=s.nextLine();
PalindromeLogic(word);
}
}
