package InterviewTasks;

import org.apache.commons.math3.analysis.function.Max;

import java.util.ArrayList;
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(descending(arr)));

    }

    public static int[] descending(int []arr){
        ArrayList<Integer> translater=new ArrayList<>();
        for (int each:arr){

            translater.add(each);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=max(translater);
            translater.remove(Integer.valueOf(arr[i]));

        }

        return arr;


    }



   public static int max(ArrayList<Integer>nums){
       int max=Integer.MIN_VALUE;

       for(int each: nums){
           max= Math.max(each,max);


       }
       return max;
   }






}
