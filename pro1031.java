import java.util.List;
import java.util.LinkedList;
class main{
public static void main(String args[])
{
List<Integer> num=new LinkedList<>();
num.add(34);
num.add(45);
num.add(75);
System.out.println("List integers:"+num);
System.out.println("Accessed elment:"+num.get(2));
System.out.println("index of elment 45:"+num.indexOf(45));
int n=num.remove(1);
System.out.println("removed elment:"+n);
System.out.println("ArrayList integers:"+num);
}
}