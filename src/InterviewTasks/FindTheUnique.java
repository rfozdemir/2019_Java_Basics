package InterviewTasks;

public class FindTheUnique {
    public static void main(String[] args) {


        System.out.println( uniq("aaaabbbcdddg") );

    }


public static String uniq(String str){    // abbbc  ---->def

  String uniq="";
  String nonDup="";

for (int i=0; i<str.length();i++){

    if(!nonDup.contains(""+str.charAt(i))){
        nonDup+=""+str.charAt(i);
    }

}

String ch="";


for(int i=0;i<nonDup.length();i++){
    int count=0;
    for (int j=0;j<str.length();j++){
        if (nonDup.substring(i,i+1).equals(str.substring(j,j+1))){
            count++;
        }
    }
    if (count==1){
        uniq+=""+nonDup.charAt(i);
    }

}












    return uniq;
}


}
