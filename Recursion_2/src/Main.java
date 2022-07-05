public class Main {
//    1. Tower of Hanoi
//    public static void TOH(int n, String src, String helper, String dest) {
//        if (n == 1) {
//            System.out.println("Transfer disk : "+n+" from "+src+" to "+dest);
//            return;
//        }
//        TOH(n-1, src, dest, helper);
//        System.out.println("Transfer disk : "+n+" from "+src+" to "+dest);
//        TOH(n-1, helper, src, dest);
//    }

//    2. String printing in reverse
//    public static void printRev(String str, int idx) {
//        if (idx == 0) {
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printRev(str, idx-1);
//    }

//    3. Find first and last occurrence of element in a given String / find the index
//    public static int first = -1;
//    public static int last = -1;
//
//    public static void findOccurence(String str, int idx, char element) {
//        if (idx == str.length()) {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (currChar == element) {
//            if (first == -1)
//                first = idx;
//            else
//                last = idx;
//        }
//        findOccurence(str, idx+1, element);
//    }

//    4. Check if array is sorted or not(Strictly increasing)
//    public static boolean checkSort(int arr[], int idx) {
//        if (idx == arr.length-1)
//            return true;
//        if (arr[idx] >= arr[idx+1])
//            return false;
//        return checkSort(arr, idx+1);
//    }

//    5. Move all 'x' from string to back
    public static void moveX(String givenStr, int idx, int count, String newStr) {
        if (idx == givenStr.length()) {
            for (int i = 1; i<= count; i++) {
                newStr +='x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = givenStr.charAt(idx);
        if (currChar == 'x') {
            count+=1;
        } else {
            newStr += currChar;
        }
        moveX(givenStr, idx+1, count, newStr);
    }

    public static void main(String[] args) {
//        int i = 4;
//        TOH(i, "S", "H", "D");

//        String str = "Akhil";
//        printRev(str, str.length()-1);

//        String s = "abbaaadhsbabaah";
//        findOccurence(s, 0, 'b');

//        int arr[] = {1, 3, 5, 7};
//        System.out.println(checkSort(arr, 0));

        String str = "axggxxsdxf";
        moveX(str, 0, 0, "");

//        1:02
    }
}