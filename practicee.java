import java.util.Arrays;

public class practicee {
    public static void main(String args[])
    {
        String s1="hello";
        String s2= new String("hello").intern();
        // intern basically adds the string in java heap to java string pool
        // where string s1 already exists hence it gives out true after intern 
        // but gives out false without intern. string pool is basically a place where all
        // java string instances are stored and if we declare the same string
        // itd point to the previous instance of the string 

        // System.out.println(s1==s2);
        char ch[]={'h','e','l','l','o','w'};
        Integer x=5;
        System.out.println(ch.toString());
        // wont give the desired result prints hashcode
        System.out.println(x.toString());
        // gives desired result
        System.err.println(Arrays.toString(ch));
        // prints contents of array
        String s3=new String(ch);
        System.err.println(s3);
        // wont accept ' ' any kind of spaces

        String s4=new String(ch,1,1);
        System.err.println(s4);
        // includes first then adds the second constrain
        // ie first character, total number of characters
        //to include in the string, similar to loops
        //error when out of range or negative

        byte ascii[]={65,66,67,69};
        String bytee=new String(ascii);
        System.out.println(bytee);
        //creating string using its ascii value
        System.out.println(bytee.length());
        //concatination
        String x1="jhwekjbwe ";
        // String x1=x1.concat("2"); error
        String x2=x1.concat("uwu");
        System.err.println(x2);
        //adds at the end of th string strings are immutable so
        //cannot update the first string
        String uu=x1+ "added " +9;
        System.out.println(uu);

        String x4="hello"+2+2; //doesnt do math
        String x5="hello"+(2+2); //does maths
        System.err.println(x4);
        System.err.println(x5);

        String s="hello"+"world";
        byte buf[]=s.getBytes();
        //creates an array of string broken down into chars
        //then stores em individually as ascii values
        System.out.println(Arrays.toString(buf));
        System.out.println(s.toCharArray());

        //string comparison
        String h="hello";
        String H="Hello";
        System.out.println(h==H);
        System.out.println(h.equals(H));
        System.out.println(h.equalsIgnoreCase(H));
        System.out.println(h.regionMatches(1, H, 1, 4));
        System.out.println(H.compareTo(h));
        //negative number when false ie H>h positive when true
        System.out.println(h.indexOf("l"));
        System.out.println(h.lastIndexOf("l"));
        //toLowerCase()


        //string buffer mutable form of string
        StringBuffer string_=new StringBuffer("helloworld");
        System.out.println(string_.length());
        System.out.println(string_.capacity());
        //string buffer has capacity of length+16 chars
        //length is the size of string
        string_.setCharAt(2, 'x');
        string_.setLength(5);
        System.out.println(string_);
        string_.append("heheh");
        // String uu=string_.getChars(0, 5,"he",1);

        System.out.println(string_);
        string_.insert(1,474.47);
        System.out.println(string_);
        System.out.println(string_.reverse());
        string_.delete(4,5);
        System.out.println(string_);
        string_.deleteCharAt(0);
        System.out.println(string_);
        string_.replace(0, 1, "yelloww");
        System.out.println(string_);

        //string builder

        StringBuilder sem=new StringBuilder("hello");
        sem.setLength(2);
        System.out.println(sem.length());
        System.out.println(sem.capacity());
        System.out.println(sem);
        sem.append("yuhuuuuuu");
        String ss=sem.substring(0,3);
        
        System.out.println(ss);

        int a = 90;
        Integer b=90;
        if(a==b)
        {
            System.out.println("yes");
        }

    }
}
