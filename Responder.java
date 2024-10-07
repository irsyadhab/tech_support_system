import java.util.Random;

public class Responder {

    private String[] defaultResponses = {
            "I'm sorry, I don't have an answer for that.",
            "Could you clarify your issue?",
            "This seems like a technical issue, please check your device.",
            "Have you tried restarting your system?",
            "I suggest updating your software to the latest version.",
            "Please contact support for more help."
    };

    public String generateResponse(String query) {
        // You can improve this logic to match specific keywords
        Random random = new Random();
        int responseIndex = random.nextInt(defaultResponses.length);
        return defaultResponses[responseIndex];
    }
}
