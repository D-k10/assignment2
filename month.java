import java.util.*;
class month
{
public static void main(String arg[])
{
int month;
Scanner sc=new Scanner(System.in);
System.out.println("please enter the month no");
month=sc.nextInt();
switch(month)
{
case 1:System.out.print("january");
break;
case 2:System.out.print("febuary");
break;
case 3:System.out.print("march");
break;
case 4:System.out.print("april");
break;
case 5:System.out.print("may");
break;
case 6:System.out.print("june");
break;
case 7:System.out.print("july");
break;
case 8:System.out.print("august");
break;
case 9:System.out.print("september");
break;
case 10:System.out.print("october");
break;
case 11:System.out.print("november");
break;
case 12:System.out.print("december");
break;
default:System.out.print("wrong month");
break;
}
}
}
