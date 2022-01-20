package algorithmid;
import java.util.Arrays;

public class FibonacciExecutor {

    public long[] fibonacciFor(int num) {
        long[] fibonacciArray = new long[num];
        for(int i = 0; i < num; i++) {
            if(i == 0) {
                fibonacciArray[i] = 0;
            } else if (i == 1) {
                fibonacciArray[i] = 1;
            } else {
                fibonacciArray[i] = ((fibonacciArray[i - 1]) + (fibonacciArray[i - 2]));
            }
        }
        //System.out.println("fibonacciFor\n\t" + Arrays.toString(fibonacciArray));
        return fibonacciArray;
    }

    public long[] fibonacciWhile(int num) {
        long[] fibonacciArray = new long[num];
        int i = 0;
        while (i < num) {
            if(i == 0) {
                fibonacciArray[i] = 0;
            } else if (i == 1) {
                fibonacciArray[i] = 1;
            } else {
                fibonacciArray[i] = ((fibonacciArray[i - 1]) + (fibonacciArray[i - 2]));
            }
            i++;
        }
        //System.out.println("fibonacciWhile \n\t" + Arrays.toString(fibonacciArray));
        return fibonacciArray;
    }

    public long[] fibonacciDoWhile(int num) {
        long[] fibonacciArray = new long[num];
        int i = 0;
        do {
            if(i == 0) {
                fibonacciArray[i] = 0;
            } else if (i == 1) {
                fibonacciArray[i] = 1;
            } else {
                fibonacciArray[i] = ((fibonacciArray[i - 1]) + (fibonacciArray[i - 2]));
            }
            i++;
        } while (i < num);
        //System.out.println("fibonacciDoWhile \n\t" + Arrays.toString(fibonacciArray));
        return fibonacciArray;
    }
}
