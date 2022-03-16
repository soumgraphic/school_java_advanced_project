package helper;

import com.google.gson.Gson;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Helper {

    /**
     * Convert localDate to date
     *
     * @return date now in Date type
     */
    public static Date getDateNow() {
        LocalDate currentLocalDate = LocalDate.now();
        return Date.from(currentLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static void generateJson(Object object) {
        Gson gson = new Gson();

        System.out.println(gson.toJson(object));
    }
}
