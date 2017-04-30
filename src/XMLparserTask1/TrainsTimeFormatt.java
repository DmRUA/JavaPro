package XMLparserTask1;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by DmRG on 27.02.2017.
 */
public class TrainsTimeFormatt extends XmlAdapter<String, LocalTime> {
    @Override
    public LocalTime unmarshal(String v) throws Exception {
        LocalTime localTime = LocalTime.parse(v);
        return localTime;
    }

    @Override
    public String marshal(LocalTime v) throws Exception {
        return v.toString();
    }
}
