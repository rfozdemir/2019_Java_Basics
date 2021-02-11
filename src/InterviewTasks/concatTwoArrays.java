package InterviewTasks;

import java.util.Arrays;

public class concatTwoArrays {
    public static void main(String[] args) {

        int[]arr={0,1,2};
        int[] arr2={3,4,5,6};
        String str= Arrays.toString(result(arr,arr2));
        System.out.println(str);

    }
    public static int [] result(int [] arr,int []arr2){
        int [] result=new int [arr.length+arr2.length];
        int i=0;
        for(int each:arr){
            result[i]=each;
            i++;
            }

for (int each: arr2){
    result[i]=each;

    i++;
}
return result;



    }



}
