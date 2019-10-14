package template_callback.refactoring;

import java.util.List;

public class ListReaderRefactoring {

    public Integer listReaderTemplate(List<Integer> numbers, ListReaderCallbackWithRefactoring callback, int initValue) {
        int res = initValue;
        for (int num : numbers)
            res = callback.doSomething(num, res);
        return res;
    }

    public Integer sum(List<Integer> numbers) {
        ListReaderCallbackWithRefactoring callback = new ListReaderCallbackWithRefactoring() {
            @Override
            public Integer doSomething(int value, int initValue) {
                return value + initValue;
            }
        };
        return listReaderTemplate(numbers, callback, 0);
    }


    public Integer mumltiply(List<Integer> numbers) {
        ListReaderCallbackWithRefactoring callback = new ListReaderCallbackWithRefactoring() {
            @Override
            public Integer doSomething(int value, int initValue) {
                return value * initValue;
            }
        };
        return listReaderTemplate(numbers, callback, 1);
    }

}
