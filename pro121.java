//with arguments no return
class demo{
	public void add(int x){
		System.out.println(x);
	}
}
class test{
	public static void main(String args[]){
		demo d=new demo();
		int i;
		i=5*2;
		d.add(i);
	}
}