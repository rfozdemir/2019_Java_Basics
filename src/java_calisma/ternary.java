package java_calisma;

public class ternary {
    public static void main(String[] args) {

        int x=100;
        int a=x++; //100
        int b=x++; //101
        int c=x++; //101
        int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println(d);








    }



}
