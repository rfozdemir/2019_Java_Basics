package InterviewTasks;

import java_calisma.A;

import java.lang.reflect.Array;
import java.util.*;

public class SameLetters {
    public static void main(String[] args) {

    //    char[]name1={'a','d','f','b','c'};

        System.out.println(sameletters("abccd","acdcbfgfh"));
        System.out.println(result("csa","cascas"));

    }

    public static boolean sameletters(String str1, String str2){

        char [] ch=str1.toCharArray();
        char [] ch2=str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);


   // String a1=Arrays.toString(ch);
  //  String a2=Arrays.toString(ch2);

        String a1="";
          String a2="";
          for (char each: ch ){
              a1+=each;
          }
        for (char each: ch2     ) {
            a2+=each;
        }


    return a1.equals(a2);
    }
public static boolean result(String str1,String str2){
        String[]a=str1.split("");
        String []b=str2.split("");


      //  List<Character> a=new ArrayList<Character>(Arrays.asList(arr));


    SortedSet<Character> name1=new TreeSet(Arrays.asList(a));
    SortedSet<Character> name2=new TreeSet(Arrays.asList(b));
str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
boolean t=str1.equals(str2);


        return t;// name1.toString().equals(name2.toString());



}


}
