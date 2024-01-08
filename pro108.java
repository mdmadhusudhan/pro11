import java.util.Scanner;
class demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int p=1;
		System.out.print(k+","+p);
		for(int i=1;i<n;i++)
		{
			int m=k+p;
			if(i==n)
			{
				System.out.print(m);
			}
			else
			System.out.print(m+",");
			k=p;
			p=m;
		}
	} 
}