 class  logical
{
	public static void main(String[] args) 
	{
		int n1=23;
		int n2=12;
		int n3=22;
		boolean res1=n1>n2&&n1==23;
		boolean res2=n2+12<n1||n1-13>n2;
		boolean res3=(n3>n2&&n1<50||5!=3);
		boolean res4=n1==n2&&n2>n3;

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}
}
