public class Main {
    public static void main(String[] args) {
//        ###=====Get Bit=====###
//        1. Bitmask: 1 << position
//        2. And operation between bitmask and Given Number
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;
//        if ((bitMask & n) == 0) {
//            System.out.println("Bit is Zero");
//        } else {
//            System.out.println("Bit is non-zero");
//        }

//        ###=====Set Bit=====###
//        1. Bitmask: 1 << position
//        2. OR operation between bitmask and Given Number
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);

//        ###=====Clear Bit=====###
//        1. Bitmask: 1 << position
//        2. AND operation between NOT of bitmask (~bitMask) and Given Number
//        int newNumber = ~bitMask & n;
//        System.out.println(newNumber);

//        ###=====Update Bit=====###
//        1. For 0 -> 1 use Set Bit
//        2. For 1 -> 0 use Clear Bit
    }
}