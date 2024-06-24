import java.util.*;
public class GreatestOfThree {
   public static void main(String[] args)
   {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 3 numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c)
    {
        System.out.println(" greater is" + a);
    }
    else if(b>a && b>c)
    {
        System.out.println(" greater is"+ b);
    }
    else
    {
        System.out.println(" greater is"+c);
    }
   }
}
