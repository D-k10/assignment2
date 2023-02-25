abstract class depart
{
double salary,bonus,totalsalary;
public void display(string dept)
{
System.out.println("depart\tsalary\tbonus\ttotalsalary");
}
}
class account extends depart
{
public void calbonus(double sal)
{
salary=sal;
bonus=sal*0.2;
totalsalary=salary+bonus;
}
}
class sales extends depart
{
public void calbonus(double sal)
{
salary=sal;
bonus=sal*0.3;
totalsalary=salary+bonus;
}
}
public class bonus
{
public static void main(String arg[])
{
depart d1=new account();
depart d2=new sales();
d1.calbonus(10000);
d2.calbonus(20000);
System.out.println("depart\tsalary\tbonus\ttotalsalary");
d1.displaysalary("account");
d2.displaysalary("sales");
}
}
