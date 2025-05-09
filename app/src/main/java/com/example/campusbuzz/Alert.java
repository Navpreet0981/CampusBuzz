package com.example.campusbuzz;
public class Alert {
    private String title;
    private String description;
    private String dateTime;
    private String author;
    private String department;

    // Constructor
    public Alert(String title, String description, String dateTime, String author, String department) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.author = author;
        this.department = department;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getAuthor() {
        return author;
    }

    public String getDepartment() {
        return department;
    }
}

