package recursion;

public class Factorial {
    public static long getFactorial(int n) {
        if(n > 1) {
            long solution = getFactorial(n - 1);
            return n * solution;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(Factorial.getFactorial(6));
    }
}
