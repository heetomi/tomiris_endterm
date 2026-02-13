package com.example.demo.patterns.factory;

import com.example.demo.model.LostItem;

public class DefaultLostItemCreator implements LostItemCreator {

    @Override
    public LostItem create(Long id, String name) {
        return new LostItem(id, name);
    }
}
