//anagram
import java.util.*;
public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the string 1");
        String s1=sc.nextLine();
        System.out.println("enter the string 2");
        String s2=sc.nextLine();
        if((s1!=null)&&(s2!=null)){
            if ((is Anagram(s1,s2))==true ){
                System.out.print("\n"+"the strings are anagrams of each ");
            }
            else{
                System.out.print("\n"+ "the strings aren't anagrams");

            }

    }
}
}
    

