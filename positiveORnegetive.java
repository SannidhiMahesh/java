import java.util.*;
public class positiveORnegetive {
    public static void main(String[] args)
    {
        int a;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number ");
        a=sc.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if(a==0)
        {
            System.out.println("zero");
        }
        else
        {
            System.out.println("negative");
        }
    }
}
