class narrowing
{
public static void main(String[]args)
{
   long l1=781L;
   short s=(short)l1;
   System.out.println(s);

   double d=11.22D;
   int i=(int)d;
   System.out.println(i);
  
   short s2=129;
   byte b=(byte)s2;
   System.out.println(b);
}
}