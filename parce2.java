import java.util.*;
import java.util.Scanner;
public class parce2{
    public static void main(String[] args) {

    int a[]=new int[100];
    Scanner sc =new Scanner(System.in);
    int i;
    a[1]=1;
    a[2]=1;
    int e=2,o=3;
    for(i=3;i<30;i++){
       if(i%2==0){
          a[i]=o;
        o=o*3;
     
       }
       else{
     
         a[i]=e;
        e=e*2;
       
       }
    }
   
     System.out.println("Enter The number:");
     int n=sc.nextInt();
      // for(i=1;i<17;i++)
        //System.out.print(a[i]+",");
    System.out.println("result:"+a[n]);
}
}