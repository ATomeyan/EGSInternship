package homework13.parser;

import homework13.model.Person;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Artur Tomeyan
 */
public class JsonParser implements Parser {
    @Override
    public synchronized Object parser(File file) {

        JSONParser jsonParser = new JSONParser();

        Object object = new Object();

        try {
            object = jsonParser.parse(new FileReader(file));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        JSONObject jsonObject = (JSONObject) object;

        return new Person(
                jsonObject.get("id"),
                jsonObject.get("firstName"),
                jsonObject.get("lastName"),
                jsonObject.get("age"));
    }
}