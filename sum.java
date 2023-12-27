/* wap to take input of two numbers and print the sum
 *  @Author: Barkha Arora 500105541 R2142220462
 */

import java.util.Scanner;
public class sum {

    static int summ(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner obj1= new Scanner(System.in);
        Scanner obj2= new Scanner(System.in);
        int a,b;
        System.out.println("enter first number");
        a=obj1.nextInt();
        System.out.println("enter second number");
        b=obj2.nextInt();
        int sum=summ(a,b);

        System.out.println("the sum of two numbers is "+sum);
    }
    
}
