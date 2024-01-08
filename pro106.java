import java.util.Scanner;
class Demo
{
	public long fact(long i){
	long fact=i;
	if(i==0){return 1;}
	else if(i<=2){return 1;}
       System.out.println(i);
	return fact(i-1)+fact(i-2);
	}
public static void main(String args[]){
	Demo d=new Demo();
        Scanner sc=new Scanner(System.in);
	 long s=sc.nextInt();
	long res=d.fact(s);
	System.out.println(res);
	
}
}