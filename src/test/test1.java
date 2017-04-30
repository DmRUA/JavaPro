package test;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.Comparator;

/**
 * Created by DmRG on 28.02.2017.
 */
public class test1 {
    test1 test = new test1();

    public static void main(String[] args) {
        int data[] = {51, 5, 8, 10, 18, 22, 40, 51, 62, 80, 98};
        int numberToFind = 40;

        int border = (int) Math.floor(data.length/2);
        int current = border;
        int tmp = data[current];
        boolean f = false;
        do {
            if (tmp == numberToFind) {
                System.out.println(current);
                f = true;
                break;
            }
            if (numberToFind == data[current - border]) {
                int result = current-border;
                System.out.println(result);
                f = true;
                break;
            }

            if (numberToFind == data[current + border - 1]) {
                int result = current+border;
                System.out.println(result);
                f = true;
                break;
            }

            border = (int) Math.floor(border/2);
            if (tmp < numberToFind) {
                tmp = data[current + border];
                current += border;
            } else {
                tmp = data[current - border];
                current -= border;
            }
        } while (border != 0);
        if (!f)System.out.println(-1);
    }
}
