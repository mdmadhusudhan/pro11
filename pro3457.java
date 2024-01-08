import java.util.Vector;
class main{
public static void main(String args[])
{
Vector<String> animals=new Vector<>();
animals.add("dog");
animals.add("cat");
animals.add("horse");
System.out.println("Vector animals:"+animals);
Vector<String> mamels=new Vector<>();
mamels.add("fish");
mamels.addAll(animals);
System.out.println("Vector mamels:"+mamels);
}
}