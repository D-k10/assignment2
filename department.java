abstract class department
{
double salary,bonus,totalsalary;
public void display(string dept)
{
System.out.println("\t"salary+"\t"bonus+"\t"total salary);
}
}
class account extends department
{
public void class bonus (double sal)
{
salary=sal;
bonus=sal*0.2;
totalsalary=salary+bonus;
}
}
class sales extends department
{
public void calbonus(double sal)
{
salary=sal;
bonus=sal*0.3;
totalsalary=salary+bonus
}
}
public class bonus
{
public static void main(String arg[])
{
department d1=new account();
department d2=new sales();
d1.calbonus(10000);
d2.calbonus(20000);
system.out.println("department\tsalary\tbonus\ttotalsalary);
d1.displaysalary("account");
d2.display salary("sales");
}
}
