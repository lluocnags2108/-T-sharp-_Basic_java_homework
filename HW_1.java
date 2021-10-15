public class HW_1 {
    public static void main(String[] args) {
        int a = 0;
        int[] arr = { 2, 5, 3, 9, 15, 20, 1, 17 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int b = arr[j] - arr[i];
                if (b > a) {
                    a = b;
                }
            }
        }
        System.out.println("Maximum value of A[j] - A[i] with j > i in an array: " + a);
    }
}