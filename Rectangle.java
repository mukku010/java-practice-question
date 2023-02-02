import java.util.Scanner;
class Rectangle
{
public static void main(String[] args)
{
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter the length and width of a rectangle");
 long l=sc.nextLong();
 long w=sc.nextLong();
 long ar=l*w;

  System.out.println("Length is:" + l);
  System.out.println("Width is:" + w);
 System.out.println("Area is:" + ar);
 
}
}