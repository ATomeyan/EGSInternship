package homework8.parser;

import homework8.model.Person;

import java.io.File;

/**
 * @author Artur Tomeyan
 */
public interface Parser {

    Person parser(File file);
}