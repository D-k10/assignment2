import java.util.*;
class Vector
{
public static void main(String args[])
{
vector<Integer>v=new Vector<Integer();
for(int i=0;i<10;i++)
{
v.add(i);
}
System.out.println(v);
System.out.println("after removal of item 3");
v.remove(3);
System.out.println(v);
System.out.println("elements at index 1 is="+v.get(1));
System.out.println("first Element of the vector is"+v.firstElement());
System.out.println("last Element of the vector is"+v.lastElement());
}
}