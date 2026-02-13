package com.example.demo.patterns.builder;

import com.example.demo.model.LostItem;
import com.example.demo.patterns.builder.LostItemBuilder;
import java.time.LocalDate;

public class LostItemBuilder {

    private Long id;
    private String name;
    private LocalDate dateFound;

    public LostItemBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public LostItemBuilder name(String name) {
        this.name = name;
        return this;
    }

    public LostItemBuilder dateFound(LocalDate dateFound) {
        this.dateFound = dateFound;
        return this;
    }

    public LostItem build() {
        return new LostItem(id, name, dateFound);
    }
}
