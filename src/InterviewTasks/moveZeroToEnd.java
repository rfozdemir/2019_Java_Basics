package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class moveZeroToEnd {

    public static void main(String[] args) {

        int arr[]={5,3,0,4,2,0,4,5,0,5};
        System.out.println(Arrays.toString(move(arr)));




    }
    public static int[] move(int[] arr) {
        int[]result=new int[arr.length];
        ArrayList<Integer>list=new ArrayList<>();
        int countZero=0;
        for(int each:arr){
            list.add(each);
            if(each==0){
                countZero+=1;
            }
        }


        list.removeAll(Arrays.asList(0));
        for( int i=0;i<arr.length-countZero;i++){
            result[i]= list.get(i);
        }

return result;
    }
}
