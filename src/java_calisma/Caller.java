package java_calisma;

import java.util.function.Predicate;

public class Caller {
    int x,y;

    public Caller(int x,int y){
        initialize(x,y);


    }
    public void initialize(int x,int y){
        this.x=x*x;
        this.y=y*y;

    }

    public static void main(String[] args) {
        int x=9;
        int y =5;
        Caller id=new Caller(x,y);
        System.out.println(id.x);
        Predicate<Integer>p =(n) ->n%2==0;

    }



}
