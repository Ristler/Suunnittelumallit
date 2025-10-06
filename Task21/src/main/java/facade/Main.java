package facade;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        ApiClient jokeClient = new JokeClient();
        System.out.println(jokeClient.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value"));

    }
}
