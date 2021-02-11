package InterviewTasks;

public class FrequencyOfCharacters {
    public static void main(String[] args) {



        System.out.println( nonDup("aaabbbvvvcccccceeefffmmmuuuuuuuu"));
    }


public static String nonDup(String str){ // Solution 1
 String nonDup="";
    for (int i =0;i<str.length();i++){

        if (!nonDup.contains(""+str.charAt(i))){
         nonDup+=""+str.charAt(i);
        }
    }
String expectedResult="";
    //abvc
    //aaabbbvvvcccccc
     for (int i=0;i<nonDup.length();i++){
         int count=0;
         for (int j=0;j<str.length();j++){

             if(nonDup.substring(i,i+1).equals(str.substring(j,j+1))){
                 count++;
             }
         }
         expectedResult+=nonDup.substring(i,i+1)+""+count;
     }
return expectedResult;

    }









}
