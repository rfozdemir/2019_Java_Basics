package InterviewTasks;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
        System.out.println(reverse2("wxyz"));
    }

    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){

           reverse+=str.substring(i,i+1);
             //reverse+=""+str.charAt(i);
            //reverse+=""+str.toCharArray()[i];
              //reverse+=str.substring(i);   learn the reasons that show nonsense return
        }






        return reverse;
    }
    public static String reverse2(String str){
        String reverse="";

        StringBuffer name=new StringBuffer(str);
        reverse=name.reverse().toString();

         return reverse;
        //return new StringBuffer(str).reverse().toString();
    }


}
