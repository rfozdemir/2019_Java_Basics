package InterviewTasks;

public class Armstrong {
    public static void main(String[] args) {
        //153, 1634,

        System.out.println(ArmStrongNumber(1634));
        System.out.println(Math.pow(3,3));
    }

    public static boolean ArmStrongNumber(int num) {
String abc=String.valueOf(num);
int x=abc.length();

        int a = 0;
        int b = 0;
        int c = num;

        while (num > 0) {

            a = num % 10;
            num = num / 10;

            b =(int) ( b + Math.pow(a,x));

        }

        if (c == b) {
            return true;
        } else
            return false;


    }
}