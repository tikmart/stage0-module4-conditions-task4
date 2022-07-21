package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void printGreatest(int first, int second) {


        System.out.println(first > second ? first : second);
    }

    public static void main(String[] args) {

        printGreatest(12, -400);
        printGreatest(-400, 1);
    }
}
