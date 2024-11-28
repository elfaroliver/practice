package Misc;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inntak = new Scanner(System.in,"UTF-8");
        // Forritið héðan
        int N = inntak.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // og hingað
    }
}
