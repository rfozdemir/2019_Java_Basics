package java_calisma;

public class Exception1 {

    public static void main(String[] args)  {

try {
    System.out.println(9/0);
}
        catch (ArithmeticException a){

            System.out.println("catch block");
        }
finally {
    System.out.println("finally block ");
}



try {
    Thread.sleep(2000);
    System.out.println("try block");
}
catch (InterruptedException e){
    System.out.println("catch block");
}

    }






}
