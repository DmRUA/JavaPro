package XMLparserTask1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmRG on 26.02.2017.
 */
@XmlRootElement
public class Trains {
    @XmlElement(name = "train")
    private List<Train> trainList = new ArrayList<>();

    public Trains() {
        super();
    }

    public void addTrain(Train train) {
        trainList.add(train);
    }

    public List<Train> getTrainList() {
        return trainList;
    }

    public void printInfo(LocalDate localdate, LocalTime localTimeBegin, LocalTime localTimeEnd) {
        boolean f = false;
        for (Train train : trainList) {
            if (train.getDate().isEqual(localdate)) {
                if (train.getDeparture().isAfter(localTimeBegin) && train.getDeparture().isBefore(localTimeEnd)) {
                    System.out.println("-------------------------------");
                    System.out.println("Список поездов, по указанным параметрам" + " Дата:" + localdate + " Время от:" + localTimeBegin + " до:" + localTimeEnd);
                    System.out.println(train);
                    f = true;
                }
            }
        }
        if (!f) {
            System.out.println("Нету подходящих поездов в заданом промежутке времени");
        }
    }

    @Override
    public String toString() {
        return "Trains{" +
                "trainList=" + trainList +
                '}';
    }
}
