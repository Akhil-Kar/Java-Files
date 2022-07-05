public class Main {

    public static int calcFact(int a) {
        int fact = 1;
        for(int i=a; i>=1; i--)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(calcFact(2));
    }
}