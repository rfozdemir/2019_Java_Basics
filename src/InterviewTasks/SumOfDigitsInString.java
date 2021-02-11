package InterviewTasks;

public class SumOfDigitsInString {

    public static void main(String[] args) {
        System.out.println(sum("12345"));


    }



    public static int sum (String str){
        int sum=0;
        char [] arr=str.toCharArray();

        for(char each: arr ){
            if(Character.isDigit(each)){
                //sum+=Integer.valueOf(""+each);
                sum+=Integer.parseInt(""+each);
            }
        }



        return sum;
    }

}
