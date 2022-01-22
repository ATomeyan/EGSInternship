package homework8.parser;

import homework8.model.Person;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @author Artur Tomeyan
 */
public class XMLParser implements Parser {

    @Override
    public Person parser(File file) {

        Person person = null;

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder;
        Document document = null;

        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert document != null;
        document.getDocumentElement().normalize();
        NodeList nodeList = document.getElementsByTagName("person");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                person = new Person(
                        Integer.parseInt(element.getElementsByTagName("id").item(i).getTextContent()),
                        element.getElementsByTagName("firstName").item(i).getTextContent(),
                        element.getElementsByTagName("lastName").item(i).getTextContent(),
                        Integer.parseInt(element.getElementsByTagName("age").item(i).getTextContent()));

            }
        }
        return person;
    }
}