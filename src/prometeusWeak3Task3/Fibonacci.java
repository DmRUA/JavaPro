package prometeusWeak3Task3;

/**
 * Created by DmRG on 08.03.2017.
 */
public class Fibonacci {
    public long getNumber(int position){
        if (position > 0 ) {
            position = position - 2;
            int i=0;
            long sum_fib = 1;
            long a = 1, b = 1;
            while(i++ < position){
                sum_fib = a + b;
                a = b;
                b = sum_fib;
            }
            return sum_fib;
        } else return -1;

    }
}