package com.spring.templatecallback.template_callback.genericTemplate;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class LineCalculatorWithGeneric {

    public <T> T lineReadTemplate(String filePath, LineCallback<T> callback, T initVal) throws IOException {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line = null;
            T res = initVal;
            while ((line = br.readLine()) != null) {
                res = callback.doSomething(line, res);
            }
            return res;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public String concatenate(String filePath) throws IOException {
        LineCallback<String> concatenateCallback = new LineCallback<String>() {
            @Override
            public String doSomething(String line, String value) {
                return value + line;
            }
        };
        return lineReadTemplate(filePath, concatenateCallback, "");
    }

}
