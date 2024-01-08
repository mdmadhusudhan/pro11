import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<String> animals=new ArrayList<>();
animals.add("dog");
animals.add("cat");
animals.add("horse");
System.out.println("ArrayList:"+animals);
System.out.println("Accessed element:"+animals.get(1));
String s=animals.remove(0);
System.out.println("removed element:"+s);
System.out.println("ArrayList:"+animals);
}
}