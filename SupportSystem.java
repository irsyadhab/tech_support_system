import java.util.Scanner;

public class SupportSystem {

    private InputReader reader;
    private Responder responder;

    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
    }

    public void start() {
        boolean finished = false;
        System.out.println("Welcome to the Tech Support System.");
        System.out.println("Please type your query. Type 'bye' to exit.");

        while (!finished) {
            String userInput = reader.getInput();

            if (userInput.equalsIgnoreCase("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(userInput);
                System.out.println(response);
            }
        }

        System.out.println("Thank you for using the Tech Support System. Goodbye!");
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
