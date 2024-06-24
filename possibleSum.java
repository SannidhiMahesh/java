import java.util.*;
public class possibleSum {
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          int target ,n,i,a=0,b=0;
          System.out.println("enter the total number");
           n =sc.nextInt();
          System.out.println("enter the array values");
          int num[]= new int[n];
          for(i=0;i<n;i++)
          {
            num[i]=sc.nextInt();
 
          }
          System.out.println("enter the target value");
          target=sc.nextInt();
          for(i=0;i<n;i++)
          {
            for(int j=i+1;j<n;j++)
            {
                if(num[i]+num[j]==target)
                {
                    //a=i;
                    //b=j;
                    System.out.println("("+i+ " "+j+")");
                }
            }
           
          }
         // System.out.println("("+a+ " "+b+")");
          
          
    }
}

