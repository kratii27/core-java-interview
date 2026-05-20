package com.rays.javabasic;

public class EvenOdd {

    public static void main(String[] args) {

        int num = 10;
        int eventCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (num > 0){
            if (num % 2 == 0){
                eventCount++;
                evenSum = evenSum + num;
            } else {
                oddCount++;
                oddSum = oddSum + num;
            }
            num--;
        }

        int evenAverage = evenSum/eventCount;
        System.out.println(evenAverage);

        int oddAverage = oddSum/oddCount;
        System.out.println(oddAverage);

    }
}
