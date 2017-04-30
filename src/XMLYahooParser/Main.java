package XMLYahooParser;

import java.io.IOException;

/**
 * Created by DmRG on 28.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";
        XmlDomParser.printCurency(request);

    }
}
