package com.spring.templatecallback.template_callback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Loader {

    @Autowired
    ResourceLoader resourceLoader;

    public String getPath(String fileName) throws IOException {
        return resourceLoader.getResource("classpath:" + fileName).getURI().getPath();
    }

}
