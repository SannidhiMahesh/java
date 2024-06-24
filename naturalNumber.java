import java.util.*;
public class naturalNumber {
      public static void main(String[] args)
      {
        int a,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum is:"+sum);
      }
    
}
