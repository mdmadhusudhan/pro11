import java.util.List;
import java.util.LinkedList;
class main{
public static void main(String args[])
{
List<Double> salary=new LinkedList<>();
salary.add(34345.5);
salary.add(98765.6);
salary.add(87654.34);
salary.add(23456.67);
salary.add(9876.5);
salary.add(98765.56);
System.out.println("List:"+salary);
System.out.println("Accessed elment:"+salary.get(3));
System.out.println("index of elment 9876.5:"+salary.indexOf(9876.5));
Double n=salary.remove(1);
System.out.println("removed elment:"+n);
System.out.println("ArrayList :"+salary);
}
}