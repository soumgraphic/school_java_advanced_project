package data;

import model.Module;

import java.util.Arrays;
import java.util.List;

public class ModuleDataMock {

    public static List<Module> getList(){
        return Arrays.asList(
                new Module("I1kw69", "Advanced java", PersonDataMock.getProfessor()),
                new Module("F9Hp4e", "REST API with NodeJS", PersonDataMock.getProfessor()),
                new Module("RAEXJO", "Software documentation", PersonDataMock.getProfessor())
        );
    }
}
