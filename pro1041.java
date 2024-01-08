import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<String> languages=new ArrayList<>();
languages.add("java");
languages.add("kotlin");
languages.add("c++");
languages.add("phython");
System.out.println("ArrayList:"+languages);
languages.set(2,"javaScript");
System.out.println("ArrayList:"+languages);
}
}