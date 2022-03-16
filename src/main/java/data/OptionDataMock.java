package data;

import enums.OptionEnum;
import model.Option;

import java.util.Arrays;
import java.util.List;

public class OptionDataMock {

    public static Option getLdsOption() {
        return new Option("daQwGV", OptionEnum.DEVELOPER, ModuleDataMock.getList());
    }

    public static Option getEpsiOption() {
        return new Option("Pmnvpu", OptionEnum.DEVOPS, ModuleDataMock.getList());
    }

    public static List<Option> getList() {
        return Arrays.asList(
                getLdsOption(),
                getEpsiOption()
        );
    }
}
