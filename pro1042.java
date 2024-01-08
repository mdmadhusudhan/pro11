import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<Integer> num=new ArrayList<>();
num.add(34);
num.add(456);
num.add(345);
System.out.println("ArrayList integers:"+num);
num.set(2,767);
System.out.println("ArrayList integers:"+num);
}
}