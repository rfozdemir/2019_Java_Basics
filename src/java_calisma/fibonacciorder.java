package java_calisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fibonacciorder {
    public static void main(String[] args) {
        System.out.println(order(10));
    }

    public static List<Integer> order(int num){
        ArrayList<Integer> order=new ArrayList<>();
        int x=0;
        int y=1;
        int result=0;
             // 0  1  1  2  3  5  8  13  21  34  55  89
             //       1  2  3  4  5   6   7   8   9  10
        order.addAll(Arrays.asList(0,1));
        for(int i=0; i<num-2;i++){
          result=x+y;
          x=y;
          y=result;

          order.add(result);


 }
           return order;
    }
    public static int result (int n){

        int result=0;
        int x=0;
        int y=1;
        int total=0;
        for (int i=0;i<n;i++){

            result=x+y;
            x=y;
            y=result;
            total+=result;

        }


        return result;
    }

}