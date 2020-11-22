package Exercise;

import java.util.Scanner;

public class MaxMinAvg {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println((-10.5) % 7.2 +"\t" + (-10.5) % (-7.2)   );

        Scanner s = new Scanner(System.in);
        int min,max,sum,x;
        double avg;

        x = s.nextInt();
        sum = min = max = x;
        for (int i = 2; i<=5; i++){
            x = s.nextInt();
            if (x > max) max = x;
            else if (x < min) min = x;
            sum += x;
        }
        avg = sum / 100.0;
        System.out.println("the lowest is " + min);
        System.out.println("the highest is " + max);
        System.out.println("the average is " + avg);

    }
}

