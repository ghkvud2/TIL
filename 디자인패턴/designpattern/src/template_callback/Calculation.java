package template_callback;

public class Calculation {

    public Integer add(int num1, int num2, Calculator calculator) {
        return calculator.calculate(num1, num2);
    }

}
