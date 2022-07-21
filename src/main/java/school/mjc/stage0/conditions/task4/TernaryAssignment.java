package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void assignAndPrintBasedOnWhichBigger(int first, int second) {

        System.out.println(first > second ?  10 : -10);
    }

    public static void main(String[] args) {
        assignAndPrintBasedOnWhichBigger(10,9);
        assignAndPrintBasedOnWhichBigger(10,19);
    }
}
