package java_calisma;

public class OraString {
    String s;
    public boolean equals(OraString str){
        return this.s.equalsIgnoreCase(str.toString());
    }
    OraString(String s){
        this.s=s;
    }

}
class ora{
    public static void main(String[] args) {
        String s1="Moon";
        OraString s2=new OraString("Moon")  ;
        System.out.println(s2.s);
        if ((s1=="Moon")&&(s2.equals("Moon"))){
            System.out.println("A");
        }


    }
}