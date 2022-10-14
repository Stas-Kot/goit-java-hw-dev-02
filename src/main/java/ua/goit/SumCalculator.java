package ua.goit;

public class SumCalculator {
    public int sum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Input should be > 0");
        }
        int res = 0;
        int i = 0;
        while (i <= n) {
            res += i;
            i++;
        }
        return res;
    }
}
