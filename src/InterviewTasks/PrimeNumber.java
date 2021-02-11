package InterviewTasks;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(5));
        System.out.println(primeNumber(9));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(0));
    }
    public static boolean primeNumber(int num) {

        boolean result = false;

        if(num <= 1) {
            return result;
        }
        if(num==2){
            return true;
        }
        else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;

                }

            }
        }


        return true;
    }
}
