import java.util.*;
public class plus_Minus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0,neg=0,zero=0;
        float x,b,c;
        int p=0,z=0,ne=0;
        System.out.println("enter totl numbers");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array numbers");
        
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                p= pos++;
            }
            if(a[i]==0)
            {
                 z=zero++;
            }
            if(a[i]<0)
            {
                ne=neg++;
            }
        }
        x=p/n;
        b=z/n;
        c=n/n;
        System.out.println(x);
        System.out.println(b);
        System.out.println(c);


    }
}
