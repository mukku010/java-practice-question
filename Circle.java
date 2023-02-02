import java.util.Scanner;
class Circle
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the radius");
 double rd=sc.nextDouble();

 double ar=3.14*rd*rd;
 double cir=2*3.14*rd;
  System.out.println("Radius is:" + rd);
 System.out.println("Area is:" +ar);
 System.out.println("Circumference is:" +cir);
}
}
