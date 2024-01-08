class Demo{
	public void add(){                                     //no arguments no return value
		int i=5,j=3;
		System.out.println("i"+"+"+"j="+(i+j));
	}
	public int sub(){                                        //no arguments with return value
 		int i=20,j=12;
		return i-j;
	}
	public void mul(int a){                            //with arguments no return value   
		System.out.println(a+"*2="+a*2);
	}
	public int div(int a){                                 //with arguments with return value
		return a/2;
	}
}
class test{
	public static void main(String args[]){
		Demo d=new Demo();
		int i=10;
		d.add();
		int s=d.sub();
		System.out.println(i+"-5="+s);
		d.mul(i);
		int f=d.div(i);
		System.out.println(i+"/2="+f);
	}
}