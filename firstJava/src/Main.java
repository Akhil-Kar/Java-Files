import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printFunc() {
        System.out.println("hello World!");
    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static float calc(float a, float b, String operator) {
        if(operator == "a") {
            return a + b;
        }
        else if(operator == "d") {
            return a / b;
        }
        else if (operator == "m") {
            return a * b;
        }
        else if (operator == "s") {
            return a - b;
        }
        return 0;
    }

    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        String name = new String("Akhil");
        String s_name = new String("Kar");
        System.out.println(name + " " + s_name);

        //CharAt
        //Take index start from 0 for printing character
        System.out.println(name.charAt(1));

        //length
        System.out.println(name.length());

        //replace
        String name_updated = name.replace("h", "g");
        System.out.println(name_updated);

        //substring
        String word = new String("This is the collection of strings");
        System.out.println(word.substring(2, 7));

        //Array -- list
        String[] fruit_list = new String[3];
        fruit_list[1] = "Apple";
        fruit_list[0] = "Banana";
        fruit_list[2] = "Mango";
        System.out.println(fruit_list[1]);
        System.out.println(fruit_list.length);

        Arrays.sort(fruit_list);
        System.out.println(fruit_list[1]);

        int[] fruit_price = {23, 54, 12};
        System.out.println(fruit_price[1]);*/

        //2D - Arrays
//        int[][] marks = {{12, 34, 52}, {22, 43, 26}};
//        System.out.println(marks[1][0]);

        //change able and non change able keywords
//        int age = 30;
//        age = 31;
//        age = 32;

        final float PI = 3.142F;
//        PI = 1.432F;

        //Operators
//        int num = 1;
////        num+=2;
//        System.out.println(num++);
//        System.out.println(num);
//        System.out.println(++num);

        /* Math functions
        Math.min(5,6) => 5
        Math.max(5,6) => 6
        Math.random() => some random value between 0 and 1 (output is in float)
        for int => (int)(Math.random()*100)
         */

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age_1 = sc.nextInt();
//        System.out.println(age_1);
//
//        float age_2 = sc.nextFloat();
//        System.out.println(age_2);

//        System.out.println("Enter your name : ");
//        String name = sc.next(); // For single word
//        System.out.println(name);

//        String sentance = sc.nextLine(); // For whole line
//        System.out.println(sentance);

//        int age = 3;
//        if(age > 18)
//            System.out.println("Adult");
//        else
//            System.out.println("non-Adult");

//        boolean isAdult = true;
//        if(!isAdult)
//            System.out.println("True");
//        else
//            System.out.println("False");
//        printFunc();
//        printName("Akhil Kar");
//
//        System.out.println(calc(56.89F, 34.76F, "a"));
//        System.out.println(calc(56.89F, 34.76F, "s"));
//        System.out.println(calc(56.89F, 34.76F, "m"));
//        System.out.println(calc(56.89F, 34.76F, "d"));

        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.print("Enter a Number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("Correct Answer!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Greater");
            } else if (userNumber < myNumber) {
                System.out.println("lesser");
            }
        }while (userNumber > 0);

    }
}