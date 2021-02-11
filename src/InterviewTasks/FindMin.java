package InterviewTasks;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
    int []arr={42,2,46,64,12};
        System.out.println(min(arr));

    }

    public static int min (int []numbers){
        int min=Integer.MAX_VALUE;
        for (int each:numbers) {
            if(min>each){
                min=each;
            }
        }
        /*First solution
        Arrays.sort(numbers);
        min=numbers[0]; */



        return min;
    }

}
