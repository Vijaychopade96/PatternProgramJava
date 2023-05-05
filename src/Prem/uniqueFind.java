package Prem;

public class uniqueFind {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 7, 9, 6, 2, 3, 1};
        for (int i = 0; i < arr.length; i++) {
            boolean count = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    count = true;
                    break;
                }
            }
            if (!count) {
                System.out.println(arr[i]);
            }
        }
    }
}
