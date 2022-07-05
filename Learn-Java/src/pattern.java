import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= 4; j++) {
//                System.out.print("A");
//            }
//            System.out.print("\n");
//        }

//        2. Hollow Rectangle :
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number of Rows : ");
//        int r_num = sc.nextInt();
//        System.out.println("Enter Number of Columns : ");
//        int c_num = sc.nextInt();
//
//        for(int i = 1; i <= r_num; i++) {
//
//            for(int j = 1; j <= c_num; j++) {
//
//                if(i==1 || i==r_num || j==1 || j==c_num)
//                    System.out.print("A");
//                else
//                    System.out.print(" ");
//
//            }
//            System.out.println();
//
//        }

//        3. Half Pyramid :
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                for(int k=1; k<=5; k++) {
                    System.out.print("  ");
                }

                for(int k=1; k<=5; k++) {
                    System.out.print("X ");
                }

                System.out.println();
            }
            System.out.println();
        }

    }
}
