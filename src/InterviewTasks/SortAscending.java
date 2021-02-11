package InterviewTasks;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {
        int [] arr={15,45,1,6,8,7};
       arr= sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int [] sort(int []arr){
        //we are not gonna use sort method
        ArrayList<Integer>list= new ArrayList<>();
        for (int each: arr){
            list.add(each);
        }
        for(int i=0;i<arr.length;i++){
           arr[i]=findMin(list);
           list.remove(Integer.valueOf(""+arr[i])); //this is so important

        }
          return arr;
    }

    public static int findMin(ArrayList<Integer> nums){
        int min=Integer.MAX_VALUE;
for(int each:nums){
   // min=Math.min(min,each); //this is special method; you can  use it for finding min
    if(min>each) {
        min = each;
    }
}
        return min;
    }



}
