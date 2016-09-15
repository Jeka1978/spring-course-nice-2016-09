package neveruseswitch;

import java.util.Random;

/**
 * Created by Jeka on 15/09/2016.
 */
public class DBUtils {

    public static int getMailCode() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
