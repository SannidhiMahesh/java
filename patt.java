import java.util.*;
public class patt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=5;int alphabet=65;
        
       // System.out.println("enter the value");
       // n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
           System.out.println("\n");
        
             for(int k=0;k<=i;k++)
           {
              System.out.print((char)(j+65)+" ");
           } 
   
           System.out.println("\n");
           for(int l=0;l<=i;l++)
           {
            System.out.print((char)(j+65)+" ");
           }
           System.out.println("\n");
        }
    }
}
