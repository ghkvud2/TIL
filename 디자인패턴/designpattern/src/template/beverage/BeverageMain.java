package template.beverage;

public class BeverageMain {

    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();

    }
}
