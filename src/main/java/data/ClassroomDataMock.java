package data;

import enums.ClassroomEnum;
import helper.Helper;
import model.Classroom;
import java.util.Arrays;
import java.util.List;

public class ClassroomDataMock {

    public static List<Classroom> getList(){
        /*
        List<Classroom> classrooms = new ArrayList<>();
        classrooms.add(new Classroom("X8ldbU", "B4"));

         */

        return Arrays.asList(
                new Classroom("C3jrZ1", ClassroomEnum.B4, Helper.getDateNow()),
                new Classroom("X8ldbU", ClassroomEnum.B5, Helper.getDateNow())
        );
    }
}
