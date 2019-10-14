package template_callback.legacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReader {


    public List<Integer> init() {
        return new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public Integer listReaderTemplate(List<Integer> numbers, ListReaderCallback callback) {

        int res = callback.doSomething(numbers);
        return res;
    }

    public Integer sum(List<Integer> numbers) {
        ListReaderCallback callback = new ListReaderCallback() {
            @Override
            public Integer doSomething(List<Integer> numbers) {
                int res = 0;
                for (int number : numbers)
                    res += number;
                return res;
            }
        };
        return listReaderTemplate(numbers, callback);
    }

    public Integer multiply(List<Integer> numbers) {
        ListReaderCallback callback = new ListReaderCallback() {
            @Override
            public Integer doSomething(List<Integer> numbers) {
                int res = 1;
                for (int number : numbers)
                    res *= number;
                return res;
            }
        };
        return listReaderTemplate(numbers, callback);
    }

}
