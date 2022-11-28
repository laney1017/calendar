package com.example.calendar.dto;

// 1. Calendar 는 dto객체로 title, date을 String 형태로 저장합니다.
public class Calendar {

    public String title;

    public String date;

    public Calendar() {

    }

    public Calendar(String title, String date) {
        this.title = title;
        this.date = date;
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
}
