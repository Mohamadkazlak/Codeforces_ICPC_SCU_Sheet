package problem_15;

import java.util.Scanner;

public class problem_o {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        for(int i = n; i > 0; i--) {

            for(int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
