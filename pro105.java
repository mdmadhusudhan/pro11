import java.util.Scanner;
class Demo{
        public int[] method1(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an arry:");
	 int s=sc.nextInt();
	int[] arr=new int[s];
	System.out.println("enter the elements into the array:");
	for(int i=0;i<s;i++){
		arr[i]=sc.nextInt();}
	return arr;
	}
}
class test{
public static void main(String args[]){
	Demo d=new Demo();
        int[] res=new int[5];
	res=d.method1();
	for(int i=0;i<5;i++){
	System.out.println(res[i]);}
}
}