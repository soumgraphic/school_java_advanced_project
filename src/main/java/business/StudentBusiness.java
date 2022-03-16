package business;

import model.Classroom;
import model.Option;
import model.School;
import model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentBusiness {
    Optional<Student> get(String id);
    List<Student> getList();
    Optional<Classroom> getClassroom(String id);
    Optional<School> getSchool(String id);
    Optional<Option> getOption(String id);
}
