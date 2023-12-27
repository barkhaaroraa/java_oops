// /*java program for writing the name and roll no of 2 students
//   @Author: Barkha Arora 500105541 R2142220462*/


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
        students s1=new students();
        students s2=new students();
        
        s1.insertrecords(111, "Tom Cruise");
        s2.insertrecords(222, "Brad Pitt");

        s1.display();
        s2.display();

    }
}
