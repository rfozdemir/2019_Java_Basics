package java_calisma;

public class Testobject {
    public static int stVar=100;
    public int var=200;
    public String toString(){
        return stVar+":"+var;
    }

    public static void main(String[] args) {
        Testobject t1=new Testobject();
        t1.var=300;
        System.out.println(t1);               //100:300
        Testobject t2=new Testobject();
        t2.stVar=300;
        System.out.println(t2);         //300:200


    }





}
