public class PrintNumberWithoutLoop
{
    public static void dis(int a, int b) {
        if(a<=b) {
            System.out.print(a+" ");
            dis(a+1,b);
        }
    }
    public static void main(String[] args) {
        int a=0;
        int b=100;
        dis(a,b);
    }
}