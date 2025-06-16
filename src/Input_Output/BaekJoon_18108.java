package Input_Output;

import java.util.Scanner;

public class BaekJoon_18108 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if(year>= 1000 && year<=3000) {

            System.out.print(year - 543);

        }

        else System.exit(0);

    }


}
