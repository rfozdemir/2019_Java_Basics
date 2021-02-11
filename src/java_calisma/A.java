package java_calisma;

public class A {

    public A() {
        System.out.println("A Constructor");
    }

    public void test() {
        System.out.println("A Method");
    }

    public void test1() {
        System.out.println("A Method1");
    }
}

class B extends A {
    public B() {
        System.out.println("B Constructor");
    }

    public void test() {
        System.out.println("B Method");
    }

    public void test2() {
        System.out.println("B Method1");
    }
}

class C extends B {
    public C() {
        System.out.println("C Constructor");
    }

    public void test() {
        System.out.println("C Method");
    }

    public void test3() {
        System.out.println("C Method1");
    }

    public static void main(String[] args) {
        // A b1=new A();
         A b1= new C();





    }


}