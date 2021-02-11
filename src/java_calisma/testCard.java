package java_calisma;

import day39_JavaReview.Test;

public class testCard {
    void readCard(int cardNo)throws Exception{
        System.out.println("reading card");
    }

    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("checking card");

    }

    public static void main(String[] args) throws Exception  {
        testCard ex =new testCard();
        int cardNo=12344;
        ex.readCard(cardNo);
        ex.checkCard(cardNo);



    }




}
