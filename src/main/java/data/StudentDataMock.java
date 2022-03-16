package data;

import enums.DegreeTypeEnum;
import enums.SexTypeEnum;
import model.Student;

import java.util.Arrays;
import java.util.List;

public class StudentDataMock {

    static Student getLdsStudent() {
        Student studentLds = new Student();
        studentLds.setId("MOavvk");
        studentLds.setName("Pierre ARNAUD");
        studentLds.setAge(20);
        studentLds.setDegree(DegreeTypeEnum.MANAGER_OF_DIGITAL_STRATEGIC);
        studentLds.setClassroom(ClassroomDataMock.getList().get(0));
        studentLds.setSex(SexTypeEnum.MALE);
        studentLds.setOption(OptionDataMock.getLdsOption());
        studentLds.setSchool(SchoolDataMock.getLds());

        return studentLds;
    }

    static Student getEpsiStudent() {
        Student studentEpsi = new Student();
        studentEpsi.setId("lbZFBc");
        studentEpsi.setName("Alexis ZUERAS");
        studentEpsi.setAge(29);
        studentEpsi.setSex(SexTypeEnum.MALE);
        studentEpsi.setDegree(DegreeTypeEnum.IT_EXPERT);
        studentEpsi.setClassroom(ClassroomDataMock.getList().get(0));
        studentEpsi.setOption(OptionDataMock.getEpsiOption());
        studentEpsi.setSchool(SchoolDataMock.getEpsi());

        return studentEpsi;
    }

    public static List<Student> getList() {
        return Arrays.asList(
                getLdsStudent(),
                getEpsiStudent()
        );
    }

}
