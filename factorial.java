/*WAP to take user input and print the factorial of a number 
 @Author: Barkha Arora 500105541 R2142220462
*/

import java.util.Scanner;
public class factorial {
    static int factorial(int n)
    {
        if(n==0|n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String args[]) {
        
        Scanner ob1=new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n=ob1.nextInt();
        int fact=factorial(n);
        System.out.println("The factorial of "+n+" is "+fact);
    }
    
}
