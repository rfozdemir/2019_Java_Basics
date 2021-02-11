package java_calisma;

 class caller {

    public void init(){
        System.out.println("intialized");
    }
    public void start(){
        init();
        System.out.println("started");
    }





}


 public class testcall{

    public static void main(String[] args) {
        caller call= new caller();
        call.start();
        call.init();


    }

}