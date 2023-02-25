public class cmdl
{
public static void main(String arg[])
{
if(arg.length>=2)
{
int n1=Integer.parseInt(arg[0]);
int n2=Integer.parseInt(arg[1]);
int sum=n1+n2;
System.out.print("sum "+sum);
}
else
{
System.out.println("incorrect input");
}
}
}
