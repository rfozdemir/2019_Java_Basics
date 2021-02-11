package java_calisma;

public class CD {
int r;
CD(int r){
    this.r=r;
}
 CD (double a, double b){
     System.out.println(" another constructor");
             }
}



class DVD extends CD{
int c;

DVD (int r, int c){
    super(r);

//super.r=24;
    this.c=c;

}


    public static void main(String[] args) {
         DVD dvd =new DVD(10,20);

        System.out.println(dvd.r);

    }

}