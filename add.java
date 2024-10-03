import java.util.Arrays;
import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử mảng thứ: " + (i + 1) + " là: ");
            arr[i] = sc.nextInt();

        }
        System.out.println("Mảng sau khi nhập là: ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập phần tử muốn thêm vào: ");
        int X = sc.nextInt();
        System.out.print("Nhập vị trí bạn muốn thêm ");
        int index = sc.nextInt();


        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Không thêm được vào mảng: ");
        } else {
            for(int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            } arr[index] = X;
            System.out.println("Mảng sau khi thêm là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}
