import java.util.Scanner;
public class ClockAngle
{

public static int  Clock(int h, int m)
{
int angle = (11 *  m)/2 - 30 * h;
if(angle > 180)
{
angle = 360 - angle;
}
return Math.abs(angle);
}

public static void main(String[] args)
{
int h,m;
Scanner s=new Scanner(System.in);
System.out.println("Enter the hour:");
h = s.nextInt();
System.out.println("Enter the minute:");
m = s.nextInt();

System.out.println("The angle between "+h+" hour and "+m+" minute:");

System.out.print(Clock(h,m));
}

}
