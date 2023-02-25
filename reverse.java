import java.util.*;
class reverse
{
public static void main(String args[])
{
String original,reverse="";
Scanner in =new Scanner(System.in);
System.out.println("enter a string to be reverse");
original=in.nextLine();
int length=original.length();
for(int i=length-1; i>=0; i--)
reverse=reverse+original.charAt(i);
System.out.println("original:"+original);
System.out.println("reverse:"+reverse);
in.close();
}
}
