package template_callback;

import template_callback.legacy.ListReader;
import template_callback.refactoring.ListReaderRefactoring;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        ListReader listReader = new ListReader();
        System.out.println(listReader.sum(numbers));
        System.out.println(listReader.multiply(numbers));

        ListReaderRefactoring listReaderRefactoring = new ListReaderRefactoring();
        System.out.println(listReaderRefactoring.sum(numbers));
        System.out.println(listReaderRefactoring.mumltiply(numbers));
    }
}
