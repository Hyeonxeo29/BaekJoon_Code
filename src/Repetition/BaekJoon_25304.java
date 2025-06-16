package Repetition;

import java.util.Scanner;

public class BaekJoon_25304 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long all = scanner.nextLong();
        int n = scanner.nextInt();

        int result = 0;

        for(int i =0; i<n; i++){

            int price = scanner.nextInt();
            int num = scanner.nextInt();

            result += (price*num);

        }

        if(result == all){
            System.out.println("Yes");
        }

        else  System.out.println("No");
    }

}
