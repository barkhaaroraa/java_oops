/*wap in java to demonstrate inheritance
author: barkha arora*/
class grandfather{
    protected String gprop="cycle";
}

class father extends grandfather{
    String fprop="car";
    void display(){
        System.out.println("father has car");
    }
}

class son extends father
{
    String sprop="bike";

    void display()
    {
        System.out.println("son has bike");
    }
}

class inheritance
{
    public static void main(String args[])
    {
        son s= new son();
        System.out.println("son has "+s.sprop);
        System.out.println("father has "+s.fprop);
        System.out.println("grandfather has "+s.gprop);
        s.display();
    }
}