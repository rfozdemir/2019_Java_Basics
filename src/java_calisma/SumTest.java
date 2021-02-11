package java_calisma;

public class SumTest {
    public static void doSum(Integer x,Integer y){
       System.out.println("Integer sum is "+ (x+y) );
    }
   public static void doSum(int x,int y){
       System.out.println("int sum is "+ (x+y) );
   }
    public static void doSum(float x,float y){
        System.out.println("float sum is "+ (x+y) );
    }
    public static void doSum(double x,double y){
        System.out.println("double sum is "+ (x+y) );
    }
    public static void doSum(long x,long y){
        System.out.println("long sum is "+ (x+y) );
    }


    public static void main(String[] args) {
       // Integer x=12;
       // Integer y=45;

        //doSum(x,y);
        doSum(12,45);
        doSum((float) 45.0,(float) 45.0);


    }

}
