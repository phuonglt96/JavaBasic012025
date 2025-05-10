package Bai1_Array;

public class DemoArray2 {
    static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i]) {
                min = arr[i];
            }
        System.out.println(min);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a;
        a = new int[]{33, 3, 4, 5};
        min(a);// truyền mảng tới phương thức

        int[] b = {1, 2, 3, 4};
        System.out.println("Cac so chan trong mang la: ");
        // for each
        for (int j : b) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
