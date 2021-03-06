package template.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() throws IOException {
        System.out.print("설탕과 우유를 추가하시겠습니까? (y/n) : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine();
        if (answer.toLowerCase().startsWith("y"))
            return true;
        else
            return false;
    }
}
