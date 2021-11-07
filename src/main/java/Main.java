public class Main {

    public static void main ( String[] args ) throws InterruptedException {

        Shop shop = new Shop ();

        Thread thread1 = new Thread (null, shop::calculateRevenue, " Магазин 1 ");
        Thread thread2 = new Thread (null, shop::calculateRevenue, " Магазин 2 ");
        Thread thread3 = new Thread (null, shop::calculateRevenue, " Магазин 2 ");

        thread1.start ();
        thread2.start ();
        thread3.start ();

        thread1.join ();
        thread2.join ();
        thread3.join ();

        System.out.println ("\nРeзультат = " + shop.stat);
    }
}