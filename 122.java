//with arguments with return
class demo{
	public int add(int x){
		x=x*2;
	return x;
	}
}
class test{
	public static void main(String args[]){
		demo d=new demo();
		int i=5;
		System.out.println(d.add(i));
	}
}