/*WAP to print Hello world
 @Author: Barkha Arora 500105541 R2142220462
*/
// import java.util.Scanner;
// class myName
// {
//     public static void main(String args[])
//     {
//         Scanner myobj=new Scanner(System.in);
//         String username;
//         System.out.println("enter name");
//         username=myobj.nextLine();
//         System.out.println("hey there "+username);
//         myobj.close();
//     }
// }

// import outerclass.innerclass;

/**
 * first
 */
// class OuterClass {
//     int x = 1;
//     public void disp() {
//         System.err.println("message from outer" + x);
//     }

//     class InnerClass {
//         int x2 = 5;
//         public void disp(int x)
//         {
//             x=x2;
//             System.out.println("messafe from nested");
//         }
//     }
//     class DerivedClass extends InnerClass{
//         int x2=8;
//         public void disp(int x)
//         {
//             x=x2;
//             System.out.println("message from derived");
//         }
        
//     }

//     class InnerClass2 extends InnerClass {
//         int x2 = 99;
//     }

    
// }

// public class first {
//     public static void main(String[] args) {
//         OuterClass c1 = new OuterClass();
//         c1.disp();

//         OuterClass.InnerClass2 c2 = c1.new InnerClass2();
//         c2.disp(500);
//         OuterClass.DerivedClass D=c1.new DerivedClass();
//         D.disp(6);
//     }
// }

// 

/**
 * first
 */
// import java.util.*;
// public class first {

//     public static void main(String[] args) {
//         List<Integer> list1=new ArrayList<Integer>();

//         list1.add(5);
//         list1.add(8);
//         list1.add(1);
//         list1.add(9);
//         list1.add(0);
        
        
//         List<Integer> l3=new ArrayList<Integer>();
//         l3.add(0,292);
//         l3.add(1,223);
//         l3.add(1,34);
//         Iterator<Integer> I1=l3.iterator();
//         while(I1.hasNext())
//         {
            
//             System.out.println(I1.next());
//         }
//         list1.addAll(l3);
//         Iterator<Integer> I=list1.iterator();
//         while(I.hasNext())
//         {
            
//             System.out.println(I.next());
//         }


        
//     }
// }

/**
 * first
 */
class outer{
    outer(){
        System.out.println("dksbfkjsdfb");
    }
    static class Innerfirst {
        Innerfirst()
        {
            System.out.println("constructr");
        }
    
        
    }
}
public class first {
    public static void main(String[] args) {
        outer o= new outer();
        outer.Innerfirst inn=new outer.InnerClass();
    }

    
}