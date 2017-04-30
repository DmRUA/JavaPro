package JSONparser;

import JSON.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by DmRG on 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().create();
        try {
            JsonClass jsonclass = gson.fromJson(new FileReader(new File("C:\\Ruslan\\test\\json.json")),JsonClass.class );
            System.out.println(jsonclass);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
