import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        double a = 5;
        String word = "hello";
        printThreeWords();
        System.out.println("------");
        checkSumSing();
        System.out.println("------");
        printColor();
        System.out.println("------");
        compareNumbers();
        System.out.println("------");
        System.out.println(checkNumbers(a));;
        System.out.println("------");
        compareValue(a);
        System.out.println("------");
        System.out.println(checkValue(a));
        System.out.println("------");
        printWord(a, word);
        System.out.println("------");
        System.out.println("Введите год: ");
        Scanner scr = new Scanner(System.in);
        int b = scr.nextInt();
        System.out.println(checkYear(b));
        scr.close();



    }

    private static void printThreeWords () {
        System.out.println("""
               Orange
               Banana
               Apple""");
    }

    private static void checkSumSing () {
        int a = -2;
        int b = 5;
        a=a+b;
        String massage;
        if (a <= 0 ){
            massage = "Сумма позитивна";
        } else massage = "Сумма негативна";
        System.out.println(massage);
    }

    private static void printColor() {
        int a;
        a = 5;
        String massage;
        if (a <= 0)
            massage = "Червоне";
        else if (a > 0 && a <=100)
            massage = "Жовтий";
        else
            massage = "Зелений";
        System.out.println(massage);
    }

    private static void compareNumbers() {
        int a = -2;
        int b = 5;
        if (a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
    private static boolean checkNumbers(double a) {
        boolean c;
        c = a >= 10 && a < 20;
        return c;
    }
    private static void compareValue(double a) {
        String massage;
        if (a >= 0)
            massage = ("число додатнє");
        else
            massage = ("число від'ємне");
        System.out.println(massage);
    }
    private static boolean checkValue(double a) {
        boolean c;
        c = a >= 0;
        return c;
    }
    private static void printWord(double a, String word) {
        for (int b = 0; b < a; b++) {
            System.out.println(word);
        }
    }
    private static boolean checkYear (int year) {
        int a = year / 4;
        double b = (double) year/4;
        int c = year/100;
        double d = (double) year/100;
        int e = year/400;
        double f = (double) year/400;
        if (a != b) {
            return false;
        } else return a != b || c != d || e == f;
    }
}