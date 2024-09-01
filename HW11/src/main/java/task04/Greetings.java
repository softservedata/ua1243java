package task04;

import java.util.Random;

public enum Greetings {
    HELLO("Hello, %s %s! Nice to see you."),
    WELCOME("Welcome, %s %s! Hope you have a great day!"),
    NICE_TO_MEET("Nice to meet you, %s %s! How are you today?"),
    GREETINGS("Greetings, %s %s! Welcome aboard!"),
    GOOD_DAY("Good day, %s %s! How’s everything going?"),
    PLEASURE_TO_MEET("It's a pleasure to meet you, %s %s!"),
    HEY("Hey, %s %s! Glad you’re here!"),
    NICE_TO_SEE("Nice to see you, %s %s! Have a wonderful day!"),
    GOOD_TO_HAVE_YOU("Good to have you with us, %s %s!"),
    EXCELLENT("Excellent to see you, %s %s! Let’s have a great time!"),
    GLAD_TO_WELCOME("Glad to welcome you, %s %s!");

    private final String message;

    Greetings(String message) {
        this.message = message;
    }

    public static String getRandomGreeting(String firstName, String lastName) {
        Random random = new Random();
        Greetings [] greetings = Greetings.values();
        Greetings randomGreeting = greetings[random.nextInt(greetings.length)];
        return String.format(randomGreeting.message, firstName, lastName);
    }
}
