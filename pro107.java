import java.util.Scanner;
class Demo
{
	public static void main(String args[])
	{
        	Scanner sc=new Scanner(System.in);
	 	long s=sc.nextInt();
		long fact=1;
		for (int i=0;i<=s;i++)
		{
			if(i==0)
			{
				fact=1;
			}
			else{
				fact=fact*i;
				}
		}
	System.out.println(fact);
	}
}