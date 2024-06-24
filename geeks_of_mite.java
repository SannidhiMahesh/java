import java.util.*;
public class geeks_of_mite {    
    public static void main(String[] args) {    
        String string = "geek from mite";    
        int count;    
           
        //Converts the string into lowercase    
        string = string.toLowerCase();    
           
        //Split the string into words using built-in function    
        String words[] = string.split("");    
           
        System.out.println("The  words in a given string : ");    
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    words[j] = "0";    
                }    
            }    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }   
        for(int i=0;i<words.length;i++)
        {
             for(int j=i+1;j<words.length+1;j++)
             {
                String substring=string.substring(i,j);
                System.out.println(substring);
             }
        } 
    }    
}    