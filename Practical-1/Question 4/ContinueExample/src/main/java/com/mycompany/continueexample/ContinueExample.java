package com.mycompany.continueexample;
public class ContinueExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x + "\n");
        }
        System.out.print("I'm out of the Loop now");
    }
}

