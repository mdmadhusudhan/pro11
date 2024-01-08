import java.util.List;
import java.util.LinkedList;
class main{
public static void main(String args[])
{
List<String> sport=new LinkedList<>();
sport.add("Kabbadi");
sport.add("Kho-Kho");
sport.add("Volleyball");
System.out.println("List integers:"+sport);
System.out.println("Accessed elment:"+sport.get(2));
System.out.println("index of elment Kho-Kho:"+sport.indexOf("Kho-Kho"));
String n=sport.remove(1);
System.out.println("removed elment:"+n);
System.out.println("ArrayList integers:"+sport);
}
}