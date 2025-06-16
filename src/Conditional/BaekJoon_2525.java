package Conditional;

import java.util.Scanner;

public class BaekJoon_2525 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int plusTime = scanner.nextInt();

        if( minute + plusTime >= 60){
            hour = hour + (minute+plusTime)/60;
            minute = (minute+plusTime)%60;
        }
        else{
            minute = minute + plusTime;
        }

        if (hour >= 24) {

            hour -= 24;

        }

        System.out.print(hour + " " + minute);

    }

}
