import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<Integer> num=new ArrayList<>();
num.add(34);
num.add(4564);
num.add(345);
System.out.println("ArrayList integers:"+num);
System.out.println("Accessed elment:"+num.get(0));
int n=num.remove(1);
System.out.println("removed elment:"+n);
System.out.println("ArrayList integers:"+num);
}
}