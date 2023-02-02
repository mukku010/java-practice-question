import java.util.Scanner;
class Zero
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		if(x==0 )
		{
			System.out.println(x+"is Zero");
		}
		else
		{
			System.out.println(x+ "non-zero");
		}
	}
}