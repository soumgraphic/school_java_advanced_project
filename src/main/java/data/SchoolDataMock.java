package data;

import model.Classroom;
import model.School;

import java.util.Arrays;
import java.util.List;

public class SchoolDataMock {

    public static School getLds() {
        return new School(
                "cQ5nwC",
                "La DIGITAL SCHOOL",
                PersonDataMock.getLdsDirector(),
                PersonDataMock.getLdsHappyManager(),
                ClassroomDataMock.getList(),
                List.of(OptionDataMock.getLdsOption())
        );
    }

    public static School getEpsi() {
        return new School(
                "EOqOPV",
                "EPSI",
                PersonDataMock.getEpsiDirector(),
                PersonDataMock.getEpsiHappyManager(),
                ClassroomDataMock.getList(),
                List.of(OptionDataMock.getLdsOption())
        );
    }

    public static List<School> getList() {
        return Arrays.asList(
                getLds(),
                getEpsi()
        );
    }
}
