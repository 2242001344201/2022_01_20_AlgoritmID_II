package algorithmid;

public class Algorithm {

    FibonacciExecutor fibonacci = new FibonacciExecutor();
    FactorialExecutor factorial = new FactorialExecutor();

    public long[] choiceOfOption(int a, int b, int n) {
        long[] result = new long[n];
        if(a == 1) // if (a == 1) вычисление ряда Фибоначчи
            if (b == 1) result = fibonacci.fibonacciWhile(n);
            else if (b == 2) result = fibonacci.fibonacciDoWhile(n);
            else result = fibonacci.fibonacciFor(n);
        if (a == 2) { // if (a == 2) вычисление факториалов
            if (b == 1) result = factorial.factorialWhile(n);
            else if (b == 2) result = factorial.factorialDoWhile(n);
            else result = factorial.factorialFor(n);
        }
        return result;
    }
}
