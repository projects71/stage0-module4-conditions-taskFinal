package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0){
            System.out.println("division by zero");
            return;
        }

        int n = dividend;

        while (n >= divider) {
            n -= divider;
        }

        System.out.println(n == 0 ? "can be divided completely" : "cannot be divided completely");
    }
}
