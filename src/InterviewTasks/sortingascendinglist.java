package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortingascendinglist {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(Arrays.asList(9,9,8,6,6,8));
        System.out.println(sorting(arr));                                           // 9,1,7,4,6,8
    }

    public static List<Integer> sorting(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

for(int i=0;i<list.size();i++){

            for(int j=0;j<list.size();j++){
     if(list.get(i)<list.get(j)){
          int temp=list.get(i);
         list.set(i,list.get(j));
         list.set(j,temp);
     }

    }

}

result.addAll(list);
        return result;


    }
}