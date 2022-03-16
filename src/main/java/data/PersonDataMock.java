package data;

import enums.SexTypeEnum;
import model.Person;

public class PersonDataMock {

    static Person getProfessor(){
        Person javaProfessor = new Person();
        javaProfessor.setName("Soumaila A DIARRA");
        javaProfessor.setAge(27);
        javaProfessor.setSex(SexTypeEnum.MALE);

        return javaProfessor;
    }

    static Person getEpsiDirector(){
        Person director = new Person();
        director.setName("Alexis LE DRIEUX");
        director.setAge(57);
        director.setSex(SexTypeEnum.MALE);

        return director;
    }

    static Person getLdsDirector(){
        Person director = new Person();
        director.setName("Samy GUELMAN");
        director.setAge(32);
        director.setSex(SexTypeEnum.MALE);

        return director;
    }

    static Person getLdsHappyManager(){
        Person happyManager = new Person();
        happyManager.setName("Marine DELANOE");
        happyManager.setAge(37);
        happyManager.setSex(SexTypeEnum.FEMALE);

        return happyManager;
    }

    static Person getEpsiHappyManager(){
        Person happyManager = new Person();
        happyManager.setName("Nicolas CAISSO");
        happyManager.setAge(39);
        happyManager.setSex(SexTypeEnum.MALE);

        return happyManager;
    }
}
