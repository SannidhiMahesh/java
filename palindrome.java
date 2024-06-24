import java.util.*;
public class palindrome 
{
     public static void main(String[] args)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the String");
          String str=sc.nextLine();
          String rev="";
          int length=str.length();
          for(int i=length-1;i>=0;i--)
          {
            rev=rev+str.charAt(i);
          }
          if(str.equals(rev))
          {
            System.out.println("yes");
          }
          else{
            System.out.println("no");
          }
     }    
}
