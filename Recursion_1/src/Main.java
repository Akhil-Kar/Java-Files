public class Main {

//    Print 1 to 10
//    public static void  printNum(int n) {
//        if (n == 0)
//            return;
//        System.out.println(n);
//        printNum(n-1);
//        System.out.println(n);
//    }

//    Print sum of Natural Numbers
//    public static void naturalSum(int i, int n, int sum) {
//        if(i==n) {
//            sum+=i;
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        naturalSum(i+1, n, sum);
//    }

//    Calculate Factorial
//    public static int calcFactorial(int n) {
//        if (n==1 || n==0) {
//            return 1;
//        }
//        int nm = calcFactorial(n-1);
//        int fact = n * nm;
//        return fact;
//    }

//    calculate Fibonacci sequence
//    public static void printFib(int a, int b, int n) {
//        if(n==0)
//            return;
//        int c = a + b;
//        System.out.println(c);
//        printFib(b, c, n-1);
//    }

//    Calculate x^n
//    public static int calcPower(int i, int n) {
//        if (n==0)
//            return 1;
//        if (i==0)
//            return 0;
//        int last_n = calcPower(i, n-1);
//        int pow = i * last_n;
//        return pow;
//    }

//    Calculate x^n using log(n)
    public static int calPow(int x, int n) {
        if (n==0)
            return 1;
        if (x==0)
            return 0;

        if (n % 2 == 0)
            return calPow(x, n/2) * calPow(x, n/2);
        else
            return calPow(x, n/2) * calPow(x, n/2) * x;
    }

    public static void main(String[] args) {

//        printNum(10);
//        naturalSum(1, 5, 0);
//        System.out.println(calcFactorial(5));

//        int a=0, b=1;
//        System.out.println(a);
//        System.out.println(b);
//        int n=10;
//        printFib(a, b, n-2);

//        System.out.println(calcPower(2,5));

        System.out.println(calPow(2,6));
    }
}