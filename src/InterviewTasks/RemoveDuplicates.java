package InterviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
       // System.out.println(removed("aaaabbbcccfffsdsadafffasdfd"));
        System.out.println(remove("aaaabbbbbccddddffffggggghhhhjjkjkkkkl"));
    }


public static String removed(String str){

    String nonDup="";

    for (int i=0;i<str.length();i++){

        if(!nonDup.contains(""+str.charAt(i))){   //you can write .substring(i,i+1);

            nonDup+=""+str.substring(i,i+1);
        }

    }

    return nonDup;

    }
public static String remove(String str){
        String remove="";

    Set<String> name=new HashSet<>(Arrays.asList(str.split("")));
        remove=name.toString();

        remove=remove.replace("[","").replace(", ","").replace("]","");



        return remove;
}





}
