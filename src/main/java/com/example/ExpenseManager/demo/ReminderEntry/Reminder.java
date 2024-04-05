package com.example.ExpenseManager.demo.ReminderEntry;

import com.example.ExpenseManager.demo.categoryEntry.Category;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reminderId;
    private int amount;
    private String reason;

    @ManyToOne
    private Category category; // Many-to-One relationship with Category

    private Date reminderDate;
    private String username;
    private boolean done;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Reminder() {
        // Default constructor required by JPA
    }

    public Reminder(int reminderId, String username, int amount, String reason, Date reminderDate, Category category, boolean done) {
        this.reminderId = reminderId;
        this.username = username;
        this.amount = amount;
        this.reason = reason;
        this.reminderDate = reminderDate;
        this.category = category; // Set the category
        this.done = done;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}