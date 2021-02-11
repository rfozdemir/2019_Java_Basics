package java_calisma;
class E1 extends Exception{

}
class E2 extends RuntimeException{

}
public class App {

    public void m1 (){
        System.out.println("m1.Accessed.");

    }
    public void m2(){
        System.out.println("m2.Accessed");
    throw new E2();
    }


    public static void main(String[] args) {
        App obj=new App();
       // obj.m1();
        obj.m2();
    }


}
