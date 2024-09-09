/*
check palindrome number:
*/
import java.util.Scanner;
public class Palindrome
{
//check palindrome method:
public static void PalindromeLogic(int num)
{
int temp =num;
int remainder=0;
int reverse=0;

while(num>0)
{
remainder=num%10;
reverse=(reverse * 10) + remainder;
num=num/10;
}
if(temp==reverse)
{
System.out.print("palindrome.");
}
else
{
System.out.print("not a palindrome.");
}
}
public static void main(String[] args)
{
int num;
Scanner s=new Scanner(System.in);
System.out.print("Enter any number to check it is Palindrome or not:");
num=s.nextInt();
PalindromeLogic(num);
}
}
