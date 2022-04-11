package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 4
        for (int i = 1; i <=30; i++){
            System.out.print(i + ": ");
            if (i % 3 == 0)
                System.out.print("ping ");
            if (i % 5 == 0)
                System.out.print("pong ");
            System.out.println();
        }
        System.out.println();

      // Задание 5
        int a1 = 0;
        int a2 = 1;
        int a3;
        System.out.println(a1);
        System.out.println(a2);
            for (int i = 0; i <=20; i++){
                a3 = a2;
                a2 += a1;
                a1 = a3;
                System.out.println(a2);
            }

    }
}

