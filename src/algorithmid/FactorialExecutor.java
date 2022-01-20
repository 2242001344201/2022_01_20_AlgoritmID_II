package algorithmid;
import java.util.Arrays;

public class FactorialExecutor {

    public long[] factorialFor(int num) {
        long[] factorialArray = new long[num];
        for(int i = 0; i < num; i++) {
            if(i < 2) {
                factorialArray[i] = 1;
            } else if(i == 2) {
                factorialArray[i] = 2;
            } else {
                factorialArray[i] = (long)i * factorialArray[i-1];
            }
        }
        //System.out.println("factorialFor() \n\t" + Arrays.toString(factorialArray));
        return factorialArray;
    }

    public long[] factorialWhile(int num) {
        long[] factorialArray = new long[num];
        int i = 0;
        while (i < num) {
            if(i < 2) {
                factorialArray[i] = 1;
            } else if(i == 2) {
                factorialArray[i] = 2;
            } else {
                factorialArray[i] = (long)i * factorialArray[i-1];
            }
            i++;
        }
        //System.out.println("factorialWhile() \n\t" + Arrays.toString(factorialArray));
        return factorialArray;
    }

    public long[] factorialDoWhile(int num) {
        long[] factorialArray = new long[num];
        int i = 0;
        do {
            if(i < 2) {
                factorialArray[i] = 1;
            } else if(i == 2) {
                factorialArray[i] = 2;
            } else {
                factorialArray[i] = (long)i * factorialArray[i-1];
            }
            i++;
        } while (i < num);
        //System.out.println("factorialDoWhile() \n\t" + Arrays.toString(factorialArray));
        return factorialArray;
    }
}
