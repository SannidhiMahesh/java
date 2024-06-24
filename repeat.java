
import java.util.*;
public class repeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 strings");
        String s1 =sc.next();
        String s2=sc.next();
        char arr1[]=s1.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(arr2);
        String res1=new String(arr1);
        String res2=new String(arr2);
        if(res1.equals(res2))
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
