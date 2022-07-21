package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void printGreatest(int first, int second, int third) {

        int result;
        result = first >= second ? first : second;
        result = result >= third ? result : third;
        System.out.println(result);
    }

    public static void main(String[] args) {
        printGreatest(1,2,3);
        printGreatest(1,0,1);
        printGreatest(1,9,1);

    }
}
