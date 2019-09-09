package com.observer.talent.subject;

import com.observer.talent.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Talent implements Subject {

    private String name;
    private String place;
    private String date;
    private String content;
    private List<Observer> observers = new ArrayList<>();

    public Talent(String name) {
        this.name = name;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.removeIf(o -> o == observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, place, date, content);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMeasurement(String place, String date, String content) {
        this.place = place;
        this.date = date;
        this.content = content;
        notifyObservers();
    }
}
