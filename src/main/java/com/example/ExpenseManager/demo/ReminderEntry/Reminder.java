package com.example.ExpenseManager.demo.ReminderEntry;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reminderId;
    private String title;
    private String description;
    private Date reminderDate;

    public Reminder() {
        // Default constructor required by JPA
    }

    public Reminder(String title, String description, Date reminderDate
        //        , Category category
    ) {
        this.title = title;
        this.description = description;
        this.reminderDate = reminderDate;
        //this.category = category;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }
}
