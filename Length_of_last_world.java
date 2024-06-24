//find length of the last word of the given string
import java.util.*;
public class Length_of_last_world {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str =sc.nextLine();
        String s[] = str.split(" ");  
        int i,j,len,count=0;
        //len=s.length();
        for (i=s.length-1 ;i>=s.length;i--)   
        {
            count++;
        }
        System.out.println(count);
        
    }
    
}
