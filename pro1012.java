import java.util.ArrayList;
class main{
public static void main(String args[])
{
ArrayList<Float> no=new ArrayList<>();
no.add(34.5f);
no.add(4564.5f);
no.add(345.45f);
System.out.println("ArrayList Foat:"+no);
System.out.println("Accessed element:"+no.get(2));
float f=no.remove(1);
System.out.println("removed element:"+f);
System.out.println("ArrayList Foat:"+no);
}
}