// 1. Wap in Java to take user input for 3 students 
// 2. Insert name and rollno, then display them
// 3. Write separate functions to insert and display the information
// 4.Program must contain 2 classes
// o/p Enter student name:
//     Enter student roll no:
//     The students present in the database are: 
//     111 Tom
//     222 Brad
//     333 X
// barkha arora 500105541 5/08/23 R2142220462
import java.util.Scanner;
class students{
    int rollno;
    String name;
    void insertrecords(int r,String n)
    {
        rollno=r;
        name=n;
    }
    void display()
    {
        System.out.println(rollno+" "+name+"\n");
    }
}

class teststudent{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        students s1=new students();
        students s2=new students();
        students s3= new students();

        System.out.println("enter roll no student 1");
        int roll1=sc.nextInt();
        System.out.println("enter name of student 1");  
        String name1=sc.next();
        s1.insertrecords(roll1, name1);
        System.out.println("enter roll no student 2");
        int roll2=sc.nextInt();
        System.out.println("enter name of student 2");  
        String name2=sc.next();
        s2.insertrecords(roll2, name2);
        System.out.println("enter roll no student 3");
        int roll3=sc.nextInt();
        System.out.println("enter name of student 3");  
        String name3=sc.next();
        s3.insertrecords(roll3, name3);
        System.out.println("the students in the database are: \n");
        s1.display();
        s2.display();
        s3.display();
        sc.close();

    }
}
