package Repetition;

import java.io.*;

public class BaekJoon_2439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i<n; i++){
            for(int j = 1; j<n-i;j++) {
                bw.write(" ");
            }
            for(int k=0; k<=i;k++){
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

}
