package prometeusLesson4Task1;

/**
 * Created by DmRG on 11.03.2017.
 */
public class Comparator {
    public int compare(int a, int b){
        if (a>b) {
            return 1;
        } else if (a == b){
            return 0;
        } else {
            return -1;
        }
    }

}