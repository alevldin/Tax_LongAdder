import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop {
    LongAdder stat = new LongAdder ();
    static final int SIZE = 3;
    static final int MAXIMUM = 100;

    public void calculateRevenue () {
        Random random = new Random ();
        long[] calculate = new long[ SIZE ];
        for (int i = 0; i < SIZE; i++) {
            calculate[ i ] = Math.abs (random.nextInt (MAXIMUM));
            stat.add (calculate[ i ]);
        }
    }
}