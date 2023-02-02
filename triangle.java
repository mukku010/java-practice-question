import java.util.Scanner;
class Triangle
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the height and width of a triangle");
 double h=sc.nextDouble();
 double w=sc.nextDouble();
 double ar=0.5*h*w;
  System.out.println("Height is:" + h);
  System.out.println("Width is:" + w);
  System.out.println("Area is:" +ar);
}
}
