package com.example.demo.service;

import com.example.demo.model.LostItem;
import com.example.demo.repository.LostItemRepository;
import org.springframework.stereotype.Service;
import com.example.demo.patterns.factory.DefaultLostItemCreator;
import com.example.demo.patterns.factory.LostItemCreator;

import java.util.List;

@Service
public class LostItemDbService {

    private final LostItemRepository repository;
    private final LostItemCreator creator = new DefaultLostItemCreator();

    public LostItemDbService(LostItemRepository repository) {
        this.repository = repository;
    }

    public List<LostItem> getAll() {
        return repository.findAll();
    }

    public LostItem getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void create(LostItem item) {
        repository.create(item);
        LostItem factoryItem = creator.create(null, "Factory Item");
    }

    public void update(Long id, LostItem item) {
        repository.update(id, item);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
