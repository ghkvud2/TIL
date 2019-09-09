package com.observer.talent.observer;

import com.observer.talent.subject.Subject;

public class Press implements Observer {

    private String press;
    private String name;
    private String place;
    private String date;
    private String content;
    private Subject talent;

    public Press(String press, Subject talent) {
        this.press = press;
        this.talent = talent;
        this.talent.register(this);
    }

    @Override
    public void update(String name, String place, String date, String content) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.content = content;
        doPress();
    }

    public void doPress() {
        System.out.println("[언론사] : " + this.press);
        System.out.println("[" + this.name + "] 스케쥴");
        System.out.println("[장소] : " + this.place);
        System.out.println("[날짜] : " + this.date);
        System.out.println("[내용] : " + this.content);
        System.out.println();
    }
}
