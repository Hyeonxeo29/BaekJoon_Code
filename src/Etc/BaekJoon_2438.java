package Etc;

import java.util.Scanner;

public class BaekJoon_2438 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i=0; i<num; i++){
            for (int j =0; j<=i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
