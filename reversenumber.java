import java.util.*;
public class reversenumber {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("enter a number");
        n=sc.nextInt();
        int rev = 0, rem ;
        while (n != 0){
            rem=n%10;
           // System.out.print(rem+" ");
            rev=rev*10+rem;
            n=n/10;
    }
    System.out.println(rev);
}
}