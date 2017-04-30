package XMLYahooParser;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Created by DmRG on 28.02.2017.
 */
public class XmlDomParser {
    public static void printCurency(String xmlStr){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlStr);
            Element root = document.getDocumentElement();
            NodeList nodelist = root.getChildNodes();
            for (int i = 0; i < nodelist.getLength(); i++) {
                Node node = nodelist.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Currency pair: " + element.getElementsByTagName("Name").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("Rate: " + element.getElementsByTagName("Rate").item(0)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("------------------------------");

                    System.out.println("Currency pair: " + element.getElementsByTagName("Name").item(1)
                            .getChildNodes().item(0).getNodeValue());

                    System.out.println("Rate: " + element.getElementsByTagName("Rate").item(1)
                            .getChildNodes().item(0).getNodeValue());
                }
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
