package InterviewTasks;

import java.util.*;

public class SortMapVyValues {


    public static void main(String[] args) {
        String str="acccabbcde";


        Map<Character,Integer>unique=new HashMap<>();


        for(int i=0;i<str.length();i++){
            int count=0;
            for (int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    }
                }
            if (count==1){
                unique.put(str.charAt(i),count);

            }

        }
        System.out.println(unique);




    }







}
