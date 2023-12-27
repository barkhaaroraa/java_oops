/*WAP in Java to create an interface. Inherit the interface and override the method in it 
 * author-barkha 500105541 r2142220462
*/

interface mydisp {
    public void disp();
}

class myclass implements mydisp {
    
    public void disp() {
        System.out.println("hello");
    }
}
class interface1 {
    public static void main(String args[]) {
        myclass m = new myclass();
        m.disp();
    }
}
