package java_calisma;

public class D {
    public void method1(){
        System.out.println("D");
    }
}class E extends D{
    public void method1(){
        System.out.println("E");
    }

}
class F extends D{
    public void method1(){
      System.out.println("F");
   }

    public static void main(String[] args) {

        D b1=new F();
        D b2=new F();
        D b3= (F)b2;
          b1=(D) b2;
        b1.method1();
        b3.method1();




    }

}