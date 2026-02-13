package com.example.demo.service;

import com.example.demo.model.LostItem;
import com.example.demo.repository.LostItemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class LostItemDbService {

    private final LostItemRepository repository;

    public LostItemDbService(LostItemRepository repository) {
        this.repository = repository;
    }

    public List<LostItem> findAll() {
        return repository.findAll();
    }

    public LostItem findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found: " + id));
    }

    public LostItem create(LostItem item) {
        return repository.create(item);
    }

    public LostItem update(Long id, LostItem item) {
        return repository.update(id, item);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}