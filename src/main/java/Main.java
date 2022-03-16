import business.StudentBusinessImpl;
import helper.Helper;
import model.Student;

import java.util.Optional;

public class Main {
    public static void main (String[] args){

        StudentBusinessImpl studentBusiness = new StudentBusinessImpl();
        Optional<Student> ldsStudent = studentBusiness.get("MOavvk");

        Helper.generateJson(ldsStudent);
    }
}
