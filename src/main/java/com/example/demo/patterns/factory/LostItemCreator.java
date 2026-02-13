package com.example.demo.patterns.factory;

import com.example.demo.model.LostItem;

public interface LostItemCreator {
    LostItem create(Long id, String name);
}
