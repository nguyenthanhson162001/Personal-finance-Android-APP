package com.example.personalfinance.entity;

import java.util.List;

public class DateOfMonth {
    private int date;
    private String day;
    private List<Spending> spendings;

    public DateOfMonth() {
    }

    public DateOfMonth(int date, String day, List<Spending> spendings) {
        this.date = date;
        this.day = day;
        this.spendings = spendings;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<Spending> getSpendings() {
        return spendings;
    }

    public void setSpendings(List<Spending> spendings) {
        this.spendings = spendings;
    }
}