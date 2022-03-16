package business;

import model.Classroom;
import model.Option;
import model.School;
import model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentBusiness {
    /**
     * Get student by id
     *
     * @param id student identifiant
     * @return Student find by id
     */
    Optional<Student> get(String id);

    /**
     * Get student list
     *
     * @return list of students
     */
    List<Student> getList();
    Optional<Classroom> getClassroom(String id);
    Optional<School> getSchool(String id);
    Optional<Option> getOption(String id);
}
