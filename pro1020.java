//no arguments with return
class demo{
	public int add(){
		int i;
		i=5*2;
	return i;
	}
}
class test{
	public static void main(String args[]){
		demo d=new demo();
		System.out.println(d.add());
	}
}