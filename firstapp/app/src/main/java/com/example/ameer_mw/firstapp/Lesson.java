package com.example.ameer_mw.firstapp;

/**
 * Created by Ameer_MW on 26/12/2016.
 */

public class Lesson {
    private  String subject;
    private  String title;
    private  String date;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Lesson() {
    }

    public Lesson(String subject, String title, String date) {
        this.subject = subject;
        this.title = title;
        this.date = date;
    }
}
