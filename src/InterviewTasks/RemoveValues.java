package InterviewTasks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveValues {

    //TODO: remove values greater  than 100

    public static void main(String[] args) {
        int [] x={4,45,250,125,46,82,56,325,14};
      //  System.out.println(result(x));

       // System.out.println(result2(x));
        System.out.println(result3(x));
    }

    public static ArrayList<Integer> result (int[]arr){
        ArrayList<Integer>result=new ArrayList();
        for (int each:arr) {
            result.add(each);
        }
        result.removeIf(p->p>100);
        return result;
    }
public static ArrayList<Integer> result2(int[]arr){

        ArrayList<Integer> result2=new ArrayList<>();
        ArrayList<Integer>result3=new ArrayList<>();
    for (int each:arr) {
        result2.add(each);
    }
    for (int each:result2) {

        if (each<100){
            result3.add(each);
        }

    }
result2=result3;


       return result2;
}

    public static ArrayList<Integer> result3(int[]arr){

       ArrayList<Integer>result3=new ArrayList<>();
        for (int each:arr) {
            result3.add(each);
        }
        Iterator<Integer> it=result3.iterator();

        while(it.hasNext()){
            if(it.next()>100){
                it.remove();
            }

        }



        return result3;
    }










}
