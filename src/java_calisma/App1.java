package java_calisma;
class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class App1 {
    public static void main(String[] args)  {
        App1 obj=new App1();
        try {
            obj.open();
            obj.process();
        }
        catch(Exception e){
            System.out.println("completed");
        }
    }
    public void process() throws Exception{
        System.out.println("Processed");
    throw new LogFileException();
    }
public void open(){
    System.out.println("Opened");
       // throw new AccessViolationException();
}
}
