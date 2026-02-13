package com.example.demo.model;

import java.time.LocalDate;

public class LostItem {

    private Long id;
    private String name;
    private LocalDate dateFound;

    public LostItem() {
    }

    public LostItem(Long id, String name) {
        this.id = id;
        this.name = name;
        this.dateFound = LocalDate.now();
    }

    public LostItem(Long id, String name, LocalDate dateFound) {
        this.id = id;
        this.name = name;
        this.dateFound = dateFound;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateFound() {
        return dateFound;
    }

    public void setDateFound(LocalDate dateFound) {
        this.dateFound = dateFound;
    }
}
