package business;

import data.StudentDataMock;
import model.Classroom;
import model.Option;
import model.School;
import model.Student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class StudentBusinessImpl implements StudentBusiness{

    List<Student> students = StudentDataMock.getList();


    @Override
    public Optional<Student> get(String id) {
        // -- Loop 1
        /*
        for (int i = 0; i < students.size(); i++) {
            if (Objects.equals(students.get(i).getId(), id)) {
                return Optional.of(students.get(i));
            }
        }

        // -- Loop 2
        students.forEach(student -> Objects.equals(student.getId(), id));
        */

        return students.stream()
                .filter(student -> Objects.equals(student.getId(), id))
                .findFirst();
    }

    @Override
    public List<Student> getList() {
        return students;
    }

    @Override
    public Optional<Classroom> getClassroom(String id) {
        Optional<Student> student = students.stream()
                                  .filter(std -> Objects.equals(std.getId(), id))
                                  .findFirst();

        // student.isPresent() ? Optional.of(student.get().getClassroom()) : Optional.empty();

        return student.map(Student::getClassroom);
    }

    @Override
    public Optional<School> getSchool(String id) {
        Optional<Student> student = students.stream()
                .filter(std -> Objects.equals(std.getId(), id))
                .findFirst();

        return student.map(Student::getSchool);
    }

    @Override
    public Optional<Option> getOption(String id) {
        Optional<Student> student = students.stream()
                .filter(std -> Objects.equals(std.getId(), id))
                .findFirst();

        return student.map(Student::getOption);
    }
}
