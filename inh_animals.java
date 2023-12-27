// WAP to show inheritance in mammals and birds, display the number of eyes and limbs.
// name barkha arora 500105541
class mammals{
    int limbs=4;
    int eyes=2;
}

class birds extends mammals{
    int wings=2;
}
public class inh_animals {
    public static void main(String args[])
    {
        mammals m= new mammals();
        birds b=new birds();

        System.out.println("no. of wings of birds="+b.wings);
        System.out.println("no. of eyes of birds="+b.eyes);
        System.out.println("no. of limbs of mammals="+m.limbs);
        System.out.println("no. of eyes of mammals="+b.eyes);

        
    }
    
}
