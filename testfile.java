// class grandfather
// {
//     int i=4;
//     grandfather()
//     {
//         System.out.println("grandfather class");
//     }
//     final void disp()
//     {
//         System.out.println("grandfather");
//     }
// }

// class father extends grandfather
// {
//     int i=2;
//     father()
//     {
//         System.out.println("father class");
//     }
// }

// class child extends father
// {
//     // int i=2;
//     // int i=super.i;
//     void disp()
//     {
        
//         System.out.println("child class");
//     }
//     child()
//     {
//         System.out.println("child class");
//     }
// }

// class testfile
// {
//     public static void main(String[] args)
//     {
//         father c=new child();
//         System.out.println(c.i);
//         // father f=new father();
//         // c.disp();
//     }
// }

// method overloading

// class shape{
//     int l;
//     int b;
//     int area;

//     shape()
//     {
//         System.out.println("default");
//     }

//     shape(int l,int b)
//     {
//        System.out.println("rectangle");
//        int area=l*b;
//        this.l=l;
//        this.b=b;
//        this.area=area;
//     }

//     shape(int l)
//     {
//         int area=l*l;
//         this.area=area;
//     }

//     shape(shape s)
//     {
//         this.l=s.l;
//         this.b=s.b;
//         int area=l*b;
//         this.area=s.area;
//     }
    
// }

// class testfile
// {
//     public static void main(String[] args)
//     {
//         shape s=new shape(8,9);
//         shape s1=new shape(s);

//         System.out.println(s.area);
//         System.out.println(s1.area);
//     }
// }

// main overloading
// public class testfile {
//     public static void main(String[] args) {
//         System.out.println("Standard main method");
//         // testfile.main("Overloaded main method");
//     }

//     public static void main(String arg) {
//         System.out.println(arg);
//     }
// }


// abstract class class1
// {
//     abstract void disp();
// }

// class class2 extends class1
// {
//     void disp()
//     {
//         System.out.println("class2 abstract");
//     }
// }
// class class3 extends class2
// {
//     void disp()
//     {
//         super.disp();
//         System.out.println("class3 abstract");
//     }
// }
// class testfile
// {
//     public static void main(String[] args)
//     {
//         class3 classs= new class3();
//         classs.disp();
//     }
// }


// interface i1
// {
//     public void disp();
//     public void count(int a);
// }

// class class1 implements i1
// {
//     public void disp()
//     {
//         System.out.println("class1");
//     }
//     public void count(int a)
//     {
//         System.out.println(a);
//     }
// }

// class testfile
// {
//     public static void main(String[] args)
//     {
//         class1 c=new class1();
//         c.disp();
//         c.count(5);
//     }
// }

class testfile
{
    public static void main(String[] args)
    {
        int a=9;
        int b=0;
        try
        {
            divide(a, b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("hello");
    }

    static int divide(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("divide by zero");
        }
        return a/b;
    }
}
