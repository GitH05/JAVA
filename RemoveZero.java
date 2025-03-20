import java.util.Scanner;
public class RemoveZero {
    public static void main(String[] args) {
     
        int i,size, index=0, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();
        
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(i=0; i<size; i++) { arr[i] = sc.nextInt();}
//        count the non-zero element in the array:
        for(i=0; i<size; i++) {if (arr[i] != 0) {count++;}}
//        size of new array
            int[] newArr = new int[count];
//        copy non-zero elements into new array:
            for(i=0; i<size; i++) {if(arr[i]!=0){newArr[index]=arr[i]; index++;}}
//            display new array without zero:
        System.out.print("The new array is: ");
        for(i=0; i<count; i++) {System.out.print(newArr[i]+" ");}
      }
    }
