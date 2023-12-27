
class OuterClass
{
    protected int x1 = 10;
    static int x2 = 200;

    class InnerClass1
    {
        protected int x3 = 5;
    }
    class InnerClass2 extends InnerClass1
    {
        protected int x4 = 2;
    }
    interface InnerA
    {
        int x5 = 100;
        int x6 = x2;
        void show();
    }
}
class XClass extends OuterClass
{
    void disp()
    {
        System.out.println("x1 is: "+x1);
    }
}
class InterfaceClass implements OuterClass.InnerA
{
    public void show()
    {
        System.out.println("x5 via interface is: "+x5);
        System.out.println("x2 via interface is: "+x6);
    }
}
public class NestedClass
{
    public static void main (String[] args)
    {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass1 myInner1 = myOuter.new InnerClass1();
        OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();

        System.out.println("x1 is: "+myOuter.x1);
        System.out.println("x2 is: "+myOuter.x2);
        System.out.println("x3 is: "+myInner1.x3);
        System.out.println("x4 is: "+myInner2.x4);
        System.out.println("Checking inner inheritance, x3 is: "+myInner2.x3);

        XClass xc1 = new XClass();
        xc1.disp();

        InterfaceClass ic = new InterfaceClass();
        ic.show();
    }
}
