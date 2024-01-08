import java.util.Scanner;
class demo{
        public static int  febn(int a)
	{
	   int sum=a+febn(a-1);
           System.out.print(sum+" ");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		int p=1;
		System.out.print(k+","+p+",");
                febn(n);
	} 
}