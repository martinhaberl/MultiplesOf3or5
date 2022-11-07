package de.martinhaberl;

public class Solution {
    public int solution(int number) {

        if (number < 0) {
            return 0;
        }

        return sumMultiplesOf3and5(number);
    }

    private static int sumMultiplesOf3and5(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 15 == 0) {
                sum += i;

            } else if (i % 5 == 0) {
                sum += i;

            } else if (i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
