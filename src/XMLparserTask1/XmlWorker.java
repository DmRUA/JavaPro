package XMLparserTask1;

import Lesson1.task3.Save;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by DmRG on 26.02.2017.
 */
public class XmlWorker {

    public static void saveToXMLFile(Trains trains, File file) {
        try {
            JAXBContext jaxbC = JAXBContext.newInstance(Trains.class);
            Marshaller marSh = jaxbC.createMarshaller();
            marSh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marSh.marshal(trains, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Trains loadFromXMLFile(File file) {
        JAXBContext jaxbC = null;
        try {
            jaxbC = JAXBContext.newInstance(Trains.class);
            Unmarshaller unmarshaller = jaxbC.createUnmarshaller();
            Trains trains = (Trains) unmarshaller.unmarshal(file);
            Train.setCountTrain(trains.getTrainList().size());
            return trains;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}
