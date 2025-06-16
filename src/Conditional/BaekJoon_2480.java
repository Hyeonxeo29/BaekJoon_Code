package Conditional;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_2480 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int fir = scanner.nextInt();
        int sec = scanner.nextInt();
        int trd = scanner.nextInt();

        ArrayList<Integer> sort = new ArrayList<Integer>();

        sort.add(fir);
        sort.add(sec);
        sort.add(trd);

        int prize = 0;

        int max = 0;


        if(fir==sec && sec == trd){

            prize = 10000 + fir*1000;

        } else if (fir == sec || fir == trd) {

            prize = 1000 + fir*100;

        } else if (sec == trd) {

            prize = 1000 + sec*100;

        }
        else {

            for( int i : sort ){
                max = Math.max(max, i);
                
                prize = max*100;
            }

        }
        
        System.out.print(prize);

    }

}

