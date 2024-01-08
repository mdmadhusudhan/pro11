import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<String> animals=new ArrayList<>();
animals.add("dog");
animals.add("cat");
animals.add("horse");
System.out.println("ArrayList:"+animals);
System.out.println("using for-each loop");
for(String s:animals){
System.out.print(s);
System.out.print(" ");}
}
}