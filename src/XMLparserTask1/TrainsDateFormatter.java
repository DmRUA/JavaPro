package XMLparserTask1;

import sun.util.resources.LocaleData;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by DmRG on 27.02.2017.
 */
public class TrainsDateFormatter extends XmlAdapter<String, LocalDate> {
    private DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.uuuu");

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        LocalDate localdate = LocalDate.parse(v, f);
        return localdate;
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")).toString();
    }
}
