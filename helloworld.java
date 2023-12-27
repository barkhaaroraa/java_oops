/*WAP to print Hello world
 @Author: Barkha Arora 500105541 R2142220462
*/
import java.util.Scanner;
class myName
{
    public static void main(String args[])
    {
        Scanner myobj=new Scanner(System.in);
        String username;
        System.out.println("enter name");
        username=myobj.nextLine();
        System.out.println("hey there "+username);
        myobj.close();
    }
}