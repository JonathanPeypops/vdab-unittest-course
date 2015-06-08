package com.realdolmen;

public class Calculator {
    private int answer;

    public Calculator() {
    }

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);

        }
        if (numbers.startsWith("//")) {
            String[] nrstring = numbers.substring(4,numbers.length()).split(numbers.valueOf(numbers.charAt(2))+ "|\n");
            for (int i = 0; i < nrstring.length; i++) {
                answer = answer + Integer.parseInt(nrstring[i]);
            }
        }else{
            String[] numberstring = numbers.split(",| |\n");
            for (int i = 0; i < numberstring.length; i++) {
                answer = answer + Integer.parseInt(numberstring[i]);
            }
        }return answer;
    }
}
