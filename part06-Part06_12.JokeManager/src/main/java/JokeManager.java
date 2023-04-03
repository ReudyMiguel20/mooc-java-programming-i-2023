
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokesList;

    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        
        this.jokesList.add(joke);
    }

    public String drawJoke() {
        String jokesdewe = "";
        if (jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokesList.size());
            jokesdewe = jokesList.get(index);
        }
        return jokesdewe;
    }

    public void printJokes() {
        for (String joke : jokesList) {
            System.out.println(joke);
        }

    }
}
