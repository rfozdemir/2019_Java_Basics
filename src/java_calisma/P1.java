package java_calisma;

public class P1 {}
class P2 extends P1 implements I1{


    public static void main(String[] args) {
        P1 obj=new P1();
        P2 obj2=new P2();
        boolean r1=obj instanceof P2;
        boolean r2=obj2 instanceof P1;
        System.out.println(r1 +""+ r2);
    }
}
interface I1{}
