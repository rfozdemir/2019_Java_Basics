package InterviewTasks;

public class FindTheUnique2 {
    public static void main(String[] args) {


        System.out.println(uniq("aabcccdeef"));


    }
public static String uniq(String str){//abbccddd
        String uniq="";
        String [] arr=str.split("");

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count++;
                }

            }
            if(count==1){
                uniq+=arr[i];
            }


        }








        return uniq;

}







}
