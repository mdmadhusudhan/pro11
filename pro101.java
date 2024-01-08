import java.util.Scanner;
class Arraym{
	public int max(int[] array){
		int max=0;
		for(int i=0;i<array.length;i++){
			if( array[i]>max){max= array[i];}
		}
	return max;
	}
	public int min(int[]  array){
		int min= array[0];
		for(int i=0;i<array.length;i++){
			if( array[i]<min){min= array[i];}
		}
	return min;
	}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an arry:");
	int s=sc.nextInt();
	int[] arr=new int[s];
	System.out.println("enter the elements into the array:");
	for(int i=0;i<s;i++){
		arr[i]=sc.nextInt();}
	Arraym a=new Arraym();
	System.out.println("the maximun value is:"+a.max(arr));
	System.out.println("the minimun value is:"+a.min(arr));
}
}