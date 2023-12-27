
// import java.lang.Thread;
// import java.lang.Runnable;

// class b implements Runnable{
//     public synchronized void run()
//     {
//         System.out.println("threaddddd");
//     }
// }


// class A extends Thread{
//     public synchronized void run()
//     {
//         //add synchronized word to synchronize the threads running
//         for(int i=0;i<=5;i++)
//         System.out.println("this is a thread "+i);
//     }
// }
// //ovveriding a built in thread method run
// //Invoke the start() method that your class inherited from the Thread class
// public class threads {

//     public static void main(String[] args)
//     {
//         A new1=new A();
//         A new2=new A();
//         new1.start(); //creates a new thread & initiates the run function

//         new2.start(); //two threads run concurrently so the order of printing might be weird
        // new2.start();
        //The java.lang.IllegalThreadStateException is an exception that occurs when you attempt to start a Java thread that has already been started.
        // It is an unchecked exception.


        //CREATING IT USING RUNNABLE INTERFACE
        // b threaddss=new b();
        // Thread a= new Thread(threaddss);
        // a.start();

//     }
    
// }

/**
 * threads
 */

// class A{
//     public synchronized void display()
//     {
//         for(int i=0;i<5;i++)
//         System.out.println("this sis thread"+i);
//     }
//  }
// class B implements Runnable
// {
//     A a1;
//     public B(A a1)
//     {
//         this.a1=a1;
//     }
//     public void run()
//     {
//         a1.display();
//     }
// }
// public class threads {
//     public static void main(String[] args)
//     {
//         A a1= new A();
//         B b2= new B(a1);
//         B b3=new B(a1); 
//         b2.start();

//         // Thread t1= new Thread(b2);
//         // Thread t2= new Thread(b2);
//         // t1.start();
//         // t2.start();

//     }  
// }

/**
 * threads
 */
// class A{
//     synchronized void abc(String abc)
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("yuhuhu");
//         }
//     }
// }
// public class threads {
//     public static void main(String[] args)
//     {
//         A a1=new A();
//         a1.abc("yuhuhu");
//         Thread t1=new Thread(){
//             public void run()
//             {
//                 System.out.println("wejhfewjfb");
//             }
//         };
//         Thread t2=new Thread()
//         {
//             public void run(){
//                 System.out.println("4872384702347");
//             }
//         };
//         t1.start();
//         t2.start();
//     }
// }


/* Write a program for generating 2 threads, one for printing
even numbers and the other for printing odd numbers.
The two threads should be synchronized
Author:barkha arora 500105541
*/
// class NumberPrinter {
//     private int max;
//     private boolean isEvenTurn = true;

//     public NumberPrinter(int max) {
//         this.max = max;
//     }

//     public synchronized void printEven() {
//         for (int i = 2; i <= max; i += 2) {
//             while (!isEvenTurn) {
//                 try {
//                     wait();
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//             System.out.println(Thread.currentThread().getName() + ": " + i);
//             isEvenTurn = false;
//             notify();
//         }
//     }

//     public synchronized void printOdd() {
//         for (int i = 1; i <= max; i += 2) {
//             while (isEvenTurn) {
//                 try {
//                     wait();
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//             System.out.println(Thread.currentThread().getName() + ": " + i);
//             isEvenTurn = true;
//             notify();
//         }
//     }
// }

// public class threads {
//     public static void main(String[] args) {
//         NumberPrinter numberPrinter = new NumberPrinter(10);
//         Thread evenThread = new Thread(() -> numberPrinter.printEven(),
//                 "EvenThread");
//         Thread oddThread = new Thread(() -> numberPrinter.printOdd(),
//                 "OddThread");
//         evenThread.start();
//         oddThread.start();
//     }
// }


/**
 * threads
*/

/**
 * threads
 */

// class f extends Thread{
//         private int x;
//         private String s;
//         public f(int x, String s){
//                 this.x=x;
//                 this.s=s;
//         }
//         public void run(){
//                 for(int i=0;i<5;i++)
//                 {
//                         try{
//                                 System.out.println(s);
//                                 Thread.sleep(x);
//                         }
//                         catch(InterruptedException e){
//                                 System.out.println(e);
//                         }
//                 }
//         }
// }
// public class threads {
//         public static void main(String[] args) {
//                 f threadss=new f(200,"ping");
//                 f threadsss=new f(400,"pong");
                
//                 threadsss.start();
//                 threadss.start();
//         }      
// }

