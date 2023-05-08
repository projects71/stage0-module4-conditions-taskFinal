package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        boolean zero = x == 0 && y == 0;
        boolean first = x > 0 && y > 0;
        boolean second = x < 0 && y > 0;
        boolean third = x < 0 && y < 0;

        if(zero)
            System.out.println("zero");
        else if (first)
            System.out.println("first");
        else if (second)
            System.out.println("second");
        else if (third)
            System.out.println("third");
        else
            System.out.println("fourth");
    }
}
