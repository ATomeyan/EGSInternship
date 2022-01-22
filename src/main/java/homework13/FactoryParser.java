package homework13;

import homework13.parser.JsonParser;
import homework13.parser.XMLParser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

/**
 * @author Artur Tomeyan
 */
public class FactoryParser {

    private static final String JSON = "application/json";
    private static final String XML = "text/xml";

    public static Object getParser(File file) {

        String type = "";
        try {
            type = Files.probeContentType(Paths.get(file.getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }


        switch (Objects.requireNonNull(type)) {
            case XML:
                return new XMLParser().parser(file);
            case JSON:
                return new JsonParser().parser(file);
            default:
                throw new IllegalArgumentException();
        }
    }
}