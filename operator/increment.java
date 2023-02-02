class increment
{
	public static void main(String[] args) 
	{
        int n1=2;
		int n2=7;
		int res1=n1++ + ++n2 + ++n1;
		int res2=n2++ + n2++ + n1 + ++n1;
		System.out.println(res1);
		System.out.println(res2);

		int n3=3;
		int n4=4;
		int res3=n3-- + --n4 + --n3;
		int res4=n4-- + n4-- + n3 + --n3;
		System.out.println(res3);
		System.out.println(res4);
	}
}
