// program to print n natural numbers?
import java.util.*;
public class NaturalNumbers{
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            sum=sum+i;
        }
         System.out.println(sum);

}
}