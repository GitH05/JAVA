import java.util.*;
import java.util.Scanner;
/* left rotation:
rotation time t=2

before rotation:
a=[1,2,3,4,5]

after rotation:
a'=[3,4,5,1,2]
 */
public class ArrayLeftRotation
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int size;
int i,RotateTime;
System.out.print("Enter the size of the array:");
size=s.nextInt();
int a[] = new int[size];		//original array:
int RotateArray[] = new int[size];		//Rotatearray

System.out.print("\nEnter the array elements:");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.print("\nThe array element are:");
for(i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}

System.out.print("\nEnter the number of Left Rotation:");
RotateTime = s.nextInt();
//rotation logic:
for(i=0;i<size;i++)
{
int position = (i + size - RotateTime)%size;
//assigning rotate array:
RotateArray[position] = a[i];
}
System.out.print("Array after "+RotateTime+" left rotation: "+Arrays.toString(RotateArray));
}
}