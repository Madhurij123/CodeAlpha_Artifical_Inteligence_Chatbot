import java.util.Scanner;

public class ChatBot {

    public static String getResponse(String input) {

        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }

        if (input.contains("name")) {
            return "I am a Java AI ChatBot.";
        }

        if (input.contains("java")) {
            return "Java is a popular object-oriented programming language.";
        }

        if (input.contains("bye")) {
            return "Goodbye! Have a great day.";
        }

        return "Sorry, I don't understand that question.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("AI ChatBot Started (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}