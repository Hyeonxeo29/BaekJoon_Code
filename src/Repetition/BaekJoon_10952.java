package Repetition;

import java.util.Scanner;

public class BaekJoon_10952 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a==0 && b==0){
                System.exit(0);
            }

            else System.out.println(a+b);

        }
    }
}
