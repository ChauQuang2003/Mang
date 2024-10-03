import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần vào mảng: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Phần tử mảng thứ " + (i + 1) + " là: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi nhập ");
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i] + "");

        }
        System.out.println("Nhập mảng cần xóa");
        int X = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == X) {
                index_del = i;
                break;
            }
        }
        if (index_del != -1) {
            for (int i = index_del; i < N; i++) {
                arr[i] = arr[i - 1];
            }
            N--;
            System.out.println("Mảng sau khi xóa phần tử: ");
            for (int i = 0; i < N; i++) {
                System.out.println(arr[i] + "");

            }
            System.out.println();

        } else {
            System.out.println("Phần tử sau không tồn tại trong mảng ");
        }
    }
}
