package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Google_KIckStart_R_D_AP_Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int x=1;
        while (t-- > 0) {
            int[][] matrix = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == 1 && j == 1) {
                        matrix[i][j] = 0;
                    } else {
                        matrix[i][j] = sc.nextInt();
                    }
                }
            }
            int[] cd = new int[5];
            Map<Integer, Integer> map = new HashMap<>();
            cd[1] = (Math.max(matrix[0][0], matrix[2][2]) - Math.min(matrix[0][0], matrix[2][2])) / 2;
            cd[1] = cd[1] + Math.min(matrix[0][0], matrix[2][2]);
            cd[2] = (Math.max(matrix[0][2], matrix[2][0]) - Math.min(matrix[0][2], matrix[2][0])) / 2;
            cd[2] = cd[2] + Math.min(matrix[0][2], matrix[2][0]);
            cd[3] = (Math.max(matrix[1][0], matrix[1][2]) - Math.min(matrix[1][0], matrix[1][2])) / 2;
            cd[3] = cd[3] + Math.min(matrix[1][0], matrix[1][2]);
            cd[4] = (Math.max(matrix[0][1], matrix[2][1]) - Math.min(matrix[0][1], matrix[2][1])) / 2;
            cd[4] = cd[4] + Math.min(matrix[0][1], matrix[2][1]);
            int max = 1;
            int value = 0;
            for (int i = 1; i <= 4; i++) {
                if (map.containsKey(cd[i])) {
                    map.replace(cd[i], map.get(cd[i]) + 1);
                    if (map.get(cd[i]) > max) {
                        value = cd[i];
                        max = map.get(cd[i]);
                    }
                } else {
                    map.put(cd[i], 1);
                }
            }
            long ans=max;
            if (matrix[0][1] - matrix[0][0] == matrix[0][2] - matrix[0][1])
                ans++;
            if (matrix[2][1] - matrix[2][0] == matrix[2][2] - matrix[2][1])
                ans++;
            if (matrix[1][0] - matrix[0][0] == matrix[2][0] - matrix[1][0])
                ans++;
            if (matrix[1][2] - matrix[0][2] == matrix[2][2] - matrix[1][2])
                ans++;


            System.out.println("Case #"+x+": " + ans);
            x++;


        }

    }
}