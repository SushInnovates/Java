import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class DailyCommit {
    public static void main(String[] args) {
        // Print today's date
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
        System.out.println("📅 Today is: " + today.format(formatter));

        // Random fun fact list
        String[] facts = {
            "Java was released in 1995.",
            "The JVM allows Java to be platform-independent.",
            "The word 'Java' comes from coffee!",
            "Java is used in Android development.",
            "The 'main' method is the entry point of Java programs."
        };

        // Pick a random fact
        Random rand = new Random();
        String fact = facts[rand.nextInt(facts.length)];
        System.out.println("💡 Fun fact: " + fact);
    }
}
