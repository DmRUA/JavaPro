package XMLparserTask1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Created by DmRG on 26.02.2017.
 */
@XmlRootElement(name = "train")
public class Train {
    private String from;
    private String to;
    private LocalDate date;
    private LocalTime departure;
    private int numberTrain;
    private static int countTrain = 0;


    public Train(String from, String to, LocalDate date, LocalTime departure) {
        super();
        countTrain++;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
        numberTrain = countTrain;
    }

    public Train() {
        super();
        countTrain++;
    }

    @XmlAttribute (name = "id")
    public int getNumberTrain() {
        return numberTrain;
    }

    @XmlElement
    public String getFrom() {
        return from;
    }

    @XmlElement
    public String getTo() {
        return to;
    }

    @XmlElement
    @XmlJavaTypeAdapter(TrainsDateFormatter.class)
    public LocalDate getDate() {
        return date;
    }

    @XmlElement
    @XmlJavaTypeAdapter(TrainsTimeFormatt.class)
    public LocalTime getDeparture() {
        return departure;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public static void setCountTrain(int countTrain) {
        Train.countTrain = countTrain;
    }

    @Override
    public String toString() {
        return "Train{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", departure=" + departure +
                ", numberTrain=" + numberTrain +
                '}';
    }
}
