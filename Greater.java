import java.util.Scanner;
class  leap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if((n%4==0 && n%4!=0) || (n%400==0))
	{
    System.out.println("It is a leap year");
	}
	else
	{
    System.out.println("It is not leap year");
	}
}
}

