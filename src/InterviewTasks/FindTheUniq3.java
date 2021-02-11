package InterviewTasks;

import java.util.Arrays;
import java.util.Collections;

public class FindTheUniq3 {
    public static void main(String[] args) {

        System.out.println(uniq("asddddfffggg"));

    }
    public static String uniq (String str){
        String uniq="";


        for(String each:str.split("")){

            uniq+=(Collections.frequency(Arrays.asList(str.split("")),each)==1)?each:"";




        }



        return uniq;
    }





}
