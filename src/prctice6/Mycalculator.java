package prctice6;

public class Mycalculator {

    public long power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new ArithmeticException("either n" +
                    "or p is negative");
        } else if (n == 0 || p == 0) {
            throw new ArithmeticException("either n" +
                    "or p i s zero");
        } else {
            return (long) Math.pow(n,p);
        }
    }
}
