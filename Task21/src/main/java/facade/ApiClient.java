package facade;
import org.json.simple.parser.ParseException;

import java.io.IOException;

public interface ApiClient {
    String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException, ParseException;
}
