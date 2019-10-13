package com.spring.templatecallback.template_callback.genericTemplate;

public interface LineCallback<T> {
    T doSomething(String line, T value);
}
