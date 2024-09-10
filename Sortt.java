import java.util.*;

public class Sortt
{
public static void main(String[] args)
{
String sr = "Arnold";
char temp;
int i,j;
char arr[] = sr.toCharArray();

for(i =0;i<arr.length;i++)
{
for(j= i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp = arr[i];
arr[i] = arr[j];
arr[j]= temp;
}
}
}
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]);
}


}
}