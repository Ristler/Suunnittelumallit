package facade;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JokeClient implements ApiClient {

    @Override
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException, ParseException {

        String joke;
        String json;
        URL url = new URL(urlString);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            json = content.toString();
        } finally {
            con.disconnect();
        }
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        joke = (String) jsonObject.get(attributeName);

        if(joke == null) {
            throw new IllegalArgumentException("Attribute not found: " + attributeName);
        }
        return joke;
    }
}