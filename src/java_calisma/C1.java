package java_calisma;
class C2{
    public void displayC2(){
        System.out.println("C2");
    }
}
interface I{
    public void display();

}

public class C1 extends C2 implements I {
 @Override
    public void display() {
     System.out.println("C1");
    }



    public static void main(String[] args) {
     C2 obj1 =new C1();
     I obj2 = new C1();

        obj1.displayC2();
       obj2.display();

       C2 s=  (C2) obj2;

        I t= (I) obj1;

       s.displayC2();
       t.display();

    }

}
