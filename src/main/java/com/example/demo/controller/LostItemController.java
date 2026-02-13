package com.example.demo.controller;

import com.example.demo.model.LostItem;
import com.example.demo.service.LostItemDbService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class LostItemController {

    private final LostItemDbService service;

    public LostItemController(LostItemDbService service) {
        this.service = service;
    }

    @GetMapping
    public List<LostItem> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public LostItem getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public LostItem create(@RequestBody LostItem item) {
        return service.create(item);
    }

    @PutMapping("/{id}")
    public LostItem update(@PathVariable Long id, @RequestBody LostItem item) {
        return service.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
