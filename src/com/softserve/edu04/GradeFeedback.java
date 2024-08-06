package com.softserve.edu04;


public class GradeFeedback {
    public static void main(String[] args) {
        char grade = 'B';

        String feedback = switch (grade) {
            case 'A' -> "Excellent!";
            case 'B', 'C' -> {
                System.out.println("Grade is: " + grade);
                if (grade == 'B') {
                    yield "The result is \"Very good\"";
                }else{
                    yield "The result is \"Good\"";
                }

            }
            case 'D', 'E' -> "You passed exam";
            default -> "You failed to pass";
        };
        System.out.println(feedback);

    }
}
