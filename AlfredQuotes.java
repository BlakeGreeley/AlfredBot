import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        return "Hello! It's nice to great you today, I hope you've had a good day.";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s it is nice to make your acquaintance.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format("It is currenty %s", new Date());
    }
    
    public String respondBeforeAlexis(String phrase) {
        if(phrase.indexOf("Alexis") > -1) {
            return "She's a waste, how can I help instead?";
        }

        if(phrase.indexOf("Alfred") > -1) {
            return "Here to please Sir, What can I do for you today?";
        }

        return "If thats all, I will deactivate for the evening?";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

