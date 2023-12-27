/*WAP to print the fibonacci series till 70
 @Author: Barkha Arora 500105541 R2142220462
*/

public class fibonacci {
    public static void main(String args[]) {
        System.out.println("The fibonaaci series upto 70 is");
        int n1=1,n2=1;
        System.out.println(n1);
        while (n2<70)
        {
            System.out.println(n2);
            n2=n1+n2;
            n1=n2-n1;
            if (n2%2==0)
            {
                System.out.print("*");
            }
        }
        System.out.println("The fibonacci series ends here");
    }
}
