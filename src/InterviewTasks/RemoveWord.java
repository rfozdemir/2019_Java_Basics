package InterviewTasks;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class RemoveWord {
    public static void main(String[] args) {
        String[] arr = {"adam", "michael", "jane", "mike", "jane"};
        String s = "jane";
        // System.out.println(result(arr, s));
      //  System.out.println(result2(arr, s));
        System.out.println(result3(arr,s));

    }


    public static ArrayList<String> result(String[] arr, String str) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
         result.removeAll(Arrays.asList(str));
        //result.remove(str);

        return result;
    }

    public static ArrayList<String> result2(String[] arr, String str) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        Predicate<String> remove = each -> each.equals(str);
        result.removeIf(remove);

        return result;

    }


    public static ArrayList<String> result3(String[] arr, String str) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(arr));
        Iterator<String> it = result.iterator();

        while(it.hasNext()){
            if(it.next().equals(str)){

                it.remove();

            }

        }



        return result;
    }


}