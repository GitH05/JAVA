public class RemoveZero
{
public static void main(String[] args)
{
int A[] = {1,5,69,8,0,9};
int elem = 0;
RemoveZero rz=new RemoveZero();
int a = rz.removeElement(A, elem);
System.out.println(a);
}
 public int removeElement(int[] A, int elem) {
 int i=0;
 int j=0;
 while(j < A.length){
 if(A[j] != elem){
 A[i] = A[j];
 i++;
 }
 j++;
 }
 return i;
 }
}