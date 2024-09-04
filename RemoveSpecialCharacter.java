import java.util.*;
public class RemoveSpecialCharacter
{
public static void main(String[] args)
{
String str="j@v@";
String plain=str.replaceAll("[^a-zA-Z0-9]","");
System.out.println("Plain: "+plain);
}
}
