package InterviewTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {


        int []arr={1,5,6,2};
        System.out.println(max(arr));
        System.out.println(max2(arr));
    }

    public static int max(int[]numbers){  //SOLUTION 1
        int max=0;
        Arrays.sort(numbers);
        max=numbers[numbers.length-1];

    return max;
    }

    public static int max2(int [] numbers){
        int max=Integer.MIN_VALUE;
        for (int each: numbers){
            if(each>max){
                max=each;
            }

        }



        return max;
    }


}
