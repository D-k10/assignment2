class q3
{
public Static void main(String a[])
{
int i,j;
if(a.length<2)
{
System.out.println("less commandline argument");
}
int n1=Integer.parseInt(a[0]);
int n2=Integer.parseInt(a[1]);
System.out.println("primenumbers between"+n1+"and"+n2+"are");
for(i=n1;i<n2;i++)
{
for(j=2;j<i;j++)
{
intn=i%j;
if(n==0)
{
break;
}
}
if(i==j)
{
System.out.println(i);
}
}
}
}