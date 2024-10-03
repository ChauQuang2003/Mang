import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];


        System.out.println("Nhập các phần tử mảng 1 ");
        for (int i = 0; i < n; i++) {
            System.out.print("Các phần tử thứ " + (i + 1) + " là: ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Các phần tử mảng 1 sau khi nhập là: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập kích thước 2 là: ");
        int k = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Nhập các phần tử mảng 2 ");
        for (int i = 0; i < n; i++) {
            System.out.print("Các phần tử thứ " + (i + 1) + " là: ");
            arr2[i] = sc.nextInt();
        }
        System.out.print("Các phần tử mảng 2 sau khi nhập là: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }
        System.out.println("Gộp mảng ");
        int[] arr3 = new int[n + k];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n; i++) {
            arr3[i + k] = arr2[i];

        }
        for ( int i = 0; i < arr3.length; i++ ) {
            System.out.print(arr3[i] + " ");
        }
    }
}
