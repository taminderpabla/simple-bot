import java.util.Scanner;

public class SimpleBot {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Learning Java: SimpleBot" +
                "\n--------------------------------------------------------------");
        // calling methods
        greetUser();
        userName();
        guessingAge();
        countToNumber();
        System.out.println("Time to test your programming knowledge.");
        miniQuizForUser();

        System.out.println("Congratulations, have a nice day!" +
                "\n--------------------------------------------------------------");
    }

    static void greetUser() {
        System.out.println("Hello! My name is SimpleBot. I was created in 2022.");
        System.out.println("What's your name? ");
    }

    static void userName() {
        String name = input.nextLine();
        System.out.println("You have a really cool name, " + name + "!\n");
    }

    static void guessingAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter the remainders after dividing your age by 3, 5 and 7: ");
        int rem3 = input.nextInt();
        int rem5 = input.nextInt();
        int rem7 = input.nextInt();
        // computation to determine user age
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "!\n");
    }

    static void countToNumber() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("See I can count to " + num + " easily\n");
    }

    static void miniQuizForUser() {
        System.out.println("Which is NOT an example of a programing language?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C#");
        System.out.println("4. TissueBox");
        System.out.println("Enter your answer: ");

        int userAnswer = input.nextInt();
        // checking if user entered correct answer
        if (userAnswer != 4) {
            System.out.println("Please, try again.\n");
            miniQuizForUser(); // calling quiz function after each incorrect response
        }
    }
} // end program