package template_callback;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculation addCalculation = new Calculation();
        System.out.println(addCalculation.add(5, 3, (num1, num2) -> num1 * num2));
        System.out.println(addCalculation.add(5, 3, (num1, num2) -> num1 + num2));
        System.out.println(addCalculation.add(5, 3, (num1, num2) -> num1 - num2));
        System.out.println(addCalculation.add(5, 3, (num1, num2) -> num1 / num2));
    }
}
