class logicaloperator
{
 public static void main(string arg[])
   {
     boolean a=true;
     boolean b=true; 
     boolean c=a|b;
     boolean d=a&b;
     boolean e=a^b;
     boolean f=(!a&b);
   System.out.println("boolean expression");
   System.out.println("a="+a);
   System.out.println("b="+b);
   System.out.println("a|b="+c);
   System.out.println("a&b="+d);
   System.out.println("a^b="+e);
   System.out.println("!a&b)="+f);
   }
  }