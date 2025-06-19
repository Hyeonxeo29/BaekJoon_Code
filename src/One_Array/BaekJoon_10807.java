package One_Array;

import java.util.Scanner;

public class BaekJoon_10807 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count =0;

        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int v = scanner.nextInt();

        for (int j : arr) {
            if (v == j) {
                count++;
            }
        }

        System.out.print(count);

    }
}
