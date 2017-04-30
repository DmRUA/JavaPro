package XMLparserTask1;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by DmRG on 26.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        Trains trains = new Trains();
        trains.addTrain(new Train("Kiev", "Lviv", LocalDate.of(2017, Month.JUNE, 10), LocalTime.of(22, 15)));
        trains.addTrain(new Train("Kharkov", "Kiev", LocalDate.of(2014, Month.AUGUST, 15), LocalTime.of(12, 15)));
        trains.addTrain(new Train("Vilnus", "Lviv", LocalDate.of(2014, Month.JUNE, 11), LocalTime.of(10, 11)));
        trains.addTrain(new Train("Poltava", "Odessa", LocalDate.of(2014, Month.JUNE, 7), LocalTime.of(8, 11)));
        XmlWorker.saveToXMLFile(trains, new File("C:\\Ruslan\\test\\xmlTrains.xml"));


        Trains trainsTwo = XmlWorker.loadFromXMLFile(new File("C:\\Ruslan\\test\\xmlTrains.xml"));
        trainsTwo.addTrain(new Train("London", "NewYork", LocalDate.of(2017, Month.SEPTEMBER, 5), LocalTime.of(20, 00)));
        System.out.println(trainsTwo);
        trainsTwo.printInfo(LocalDate.of(2017, Month.JUNE, 10), LocalTime.of(21, 40), LocalTime.of(23, 00));
        trainsTwo.printInfo(LocalDate.of(2017, Month.SEPTEMBER, 5), LocalTime.of(18, 00), LocalTime.of(20, 01));
    }
}
