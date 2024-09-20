import java.util.Scanner;

public class StrongPass 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your password: ");
String password = scanner.nextLine();
int missingCriteria = 0;

// Checking the length of the password
if (password.length() < 6) 
{
missingCriteria += (6 - password.length());
}
boolean lowerCase = false;
boolean upperCase = false;
boolean digit = false;
boolean specialChar = false;

// Loop through each character of the password to check conditions
for (char ch : password.toCharArray()) 
{
if (Character.isLowerCase(ch)) 
{
lowerCase = true;
}
else if (Character.isUpperCase(ch)) 
{
upperCase = true;
}
else if (Character.isDigit(ch)) 
{
digit = true;
} 
else if (!Character.isLetterOrDigit(ch)) 
{
specialChar = true;
}
}
// Checking for missing criteria
if (!lowerCase) missingCriteria++;
if (!upperCase) missingCriteria++;
if (!digit) missingCriteria++;
if (!specialChar) missingCriteria++;

//  Showing Final output
if (missingCriteria == 0)
{
System.out.println("Your password is strong!");
}
else 
{
System.out.println("Your password is weak. You need " + missingCriteria + " more condition to make it strong.");
}

}
}
