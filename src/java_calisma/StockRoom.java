package java_calisma;

public class StockRoom {
    private static int stock=10;
    static int qty;
public  void purchase(int qty){
    stock+=qty;
    this.qty=qty;
}
    public void sell(int qty){
    stock-=qty;
    this.qty=qty;
        }
    public static void printStock(String Action){
        System.out.println(Action+ ":" + qty +" items.Stock in Hand: "+ stock  );
        }

    public static void main(String[] args) {
        StockRoom k1= new StockRoom();
    k1.sell(10);
        k1.printStock("Sell");
        k1.purchase(25);
        k1. printStock("purchase");
        k1.purchase(25);
        k1. printStock("purchase");




    }




}
