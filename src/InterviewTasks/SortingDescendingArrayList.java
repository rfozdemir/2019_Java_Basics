package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingDescendingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> name=new ArrayList<>(Arrays.asList(5,4,6,9,2,7));
        System.out.println(sort(name));

    }
    public static ArrayList<Integer>sort(ArrayList<Integer>arr){
        ArrayList<Integer>result=new ArrayList<>();
        for(int each:arr){
            result.add(each);
        }
            for(int i=0;i<result.size();i++){
                for(int j=0;j<result.size();j++){
                    if(result.get(i)>result.get(j)){
                        int temp=result.get(i);
                        result.set(i,result.get(j));
                        result.set(j,temp);
                                        }


                }
            }


        return result;
    }


}
