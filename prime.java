import java.util.*;
public class prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        boolean prime=true;
        System.out.println("enter the number");
        a=sc.nextInt();
        int i;
        for (i = 2 ; i <=a/2 ; ++i )
        {
           if(a%i==0)
           {
              prime =false;
           }

       }
       if(prime==true)
       {
        System.out.println("prime");
       }
       else{
        System.out.println("not a prime");
       }
       



}
}
