package algorithmid;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Algorithm algorithm1 = new Algorithm();
        //algorithm1.choiceOfOption(1, 1,10);
        System.out.println("1, 1, 10 - expected [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]\n" +
                "                    " + Arrays.toString(algorithm1.choiceOfOption(1, 1, 10)));
        Algorithm algorithm2 = new Algorithm();
        //algorithm2.choiceOfOption(1, 2, 10);
        System.out.println("1, 2, 10 - expected [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]\n" +
                "                    " + Arrays.toString(algorithm2.choiceOfOption(1, 2, 10)));
        Algorithm algorithm4 = new Algorithm();
        //algorithm4.choiceOfOption(2, 1, 8);
        System.out.println("2, 1, 7  - expected [1, 1, 2, 6, 24, 120, 720, 5040]\n" +
                "                    " + Arrays.toString(algorithm4.choiceOfOption(2, 1, 8)));
    }
}
