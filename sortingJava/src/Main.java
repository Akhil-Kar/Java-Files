public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 2, 3};

//        1. Bubble Sort
//        for(int i=0; i<arr.length-1; i++) {
//            for (int j=0; j< arr.length-i-1; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

//        2. Selection Sort
//        for(int i=0; i< arr.length-1; i++) {
//            int smallest = i;
//            for(int j = i+1; j< arr.length; j++) {
//                if(arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//            }
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }

//        3. Insertion Sort
//        for(int i=1; i< arr.length; i++) {
//            int current = arr[i];
//            int j = i-1;
//            while (j >= 0 && current < arr[j]) {
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current;
//        }

        for (int k = 0; k<arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}