package InterviewTasks;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Map;
        import java.util.stream.IntStream;

public class EnoughIsEnough {

    public static void main(String[] args) {
        int[] b= {20,37,20,21};

        System.out.println(Arrays.toString(b));




    }
    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        Map<Integer, Integer> instances = new HashMap<>();

        return IntStream.of(elements)
                .filter(motif -> instances.merge(motif, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }

    /*public static ArrayList<Integer>deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
     //  int  []deleted=new int [elements.length];
        ArrayList<Integer> del=new ArrayList();
        ArrayList<Integer> a=new ArrayList();
        for (int each:elements) {
            del.add(each);
        }

        int j=0;
        for (int i=0;i<del.size();i++){
            int count=0;
            for ( j=0;j<del.size();j++);{

                if(del.get(i)==del.get(j)){
                    count++;

                }
            }
            if(count<=maxOccurrences){

                a.add(del.get(i));

            }

        }
       // int  []deleted=new int[a.size()-1];

      //  for (int i=0;i<a.size();i++) {
           // deleted[i]=(int)a.get(i);









        return a;
    }


*/






}
