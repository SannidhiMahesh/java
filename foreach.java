import java.util.Scanner;
class foreach
{
    public static void main(String args[])
    {
       int a[]={10,20,30,40,50,86,90,105};
       int sum=0,avg=0;
       for(int x : a)
       {
         sum+=x;
         avg=sum/5;
         if(x==a[5])
         {
              break;
         }

       }
       System.out.println("sum is:"+ sum);
        System.out.println("avg is"+avg);
    }
}