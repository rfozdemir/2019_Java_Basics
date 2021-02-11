package InterviewTasks;

public class factorialNumber {

    public static void main(String[] args) {
        System.out.println(total(3));
    }

    public static int total(int n){

        int result=1;
        for(int i=1;i<=n;i++){

            result=result*i;



        }

        return result;

    }


}
