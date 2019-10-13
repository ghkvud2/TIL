package com.spring.templatecallback;

import com.spring.templatecallback.template_callback.Loader;
import com.spring.templatecallback.template_callback.bufferedReaderTemplate.BufferedReaderCalculator;
import com.spring.templatecallback.template_callback.genericTemplate.LineCalculatorWithGeneric;
import com.spring.templatecallback.template_callback.lineTemplate.LineCalculator;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URISyntaxException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TemplatecallbackApplicationTests {

    @Autowired
    Loader loader;
    @Autowired
    LineCalculator lineCalculator;
    @Autowired
    BufferedReaderCalculator bufferedReaderCalculator;
    @Autowired
    LineCalculatorWithGeneric lineCalculatorWithGeneric;

    String filePath;

    @Before
    public void setUp() {
        try {
            filePath = loader.getPath("numbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void sumOfNumbersWithBufferedReader() throws IOException, URISyntaxException {
        Assert.assertThat(bufferedReaderCalculator.calcSum(this.filePath), Is.is(55));
    }

    @Test
    public void multiplyOfNumbersWithBufferedReader() throws IOException, URISyntaxException {
        Assert.assertThat(bufferedReaderCalculator.calcMultiply(this.filePath), Is.is(3628800));
    }


    @Test
    public void sumOfNumbersWithLine() throws IOException, URISyntaxException {
        Assert.assertThat(lineCalculator.calcSum(this.filePath), Is.is(55));
    }

    @Test
    public void multiplyOfNumbersWithLine() throws IOException, URISyntaxException {
        Assert.assertThat(lineCalculator.calcMultiply(this.filePath), Is.is(3628800));
    }

    @Test
    public void concateStrings() throws IOException {
        Assert.assertThat(lineCalculatorWithGeneric.concatenate(this.filePath), Is.is("12345678910"));
    }

}
